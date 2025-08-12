package Lec_30;

public class Processor {
	private String name;
	private int cores;
	private int clock_speed;
	
	
	Processor(){
		
	}
	public Processor(String name, int cores, int clock_speed) {
		super();
		this.name = name;
		this.cores = cores;
		this.clock_speed = clock_speed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCores() {
		return cores;
	}
	public void setCores(int cores) {
		this.cores = cores;
	}
	public int getClock_speed() {
		return clock_speed;
	}
	public void setClock_speed(int clock_speed) {
		this.clock_speed = clock_speed;
	}
	
	public String toString() {
		return name;
	}
}
