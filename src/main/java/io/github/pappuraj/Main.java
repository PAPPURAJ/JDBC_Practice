package io.github.pappuraj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.github.pappuraj.dao.RoboticShopDao;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("io/github/pappuraj/Config.xml");
		
		RoboticShopDao roboticProduct=context.getBean("myJDBC",RoboticShopDao.class);
		MyConsoleApplication.start();
		

	}

}
