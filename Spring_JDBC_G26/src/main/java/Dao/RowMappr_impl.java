package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import Entity.Student;

public class RowMappr_impl implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student s=new Student();
		s.setRollnumber(rs.getInt(1));
		s.setName(rs.getString(2));
		s.setAge(rs.getInt(3));
		return s;
	}

}
