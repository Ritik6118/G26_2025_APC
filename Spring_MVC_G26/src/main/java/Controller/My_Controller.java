package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import Dao.Student_Dao;
import Dao.User_Dao_Hibernate;
import Entity.User;

@Controller
public class My_Controller {
	
	private Student_Dao sd;
	private User_Dao_Hibernate ud;
	
	public User_Dao_Hibernate getUd() {
		return ud;
	}

	public void setUd(User_Dao_Hibernate ud) {
		this.ud = ud;
	}

	public Student_Dao getSd() {
		return sd;
	}

	public void setSd(Student_Dao sd) {
		this.sd = sd;
	}

	@RequestMapping("/user")
	public void user() {
		System.out.println("User controller is running");
	}
	
	@RequestMapping("/home")
	public String home() {
		System.out.println("home controller is running");
		
		return "home";
	}
	
	@RequestMapping("/student")
	public String student(Model m) {
		System.out.println("student controller is running");
		m.addAttribute("name" , "Ritik");
		return "student";
	}
	
	@RequestMapping("/form")
	public String form() {
		return "form";
	}
	
	
	@RequestMapping("/submit-form")
	public String submit(@RequestParam("user_name") String name, @RequestParam("user_email") String email,Model m) {
		System.out.println(name+" "+email);
		User u=new User(name, email);
		ud.insert(u);
		m.addAttribute("name", name);
		m.addAttribute("email", email);
		return "submit-form";
	}
}
