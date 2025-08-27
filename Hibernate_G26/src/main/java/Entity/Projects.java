package Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Projects {
	@Id
	private int pId;
	private String name;
	@ManyToOne
	private Employees employee;
	
	Projects(){}
	
	public Projects(int pId, String name, Employees employee) {
		super();
		this.pId = pId;
		this.name = name;
		this.employee = employee;
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employees getEmployee() {
		return employee;
	}
	public void setEmployee(Employees employee) {
		this.employee = employee;
	}
	
	
}	
