package Lec_07;

public interface Demo_Interface {
	
	int a=5;
	
	
	void fun1();
	
	int fun2();
	
	String fun3();
	
	default void fun4() {
		System.out.println("fun 4 from inteface");
	}
}
