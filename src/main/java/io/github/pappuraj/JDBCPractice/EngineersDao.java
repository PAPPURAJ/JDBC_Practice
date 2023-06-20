package io.github.pappuraj.JDBCPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class EngineersDao {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("io/github/pappuraj/JDBCPractice/config.xml");
	JdbcTemplate myTemplate=context.getBean("myJDBC",JdbcTemplate.class);
	
	int insertData(String name, String position, String fieldOfWork,double salary) {
		return myTemplate.update("INSERT INTO engineers(name,position,fieldOfWork,salary) VALUES(?,?,?,?)",name,position,fieldOfWork,salary);
	}
	
	

}
