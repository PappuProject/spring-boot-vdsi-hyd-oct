package com.demo.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.spring.dao.EmpDao;
import com.demo.spring.entity.Emp;

@Service

public class HrService {

	@Autowired
	private EmpDao dao;
	
	@Transactional
	public String registerEmployee(int id, String name, String city, double salary) {
		String resp = dao.save(new Emp(id, name, city, salary));
		return resp;
	}
	
	public void disPlayEmpInfo(int id) {
		Emp emp=dao.findById(id);
		System.out.println(emp.getEmpId()+" "+emp.getName()+" "+emp.getSalary());
	}
	
	
}
