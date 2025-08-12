package Lec_26;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String db="G26_db";
		String url="jdbc:mysql://127.0.0.1:3306/"+db;
		String user ="root";
		String pass="root";
		Connection c=DriverManager.getConnection(url,user,pass);
		//connection build sucessfully
		
		Statement st=c.createStatement();
		
		// statement created sucessfully
		
//		String createdb="Create database G26_db";   // query to create db
		
//		String Create_table="CREATE TABLE Students (rollnumber int(10), name varchar(30), age int(10));"; // query to create table in db
		
//		String Create_Student="insert into students (rollnumber , name ,age) values (1,\"ritik\",25)";  // query to create entry for student in student table
//		System.out.println(Create_Student);
		
//		String update_Student="UPDATE students SET name = \"Aman\" WHERE rollnumber=1;"; // query to update name of a student with given rollnumber
	
		
		String Delete_Student="";
		
		// query created
		
//		st.executeUpdate(createdb);
//		st.executeUpdate(Create_table);
//		st.executeUpdate(Create_Student);
//		System.out.println(Create_Student_in_Students_table(23,"Pratiyush",2));
//		st.executeUpdate(Create_Student_in_Students_table(23,"Pratiyush",2));
//		st.executeUpdate(update_Student);
		st.executeUpdate(Update_name_by_rollnumber("rohit",2));
		
		// query executed
		
		c.close();
		
		System.out.println("Executed sucessfully and connection closed");
		//connection closed
	}
	
	
	public static String Update_name_by_rollnumber(String name,int rollnumber) {
		String update_Student="UPDATE students SET name = \""+name+"\" WHERE rollnumber="+rollnumber+";";
		return update_Student;
	}
	
	public static String Create_Student_in_Students_table(int age,String name, int rollnumber) {
		String s="insert into students (rollnumber , name ,age) values ("+rollnumber+",\""+name+"\","+age+")";
		
		return s;
	}

}
