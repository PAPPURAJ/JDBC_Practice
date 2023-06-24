package practice.again;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("practice/again/Config.xml");

		StudentDao studentDao=context.getBean("myTmp",StudentDao.class);
		System.out.println(studentDao.write(new Student("Keya","Raozan")));
		
	}

}
