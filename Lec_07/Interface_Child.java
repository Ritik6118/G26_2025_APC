package Lec_07;

public class Interface_Child implements Demo_Interface{

	@Override
	public void fun1() {
		// TODO Auto-generated method stub
		System.out.println("fun 1 from interface child");
	}

	@Override
	public int fun2() {
		// TODO Auto-generated method stub
		System.out.println("fun 1 from interface child");
		a++;
		return a;
	}

	@Override
	public String fun3() {
		// TODO Auto-generated method stub
		System.out.println("fun 1 from interface child");
		return "abc";
	}

}
