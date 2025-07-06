package Lec_05;

public class Exception_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		m1();
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("My custom Exception is Handeled..");
		}
		m2();
	}

	private static void m2() {
		// TODO Auto-generated method stub
		try {
			throw new Exception ("My new Exception");			
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("My new Exception is handeled");
		}
		
		System.out.println("line after Exception ");
	}

	private static void m1() throws Exception {
		// TODO Auto-generated method stub
		throw new Exception ("My Exception");
		
	}

}
