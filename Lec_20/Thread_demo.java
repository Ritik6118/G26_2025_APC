package Lec_20;

import java.util.Iterator;
import java.util.Scanner;

public class Thread_demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		my_thread t1=new my_thread();
//		t1.start();
//		Scanner sc=new Scanner(System.in);
//		for(int i=0;i<100;i++) {
//			System.out.println("downloading resource "+i+"%");
//		}
//		int n=sc.nextInt();
//		System.out.println("User input from main thread is"+n);
//		for(int i=0;i<=n;i++) {
//			System.out.println(i);
//5		}
//		System.err.println("err");
//		for(int i=0;i<100;i++) {
//			System.out.println("hello");
//		}
		
		
//		RThread r1=new RThread();
//		RThread r2=new RThread();
//		Runnable r=new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				for(int i=0;i<100;i++) {
//					System.out.println("running from another thread");					
//				}
//			}
//		};
//		Thread t1=new Thread(r1);
//		Thread t2=new Thread(r);
//
//		
//		t1.start();
//		t2.start();
		
		
		
//		creation by using lambda expression (implementing runnable functional interface)
		
		Thread t1=new Thread(()->{
			for(int i=0;i<100;i++) {
				System.out.println("hello from thread 1");
				
			}
		});
		Thread t2=new Thread(()->{
			for(int i=0;i<100;i++) {
				System.out.println("hello from thread 2");
			}
		});
		
//		t1.start();
//		t1.stop();
//		t2.start();
//		t1.start();
		
		t1.start();
		t1.join();         // pause execution of current thread and executes the joining thread completly then continues with execution of current thread
		t2.start();
		t2.join();
		
	}



}

class RThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++) {
			System.out.println("hello for run of rthread");
		}
	}
	
}

//class my_thread extends Thread {
//	@Override
//	public void run() {
//		for(int i=0;i<100;i++) {
//			System.out.println("downloading resource "+i+"%");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}   // time in ms    
//		}
//	}
//}