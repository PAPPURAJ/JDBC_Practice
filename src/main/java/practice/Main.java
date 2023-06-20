package practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("practice/config.xml");
		EmpInterface empInt=context.getBean("empBean",EmpInterface.class);
		
		System.out.println(empInt.insert(new Employee("Shayeri", "Doctor")));
		

	}

}
