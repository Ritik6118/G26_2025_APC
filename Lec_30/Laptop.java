package Lec_30;

public class Laptop {
	private String MakeandModel;
	private Processor p;
	private int ram;

	Laptop() {
	}
	
	public Laptop(String makeandModel, Processor p, int ram) {
		super();
		MakeandModel = makeandModel;
		this.p = p;
		this.ram = ram;
	}

	Laptop(Processor p) {
		this.p = p;
	}

	public String getMakeandModel() {
		return MakeandModel;
	}

	public void setMakeandModel(String makeandModel) {
		MakeandModel = makeandModel;
	}

	public Processor getP() {
		return p;
	}

	public void setP(Processor p) {
		this.p = p;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public String toString() {
		return MakeandModel+" "+p+" Ghz "+ram+" GB";
	}

}
