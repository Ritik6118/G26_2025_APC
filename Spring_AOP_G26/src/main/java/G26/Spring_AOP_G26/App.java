package G26.Spring_AOP_G26;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext ac= new ClassPathXmlApplicationContext("Spring_Config.xml");
    	Service s=(Service) ac.getBean("service");
    	s.fun1();
//        System.out.println( "Hello World!" );
    }
}
