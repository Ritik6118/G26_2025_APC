package lec_29;

import java.util.HashMap;
import java.util.List;

public class Student {
	String name;
	int rollnumber;
	List<String> courses;
	HashMap<String, String> Teacher_Course_Mapping;
	
	Laptop laptop;
	
	Address address;
	
	Student(){}
	
	Student(Laptop l,Address a){
		laptop =l;
		address=a;
	}
}
