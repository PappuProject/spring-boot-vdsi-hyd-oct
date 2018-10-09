package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AopConfig.class);
		Performer p = (Performer) ctx.getBean("singer");
		p.perform();
		
		/*System.out.println(p.getClass().getName());
		
		Class<?>[] intfs=p.getClass().getInterfaces();
		
		for(Class<?> c:intfs) {
			System.out.println(c.getName());
		}*/

	}

}
