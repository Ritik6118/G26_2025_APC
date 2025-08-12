package lec_29;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("Spring-Config.xml");
		
//		Student s=new Student(new Laptop(new Processor()),new Address());
//		System.out.println(s.address);
//		System.out.println(s.laptop);
		Student s=(Student) ac.getBean("student");
	}

}
