package Lec_22;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Higher_Order_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		inter i =new inter() {
//			
//			@Override
//			public void fun() {
//				// TODO Auto-generated method stub
//				System.out.println("fun is implemented by annonymus class");
//			}
//		};
//		
//		i.fun();
//		
//		inter i1=() -> System.out.println("fun is implemented by lambda expression");
//		
//		i1.fun();
		
		
		String s="abcd";
		int a=20;
//		
//		sample(s,a);
//		sample("abcd",20);
		higherOrder(()->System.out.println("this method is passed as higher order"),s,a);
//		
		
		inter i2=HigherOrderReturningFun();
		i2.fun();
		
		ArrayList<Integer> li=new ArrayList<>();
		
		li.add(1);
		li.add(10);
		li.add(2);
		li.add(20);
		li.add(12);
		li.add(11);
		li.add(13);
		li.add(111);
		li.add(112);
		li.add(190);
		li.add(90);
		li.add(25);
		
		System.out.println(li); 		
//		li=filter(li,(n)->n%2==0);
		li=filter(li,(n)->n%10==0);
		System.out.println(li); 
		
	}
	
	private static ArrayList<Integer> filter(ArrayList<Integer> li, Predicate<Integer> p) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ans=new ArrayList<>();
		for(int i:li) {
			if(p.test(i)) {
				ans.add(i);
			}
		}
		return ans;
	}

	
	
	public static void sample(String s, int i) {
		System.out.println(s);
		System.out.println(i);
	}
	
	
	public static inter HigherOrderReturningFun() {
		return ()->System.out.println("this function is returning from highrer order fun");	
	}
	
	public static void higherOrder(inter i,String s,int a) {
		i.fun();
		System.out.println(s);
		System.out.println(a);
	
//		
////		Function<T, R>
//		BiFunction<T, U, R>
	}
	
	
	
}


@FunctionalInterface
interface inter {
	void fun();
	
//	void fun2();
}
