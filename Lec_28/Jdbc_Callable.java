package Lec_28;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Arrays;
import java.sql.*;

public class Jdbc_Callable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String db="G26_db";
		String url="jdbc:mysql://127.0.0.1:3306/"+db;
		String user ="root";
		String pass="root";
		Connection c=DriverManager.getConnection(url,user,pass);
		//connection build sucessfully
		
		Statement st= c.createStatement();
		
		
//		PreparedStatement ps=c.prepareStatement("insert into students (rollnumber , name ,age) values (?,?,?)");
		
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
		
		
		String create_procedure="create procedure getName (in rn int(10), out n varchar(30)) "
				+ "begin "
				+ "select name into n from students where rollnumber = rn; "
				+ "end";
		
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
		
		
		
//		ps.setInt(1, 5);
//		ps.setString(2, "abcd");
//		ps.setInt(3, 20);
//		ps.addBatch();
//		
//		ps.setInt(1, 6);
//		ps.setString(2, "def");
//		ps.setInt(3, 20);
//		ps.addBatch();
//		
//		ps.setInt(1, 7);
//		ps.setString(2, "ghi");
//		ps.setInt(3, 20);
//		ps.addBatch();
//		
//		ps.setInt(1, 8);
//		ps.setString(2, "jkl");
//		ps.setInt(3, 20);
//		ps.addBatch();
//		
//		ps.setInt(1, 9);
//		ps.setString(2, "mno");
//		ps.setInt(3, 20);
//		ps.addBatch();
		
//		ps.executeUpdate();
//		int [] arr=ps.executeBatch();
		
//		System.out.println(Arrays.toString(arr));
		
//		st.executeUpdate(create_procedure);
		
//		st.executeUpdate(create_procedure);
		CallableStatement cs=c.prepareCall("{call getName (?,?)}");
		cs.setInt(1, 1);
		
//		st.execute("DROP PROCEDURE  getName;");
		
		cs.registerOutParameter(2, Types.VARCHAR);
//		ParameterMetaData pmmd= cs.getParameterMetaData();
//		System.out.println(pmmd.getParameterClassName(2));
//		System.out.println(pmmd.getParameterType(2));
//		System.out.println(pmmd.getParameterTypeName(2));
//		System.out.println(pmmd.getParameterMode(2));
		cs.execute();
		
		String s=cs.getString(2);
		System.out.println(s);
		
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
