package Lec_07;

public class Stack_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		G_Stack<Integer> st=new G_Stack<>();
//		
//		st.push(0);
//		st.push(1);
//		st.push(2);
//		st.push(3);
//		st.push(4);
//		System.out.println(st);
//		while(!st.isEmpty()) {
//			System.out.println(st.pop());
//		}
		G_Stack<String> st2=new G_Stack<>();
		st2.push("abc");
		st2.push("def");
		st2.push("ghi");
		st2.push("jkl");
		System.out.println(st2);
		while(!st2.isEmpty()) {
			System.out.println(st2.pop());
		}
	}

}
