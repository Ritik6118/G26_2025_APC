package Lec_02;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s1="abc";
//		String s2=new String("abc");
//		
//		System.out.println(s1==s2);
		
		String st1="abc";
		String st2="abc";
//		System.out.println(st1==st2); // if this line prints true that means adress is pooled
//		System.out.println(st1+" "+st2);
		
		st1+="d";
		String st3="abcd";
//		System.out.println(st1+" "+st2);
		System.out.println(st3==st1);
		
	}

}
