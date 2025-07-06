package Lec_04;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] arr=new int [5];
//		System.out.println(arr[-1]);
		f1();
	
		System.out.println("hello");
	}

	private static void f1() {
		// TODO Auto-generated method stub
		int [] arr= {1};
		try{
			System.out.println(arr[-1]);
			f2();
			System.out.println("hello after f2");
		}
//		catch(Exception e) {
//			
//		}
		catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("arithmetic exception is handled");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("array index out of bound exception is handled");
		}
		System.out.println("hello from f1");
	}

	private static void f2() {
		// TODO Auto-generated method stub
		f3();
		System.out.println("line after exception");
	}


	private static void f3() {
		// TODO Auto-generated method stub
		System.out.println(3/0);
		System.out.println("line after exception");
	}
}
