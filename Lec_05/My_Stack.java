package Lec_05;

public class My_Stack {
	protected int [] arr;
	protected int top;
	
	My_Stack(int n){
		arr=new int [n];
	}
	My_Stack() {
		arr=new int [5];
	}
	
	public void push(int n) {
		if(this.isFull()) {
			try{
				throw new Exception("Stack is Full");
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		arr[top]=n;
		top++;
	}
	public int pop()  {
		
		if(this.isEmpty()) {	
			try{
				throw new Exception("Stack is Empty");
			}
			catch(Exception e) {
				System.out.println(e);
			}

		}
		top--;
		return arr[top];
	}
	public int top() {
		return arr[top-1];
	}
	public boolean isEmpty() {
		return top==0;
	}
	public boolean isFull() {
		return top==arr.length;
	}
	public void display() {
		for(int i=0;i<top;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println(".");
	}
	
}
