package Lec_04;

public class Try_Catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(3/0);
		}
		catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
			System.out.println("Hello World");
		}
	}

}
