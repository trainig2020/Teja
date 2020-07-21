package org;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {
	public static void main(String[] args) {
	     
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	
		Shape shape=(Shape) context.getBean("Circle");
		shape.draw();
		
	}
	

}
