package Lec_03;

public class Student {
	String name;
	private int rollnumber;
	int knowledge;
	String dept;
	
	static int id=1;
	
	Student(){
		rollnumber=id;
		id++;
	}
	Student(String name,int knowledge,String dept){
		this.name=name;
		this.knowledge=knowledge;
		this.dept=dept;
	}
	public int rollnumber() {
		return rollnumber;
	}
	public void introduce() {
		System.out.println("Hello my name is "+name+" and iam from "+dept);
	}
	
	public void study() {
		System.out.println(name +" is Studying...");
		knowledge+=20;
	}
	
	public void teach(Student s1) {
		System.out.println(name +" is teaching "+s1.name);
		knowledge+=10;
		s1.knowledge+=10;
	}
	
	public void giveExam() {
		System.out.println(name+" is giving exam...");
		if(knowledge>=40) {
			System.out.println("Result : pass");
		}else {
			System.out.println("Result : Fail");
		}
	}
	static {
		System.out.println("Hello From student's Static block");
	}
}
