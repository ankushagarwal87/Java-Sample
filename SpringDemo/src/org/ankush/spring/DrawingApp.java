package org.ankush.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Traingle traingle = new Traingle();
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Traingle traingle = (Traingle)context.getBean("traingle");
		traingle.draw();
	}

}
