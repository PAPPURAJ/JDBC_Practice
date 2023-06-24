package io.github.pappuraj;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.github.pappuraj.dao.RoboticShopDao;
import io.github.pappuraj.model.RoboticProduct;
public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		ApplicationContext context=new ClassPathXmlApplicationContext("io/github/pappuraj/Config.xml");
		
		RoboticShopDao roboticProduct=context.getBean("myJDBC",RoboticShopDao.class);
		
		MyConsoleApplication.start(roboticProduct);
		

	}
	
	
	static void operation(int op) {
		System.out.println("Operation "+(op==1?"successfull!":"failed"));
	}

}
