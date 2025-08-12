package Lec_30;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("Spring-Config.xml");
		
//		Student s=new Student(new Laptop(new Processor()),new Address());
//		System.out.println(s.address);
//		System.out.println(s.laptop);
		Student s=(Student) ac.getBean("student");  // default scope -> singleton   and we can set it to prototype if we want to get new objects everytime we ask container for it
		Student s2=(Student) ac.getBean("student");
		
		System.out.println(s);
		System.out.println(s2);
		
		
//		System.out.println(s.getAddress());
//		System.out.println(s.getLaptop());
//		System.out.println(s.getName());
		
	}

}
