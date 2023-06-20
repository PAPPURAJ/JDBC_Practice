package io.github.pappuraj.JDBCPractice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {


    	ApplicationContext context=new ClassPathXmlApplicationContext("io/github/pappuraj/JDBCPractice/config.xml");
    	Project2Morrow p2m=context.getBean("myJDBC",Project2Morrow.class);
    	System.out.println(p2m);
    }
}
