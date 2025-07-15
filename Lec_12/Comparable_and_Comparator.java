package Lec_12;

import java.util.Comparator;
import java.util.TreeSet;

public class Comparable_and_Comparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		TreeSet<Integer> set=new TreeSet<>();
//		set.add(8);
//		set.add(2);
//		set.add(3);
//		set.add(1);
//		set.add(1);
//		set.add(6);
//		set.add(9);
//		
//		System.out.println(set);
		
		
		TreeSet<Student> set=new TreeSet<>(new StudentComparator());
		
		Student s1=new Student(300,"aman");
		Student s2=new Student(100,"gaurav");
		Student s3=new Student(500,"tarun");
		
		set.add(s1);
		set.add(s2);
		set.add(s3);
		System.out.println(set);
		
	}

}
class Student {
	String name ;
	int marks;
	
	Student(){
		
	}
	Student(int m ,String s){
		this .name =s;
		this.marks=m;
	}
	
	@Override 
	public String toString() {
		return this.name ;
	}

//	class Student implements Comparable<Student>{
//		String name ;
//		int marks;
//		
//		Student(){
//			
//		}
//		Student(int m ,String s){
//			this .name =s;
//			this.marks=m;
//		}
//		
//		@Override 
//		public String toString() {
//			return this.name ;
//		}
//		@Override
//		public int compareTo(Student o) {
//			// TODO Auto-generated method stub
////		return this.marks-o.marks;  //for ascending
//			return o.marks-this.marks;  //for descending
////		return 0;
//		}
}

class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
//		return o1.marks-o2.marks; // ascending order
		return o2.marks-o1.marks;  // descending order
	}
	
}
