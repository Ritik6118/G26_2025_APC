package Athelete_Hierarchy;

public class Track_Athelete extends Abst_Athelete implements Award_Winner,Endurance_Sport {

	Track_Athelete (String name ,int age){
		super.name =name;
		super.age=age;
	}
	
	@Override
	public void train() {
		// TODO Auto-generated method stub
		System.out.println(name +" is training in 400mtr running track");
	}

	@Override
	public void compete() {
		// TODO Auto-generated method stub
		System.out.println(name +" is competing in 100 mtr sprint race");
	}

	@Override
	public void participateInMarathon() {
		// TODO Auto-generated method stub
		System.out.println(name +" participated in 20km cross-country marathon");

	}

	@Override
	public void receiveMedal() {
		// TODO Auto-generated method stub
		System.out.println(name +" received gold medal");
	}

}
