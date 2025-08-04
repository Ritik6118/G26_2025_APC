package Lec_21;

public class Sync_demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		my_thread t1=new my_thread();
		my_thread t2=new my_thread();
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(my_thread.count);
		System.out.println(my_thread.count2);
		
	}

}
//class my_thread extends Thread{
//	static int count;
//	static int count2;
//	
//	public static void counter() {
//		
//		synchronized (my_thread.class) {
//			count++;			
//		}	
//		count2++;
//	}
//	
//	
//	public void run() {
//		for(int i=0;i<1000;i++) {
//			counter();
//		}
////		System.out.println(count);
//	}
//}
