package G26.Spring_JDBC_G26;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import Dao.Student_Dao;
import Dao.Student_Dao_JDBC;
import Entity.Student;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        String url="jdbc:mysql://127.0.0.1:3306/G26_db";
//        String user="root";
//        String pass="root";
//        DriverManagerDataSource dmds=new DriverManagerDataSource(url, user, pass);
//        JdbcTemplate t = new JdbcTemplate(dmds);
//        ApplicationContext ac=new ClassPathXmlApplicationContext("App_Config.xml");
    	ApplicationContext ac= new AnnotationConfigApplicationContext(Config.App_Config.class);
    	
//    	JdbcTemplate t=(JdbcTemplate) ac.getBean("template");
//        String query="insert into Students(rollnumber,name,age) values(?,?,?)";
//        t.update(query,51,"newStudent 2",25);
//        Student s=new Student(53,"dao_Student",23);
        Student_Dao sd=(Student_Dao) ac.getBean("student_dao");
//        sd.insert_Student(s);
        Student s=sd.getStudent(1);
        System.out.println(s.getName());
        
        List<Student> li=sd.get_All_Students();
        for(Student s1:li) {
        	System.out.println(s1.getRollnumber()+" "+s1.getName()+" "+s1.getAge());
        }
        
        System.out.println("executed sucessfully");
        
    }
}
