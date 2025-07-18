package Athelete_Hierarchy;

public abstract class Abst_Athelete implements IAthelete {

	String name;
	int age;
	
	public void show_profile() {
		System.out.println("Athelete's Name :"+name+" Athelete's age:"+age);
	}

}
