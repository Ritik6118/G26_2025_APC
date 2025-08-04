package Lec_21;

public class Volatile_demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		my_thread t1=new my_thread();
		t1.start();
		Thread.sleep(1000);
		t1.m1();
	}

}
class my_thread extends Thread{
	
//	volatile boolean flag=true;
	boolean flag=true;
	
	public void run() {
		System.out.println("hello");
		while(flag) {
			System.out.println("abcd");
		}
		System.out.println("hi");
	}
	
	public void m1() {
		flag=false;
		
		System.out.println("m1 is called");
	}
}