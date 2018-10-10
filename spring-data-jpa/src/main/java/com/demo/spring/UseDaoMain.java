package com.demo.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.demo.spring.service.HrService;

public class UseDaoMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(DaoConfig.class);

		HrService service=ctx.getBean(HrService.class);
		
		//service.disPlayEmpInfo(104);
		
		//System.out.println(service.registerEmployee(118, "Chinu", "Chennai", 74000));
		
		//service.showEmpList();
		
		service.listWithSalaryRange(30000, 60000);
	}

}
