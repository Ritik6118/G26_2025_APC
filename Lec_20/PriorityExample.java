package Lec_20;

public class PriorityExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		my_thread t0=new my_thread();
		my_thread t1=new my_thread();
		t0.start();   //=>Thread-0
		t1.start();   //=>Thread-1
		t0.setPriority(1);
		t1.setPriority(10);
	}

}
//class my_thread extends Thread {
//	@Override
//	public void run() {
//		for(int i=0;i<10000;i++) {
//			   System.out.println("hello from "+this.getName());
//		}
//	}
//}

