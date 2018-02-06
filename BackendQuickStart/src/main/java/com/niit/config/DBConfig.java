package com.niit.config;

import java.util.Properties;
import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.dao.*;
import com.niit.model.*;

@Configuration
@ComponentScan("com.niit")
@EnableTransactionManagement
public class DBConfig 
{
    		public DataSource getH2DataSource()
    		{
    			DriverManagerDataSource dataSource = new  DriverManagerDataSource();
    			
    			dataSource.setDriverClassName("org.h2.Driver");
    			dataSource.setUrl("jdbc:h2:tcp://localhost/~/Saurabh");
    			dataSource.setUsername("dteja");
    			dataSource.setPassword("dteja");
    			
    			System.out.println("-------->  Data Source is now operational  <---------");
    			return dataSource;
    		}
    		
    		@Bean(name="sessionFactory")
    		public SessionFactory getSessionFactory()
    		{
    				Properties hibernateProp = new Properties();
    				
    				hibernateProp.setProperty("hibernate.hbm2ddl.auto","update");
    				hibernateProp.put("hibernate.dialect","org.hibernate.dialect.H2Dialect");
    				
    				LocalSessionFactoryBuilder factoryBuilder = new LocalSessionFactoryBuilder(getH2DataSource());
    				factoryBuilder.addAnnotatedClass(Category.class);
    				factoryBuilder.addProperties(hibernateProp);
    				
    				// The LocalSessionFactoryBuilder object which, is responsible for creating a bean object of the entire 
    				// active session between the application's external user interface and the H2 Database in the back-end, is taking
    				// into its body, the H2 DataSource and the Hibernate orm properties of hbm auto update and the orm H2 dialect
    				// that will translate a java based Spring bean data object in the dialect of H2 Database via orm of Hibernate
    				// during an ongoing session in real-time!!
    				
    				System.out.println(" * * * * * Session Factory Bean has just been initalized * * * * * ");
    				return factoryBuilder.buildSessionFactory();
    		}
    		
    		@Bean(name="categoryDAO")
    		public CategoryDAO getCategoryDAO()
    		{
    				System.out.println("+++++ Do database manipulation of Category as CatogoryDAO has been enabled now!! +++++");
    			    return new CategoryDAOImplement();
    		}
    		
    		@Bean(name="transTunnel")
    		public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
    		{
    			System.out.println("(   (  ( (Transaction Tunnel has been opened for a Synchronized committed transaction with the H2 Database) )  )   )");
    			return new HibernateTransactionManager(sessionFactory);
    		}
}
