package com.demo.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.demo.spring.dao.EmpDao;
import com.demo.spring.entity.Emp;

@Service
/*@Scope("prototype")
@Lazy*/
public class HrService {

	@Autowired
	@Qualifier("jpaBean")
	private EmpDao dao;
	
	@Autowired
	@Qualifier("empDaoJdbcImpl")
	private EmpDao dao1;

	
	public String registerEmployee(int id, String name, String city, double salary) {
		String resp = dao.save(new Emp(id, name, city, salary));
		return resp;
	}
}
