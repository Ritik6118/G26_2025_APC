package Dao;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import Entity.Student;


@Component("student_dao")
public class Student_Dao_JDBC implements Student_Dao {

	@Autowired
	private JdbcTemplate jt;
	
	public JdbcTemplate getJt() {
		return jt;
	}

	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public void insert_Student(Student s) {
		// TODO Auto-generated method stub
		String query="insert into students(rollnumber,name,age) values(?,?,?)";
		jt.update(query,s.getRollnumber(),s.getName(),s.getAge());
	}

	@Override
	public void delete_Student(Student s) {
		// TODO Auto-generated method stub
		String query="delete from students where rollnumber=?";
		jt.update(query,s.getRollnumber());
	}

	@Override
	public void update_Student(Student s) {
		// TODO Auto-generated method stub
		String query="update students set name=? where rollnumber=?";
		jt.update(query,s.getName(),s.getRollnumber());
	}
	
	public Student getStudent(int rollnumber) {
		String query="select * from students where rollnumber="+rollnumber;
		// by using lambda expression
		RowMapper<Student> rm=(ResultSet rs,int r)->new Student(rs.getInt(1),rs.getString(2),rs.getInt(3));
		
//		Student s=jt.queryForObject(query, new RowMappr_impl());
		Student s=jt.queryForObject(query, new RowMappr_impl());
		return s;
	}

	@Override
	public List<Student> get_All_Students() {
		// TODO Auto-generated method stub
		String query="select * from students";
		// by using hoigher order function
		List<Student> li=jt.query(query, (ResultSet rs, int a)->new Student(rs.getInt(1),rs.getString(2),rs.getInt(3)));
//		List<Student> li=jt.query(query, new RowMappr_impl());
		return li;
	}

}
