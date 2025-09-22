package g26.springbootg26.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import g26.springbootg26.entity.Student;
import g26.springbootg26.service.Student_Service;

@RestController
public class My_Controller {
	
	@Autowired
	Student_Service sr;
	
	@RequestMapping("/")
	public String start() {
		return "application started";
	}
	
	@RequestMapping("/addstudent")
	public String add(@RequestBody Student s ) {
		sr.add(s);
		return "added successfully";
	}
}
