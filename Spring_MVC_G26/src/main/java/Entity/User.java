package Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="User_From_Spring_MVC")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Userid;
	private String name;
	private String email;
	
	public int getUserid() {
		return Userid;
	}
	public void setUserid(int userid) {
		Userid = userid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	public User(int userid, String name, String email) {
		super();
		Userid = userid;
		this.name = name;
		this.email = email;
	}
	public User() {
		super();
	}
	
	
	
}
