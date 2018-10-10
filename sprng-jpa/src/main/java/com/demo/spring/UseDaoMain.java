package com.demo.spring;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.demo.spring.entity.Emp;
import com.demo.spring.service.HrService;

public class UseDaoMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(DaoConfig.class);

		HrService service=ctx.getBean(HrService.class);
		
		service.disPlayEmpInfo(104);
		
		//System.out.println(service.registerEmployee(118, "Chinu", "Mumbai", 74000));
		
		service.showEmpList();
	}

}
