package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.spring.service.HrService;

public class App {

	public static void main(String[] args) {
	
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//HrService hr=(HrService)ctx.getBean("hrService");
		
		HrService hr=ctx.getBean(HrService.class);
		
		System.out.println(hr.registerEmployee(100, "James", "London", 90000));

	}

}
