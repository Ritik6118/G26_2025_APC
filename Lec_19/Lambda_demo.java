package Lec_19;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Lambda_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		interf_impl obj=new interf_impl();
//		obj.fun(10);
//		My_f_Interface obj=new interf_impl();
//		obj.fun(10);
		
//		My_f_Interface obj =new My_f_Interface() {
//			
//			@Override
//			public void fun(int a) {
//				// TODO Auto-generated method stub
//				System.out.println("number is "+a);
//			}
//		};
		
//		obj.fun(10);
		
//		My_f_Interface print=(a)->System.out.println(a);
//		print.fun(10);
//		
//		
//		My_f_Interface square=(a)->System.out.println(a*a);
//		square.fun(10);
		
//		My_f_Interface sum=(a,b)->System.out.println(a+b);
//		
//		My_f_Interface mult=(a,b)->System.out.println(a*b);
//		
//		sum.fun(10, 20);
//		
//		mult.fun(10,20);
		
//		My_f_Interface count=(a)->{
//			for(int i=1;i<=a;i++) {
//				System.out.println(i);
//			}
//		};
//		
//		count.fun(10);
		
//		Function<String , Integer> f=(a)->a.length();  //  <Input data type / return data type>
//		int len=f.apply("abcdALFN;ONDS;O");
//		System.out.println(len);
		
//		BiFunction<Integer, Integer, Integer> f=(a,b)->a*b;                       //<Input1 data type/ Input 2 data type / output data type>
//		int ans=f.apply(3, 5);
//		System.out.println(ans);
		
//		Consumer<Integer> con=(a)->{   // take only one param as input and returns void
//			for(int i=1;i<=a;i++) {
//				System.out.println(i);				
//			}
//		};
//		
//		con.accept(10);
		
//		BiConsumer<T, U>  // takes 2 params as input and return void
		
//		Supplier<Integer> max=()->Integer.MAX_VALUE;
//		int a=max.get();
//		System.out.println(a);
		
//		Comparator<Student> comp=new Comparator<Student>() {
//			
//			@Override
//			public int compare(Student o1, Student o2) {
//				// TODO Auto-generated method stub
//				return o1.age-o2.age;
//			}
//		};
		
		Comparator<Student> age=(a,b)->a.age-b.age;
//		
		Comparator<Student> roll=(a,b)->a.roll-b.roll; 
		TreeSet<Student> pq=new TreeSet(roll);
		PriorityQueue<Student> p=new PriorityQueue(roll);
		
//		PriorityQueue<Student> pq=new PriorityQueue((o1, o2) -> o1.age-o2.age);
		
		
		Student s1=new Student("rohit", 24,10);
		Student s2=new Student("mohit", 22,9);
		Student s3=new Student("shubham", 20,1);
		Student s4=new Student("tarun", 26,11);
		
		
		pq.add(s1);
		pq.add(s2);
		pq.add(s3);
		pq.add(s4);
		
		p.add(s1);
		p.add(s2);
		p.add(s3);
		p.add(s4);
		
		while(!p.isEmpty()) {
			System.out.println(p.poll());
		}
		System.out.println(pq);
		
		
		
	}

}
//class interf_impl implements My_f_Interface{
//
//	@Override
//	public void fun(int a) {
//		// TODO Auto-generated method stub
//		System.out.println(a);
//		
//	}
//	
//}


class Student {
	String name ;
	int age;
	int roll;
	Student(String n,int a,int r){
		this.name=n;
		this.age=a;
		this.roll=r;
	}
	Student(){}
	@Override
	public String toString() {
		return name;
	}
}
