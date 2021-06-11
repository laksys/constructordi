package com.king;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static java.lang.System.out;
import com.king.bean.Car;

public class App {
	public static void main(String[] args){
		out.println("------starts---------");

		//Car toyota = getCarFromJavaConfig();
		Car toyota = getCarFromXml();
		out.println(toyota);

		out.println("-------ends----------");
	}
	private static Car getCarFromJavaConfig() {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		return context.getBean(Car.class);
	}

	private static Car getCarFromXml() {
		ApplicationContext context = new ClassPathXmlApplicationContext("constructordi.xml");
		return context.getBean(Car.class);
	}
 }
