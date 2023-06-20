package io.github.pappuraj.JDBCPractice;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import io.github.pappuraj.JDBCPractice.dao.EngineerDaoInterface;
import io.github.pappuraj.JDBCPractice.entities.Project2Morrow;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("io/github/pappuraj/JDBCPractice/config.xml");
		EngineerDaoInterface engineerDaoInterface=context.getBean("engDao",EngineerDaoInterface.class);
		
		Project2Morrow p2m=new Project2Morrow();
		p2m.setName("Subro");
		p2m.setFieldOfWork("Fashin");
		p2m.setPosition("Junior");
		p2m.setSalary(20000);
		
		int ret=engineerDaoInterface.insert(p2m);
		System.out.println("Number of row affected: "+ret);
		

	}

}
