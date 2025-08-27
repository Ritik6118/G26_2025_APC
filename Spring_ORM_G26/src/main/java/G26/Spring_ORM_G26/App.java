package G26.Spring_ORM_G26;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import Dao.Student_Dao;
import Entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
//    	"home"="vacation"
    	
    	ApplicationContext ac= new ClassPathXmlApplicationContext("Spring_Config.xml");
    	
    	Student s= new Student (2,"ritik",25);
    	Student_Dao sd= (Student_Dao) ac.getBean("studentdao");
    	
    	sd.insert(s);
    	
//        System.out.println( "Hello World!" );
    }
}
