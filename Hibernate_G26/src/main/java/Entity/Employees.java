package Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Employees {
	@Id
	private int eId;
	private String name;
	
	@OneToMany
	private List<Projects> projects;

	public Employees() {}
	
	public Employees(int eId, String name, List<Projects> projects) {
		super();
		this.eId = eId;
		this.name = name;
		this.projects = projects;
	}

	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Projects> getProjects() {
		return projects;
	}

	public void setProjects(List<Projects> projects) {
		this.projects = projects;
	}
	
	
}
