package Athelete_Hierarchy;

public interface IAthelete {
	int MIN_AGE=16;
	int MAX_AGE=35;
	
	
	void train();
	
	void compete();
	
	static void show_age_criteria() {
		System.out.println("age criteria is "+MIN_AGE+" years to "+MAX_AGE+" Years");
		
	}
	
}
