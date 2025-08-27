package G26.Hibernate_G26;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import Entity.Address;
import Entity.Answer;
import Entity.Employees;
import Entity.Projects;
import Entity.Question;
import Entity.Student;
import Entity.User;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Configuration cf=new Configuration();  
    	cf.configure("hiber.cfg.xml");   		// loading configurations
    	
    	SessionFactory sf=cf.buildSessionFactory();   // building session factory
    	
//    	Session s=sf.openSession();  // open session
    	
//    	s.beginTransaction();       // begin Transaction
    	
    	
//    	Address ad=new Address("fno.101","Faridabad","Haryana");  // creating an object that is being used by an entity
//    	Student st= new Student(1,"ritik",25,ad);    // creating object of a entity class
    	
//    	s.persist(st);                       // method to create new entry
    	
//    	st.setName("Ankit");
    	
    	
    	// update
//    	s.update(st);  // depricated
//    	s.merge(st);
//    	s.saveOrUpdate(st); //depricated
    	
    	
    	// delete
    	
//    	s.delete(st);   //depricated
//    	s.remove(st);   
    	
    	
    	// read/ get
    	
//    	Student st2=s.get(Student.class, 2);
//    	
//    	System.out.println(st2.getName()+" "+st2.getAddress()+" "+st2.getAddress().getStreet());
//    	
//    	s.getTransaction().commit();        // commiting the transaction
//    	
//    	s.close();							// closing session
    	
    	
    	
    	// one to one demo
    	
//    	Session s=sf.openSession();
//    	s.beginTransaction();
//    	Answer a=new Answer(2,"Ritik");
//    	Question q=new Question(2, "What is ur Name?", a);
//    	a.setQuestion(q);
//    	s.persist(a);
//    	s.persist(q);
//    	
//    	s.getTransaction().commit();
//    	s.close();
    	
    	// ont to many -> employee to project and Many to one -> project to employee
    	
    	
//    	Session s =sf.openSession();
//    	s.beginTransaction();
//    	Employees e1=new Employees(1,"ankit",new ArrayList<>());
//    	Employees e2=new Employees(2,"gaurav",new ArrayList<>());
//    	
//    	Projects p1=new Projects(1, "this is project 1", e1);
//    	Projects p2=new Projects(2, "this is project 2", e1);
//    	Projects p3=new Projects(3, "this is project 3", e2);
//    	Projects p4=new Projects(4, "this is project 4", e2);
//    	Projects p5=new Projects(5, "this is project 5", e1);
//    	
//    	
////    	List<Project> li=e1.getProjects();
////    	li.add(p1);
//    	
//    	
//     	e1.getProjects().add(p1);
//    	e1.getProjects().add(p2);
//    	e1.getProjects().add(p5);
//    	e2.getProjects().add(p3);
//    	e2.getProjects().add(p4);
//    	
//    	s.persist(e1);
//    	s.persist(e2);
//    	s.persist(p1);
//    	s.persist(p2);
//    	s.persist(p3);
//    	s.persist(p4);
//    	s.persist(p5);
//    	
//    	s.getTransaction().commit();
//    	
//    	s.close();
    	
    	Session s=sf.openSession();
    	User u1=new User(1,"User 1",new ArrayList<>());
    	User u2=new User(2,"User 2",new ArrayList<>());
    	User u3=new User(3,"User 3",new ArrayList<>());
    	User u4=new User(4,"User 4",new ArrayList<>());
    	User u5=new User(5,"User 5",new ArrayList<>());
    	
//    	u1--> u2,u3
    	u1.getFriends().add(u2);
    	u1.getFriends().add(u3);
    	
//    	u2-->u1,u4,u5
    	u2.getFriends().add(u1);
    	u2.getFriends().add(u4);
    	u2.getFriends().add(u5);
    	
//    	u3-->u1
    	u3.getFriends().add(u1);
    	
//    	u4-->u5,u2
    	u4.getFriends().add(u2);
    	u4.getFriends().add(u5);
    	
//    	u5-->u4
    	u5.getFriends().add(u4);
    	
    	
    	s.beginTransaction();
    	
    	
    	// create
    	
//    	s.persist(u1);
//    	s.persist(u2);
//    	s.persist(u3);
//    	s.persist(u4);
//    	s.persist(u5);
    	
    	// update
    	s.merge(u1);
    	s.merge(u2);
    	s.merge(u3);
    	s.merge(u4);
    	s.merge(u5);
    	
    	s.getTransaction().commit();
    	s.clear();
    	
    	
        System.out.println( "Program Executed" );
    }
}
