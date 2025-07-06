package Lec_03;

public class ClassRoom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("breakpoint 1");
		Student s1=new Student("ankit",10,"cse");
//		s1.name="ankit";
////		s1.rollnumber=1;
//		s1.knowledge=10;
//		s1.dept="cse";
		Student s2=new Student();
		s2.name="gaurav";
//		s2.rollnumber=2;
		s2.knowledge=20;
		s2.dept="cse";
		
//		s1.introduce();
//		s2.introduce();
		
		System.out.println(s1.knowledge);
		s1.study();
		System.out.println(s1.knowledge);
		
		s1.teach(s2);
		System.out.println(s1.knowledge);
		
		s1.giveExam();
		
		System.out.println(s1.rollnumber()+" "+s2.rollnumber());
	}
	static {
		System.out.println("hello from static block");
	}
}
