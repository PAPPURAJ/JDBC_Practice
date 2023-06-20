package io.github.pappuraj.JDBCPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


    	ApplicationContext context=new ClassPathXmlApplicationContext("io/github/pappuraj/JDBCPractice/config.xml");
    	JdbcTemplate template=context.getBean("myJDBC",JdbcTemplate.class);

    	String query="INSERT INTO engineers(name,position,fieldOfWork,salary) VALUES(?,?,?,?)";
    	
    	int val=template.update(query,"Shayeri","Junior","Native",20000);
   
    	
    	System.out.println("Row effected: "+val);
    }
}
