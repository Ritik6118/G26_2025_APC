package Lec_01;

import java.util.Arrays;

public class Demo {

//	static int x=1;
//	static int y=2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(x+" "+y);
//		swap();
//		System.out.println(x+" "+y);


//		int temp = arr[0];
//		arr[0] = arr[1];
//		arr[1] = temp;
		
		
		
		
		int[] arr = { 1, 2, 3 };
		System.out.println(Arrays.toString(arr));
		swap(arr,0, 1);
		System.out.println(Arrays.toString(arr));
	}

	private static void swap(int [] arr,int i, int j) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

//	private static void swap() {
//		// TODO Auto-generated method stub
//		int t=x;
//		x=y;
//		y=t;
//		System.out.println(x+" "+y);

//	}

}
