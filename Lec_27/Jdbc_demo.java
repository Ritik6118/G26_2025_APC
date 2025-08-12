package Lec_27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
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
		
//		Statement st=c.createStatement();
		
		PreparedStatement ps=c.prepareStatement("insert into students (rollnumber , name ,age) values (?,?,?)");
		
		// statement created sucessfully
		
//		String createdb="Create database G26_db";   // query to create db
		
//		String Create_table="CREATE TABLE Students (rollnumber int(10), name varchar(30), age int(10));"; // query to create table in db
		
//		String Create_Student="insert into students (rollnumber , name ,age) values (1,\"ritik\",25)";  // query to create entry for student in student table
//		System.out.println(Create_Student);
		
//		String update_Student="UPDATE students SET name = \"Aman\" WHERE rollnumber=1;"; // query to update name of a student with given rollnumber
	
		
//		String Delete_Student="delete from students where rollnumber =2";
		
//		String Delete_table="drop table students";
		
//		String Delete_Database=" drop database "+db;
		
		
//		String get_Students="Select * from students";
		
		// query created
		
//		st.executeUpdate(createdb);
//		st.executeUpdate(Create_table);
//		st.executeUpdate(Create_Student);
//		System.out.println(Create_Student_in_Students_table(23,"tarun",1));
//		st.executeUpdate(Create_Student_in_Students_table(23,"tarun",1));
//		st.executeUpdate(Create_Student_in_Students_table(23,"rohit",2));
//		st.executeUpdate(Create_Student_in_Students_table(23,"tanuj",3));
//		st.executeUpdate(Create_Student_in_Students_table(23,"aman",4));
//		st.executeUpdate(update_Student);
//		st.executeUpdate(Update_name_by_rollnumber("rohit",2));
//		st.executeUpdate(Delete_Student);
//		st.executeUpdate(Delete_table);
		
		
//		ResultSet rs= st.executeQuery(get_Students);
//		
//		ResultSetMetaData rsmd=rs.getMetaData();
//		int col=rsmd.getColumnCount();
//		
//		for(int i=1;i<=col;i++) {
//			System.out.print(rsmd.getColumnName(i)+" ");
//		}
//		System.out.println();
//		int row=0;
//		while(rs.next()) {
//			for(int i=1;i<=col;i++) {
//				System.out.print(rs.getString(i)+" ");
//			}
//			System.out.println();
//			row++;
//		}
//		System.out.println("total rows ="+row);
		
		
		
		ps.setInt(1, 5);
		ps.setString(2, "Gaurav");
		ps.setInt(3, 20);
		
		ps.executeUpdate();
		
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
