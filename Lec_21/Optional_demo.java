package Lec_21;

import java.util.Optional;

public class Optional_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> s=getName();
		if(s.isPresent()) {
			String st=s.get();
			System.out.println(st);			
		}
		String st=s.orElse("return another string");
		
		
		System.out.println(st);
//		s.isEmpty();// opposiote  of is present
		
	}
	
	public static Optional<String> getName() {
		
		// get name from db
		
//		String s="ritik";  // if name found
		String s=null;  // if name not found
		
		return Optional.ofNullable(s);     // wraps the string in an optional container
//		return Optional.of(s);    // wraps the string in an optional container
	}

}


//https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html
