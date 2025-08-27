package Dao;

import java.util.List;

import Entity.Student;

public interface Student_Dao {
	void insert(Student s);
	void update(Student s);
	void delete(Student s);
	Student get(int roll);
	List<Student> getAll();
	
}
