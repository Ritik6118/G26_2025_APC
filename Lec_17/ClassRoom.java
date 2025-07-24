package Lec_17;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class ClassRoom {
	
	static File f=new File("Student_db.txt");
	static HashSet<Integer> roll=new HashSet<>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(f);
		while(sc.hasNext()) {
			String s=sc.nextLine();
			String [] arr=s.split(" ");
			roll.add(Integer.parseInt(arr[0]));
		}
		addStudent();
		
		sc.close();
		print_all_Students();
	}
	public static void print_all_Students() throws FileNotFoundException {
		ArrayList<Student> li2=new ArrayList<>();
		Scanner sc=new Scanner(f);
		while(sc.hasNext()) {
			String s=sc.nextLine();
			String [] arr=s.split(" ");
//			System.out.println(Arrays.toString(arr));
			li2.add(new Student(arr[1],Integer.parseInt(arr[2]),Integer.parseInt(arr[0])));
		}
		System.out.println(li2);
	}
	public static void addStudent() throws IOException {
		FileWriter fr=new FileWriter(f,true);
		PrintWriter pr=new PrintWriter(fr);
		Scanner sc=new Scanner(System.in);
		int roll_no=sc.nextInt();
		String name=sc.next();
		int age=sc.nextInt();
//		Student s1=new Student("aman", 10, 1);    // u can take input for this
//		pr.println(s1);
		if(roll.contains(roll_no)) {
			System.out.println("Invalid roll number");
		}else{
			roll.add(roll_no);
			pr.println(roll_no+" "+name+" "+age);			
		}
		pr.flush();
		pr.close();
	}
	

}
class Student{
	String Name;
	int Rollno;
	int age;
	
	Student(String s, int a,int r){
		Name =s;
		Rollno=r;
		age=a;
	}
	Student(){}
	
	@Override
	public String toString() {
		return "Student: "+Rollno+" "+Name+" "+age;
	}
}
