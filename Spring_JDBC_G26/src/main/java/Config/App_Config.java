package Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import Dao.Student_Dao_JDBC;

@Configuration
@ComponentScan({"Dao"})
public class App_Config {

	
	@Bean(name="driver")
	public DriverManagerDataSource getDriver() {
		String url = "jdbc:mysql://127.0.0.1:3306/G26_db";
		String user = "root";
		String pass = "root";
		return new DriverManagerDataSource(url,user,pass);
	}
	
	@Bean("template")
	public JdbcTemplate getTemplate() {
		return new JdbcTemplate(getDriver());
	}
	
	
//	@Bean("student_dao")
//	public Student_Dao_JDBC getStudentDao() {
//		return new Student_Dao_JDBC();
//	}
}	
