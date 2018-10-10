package com.demo.spring.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.spring.entity.Emp;
import com.demo.spring.repo.EmpRepository;

@Service
@Transactional
public class HrService {

	@Autowired
	private EmpRepository repo;

	public String registerEmployee(int id, String name, String city, double salary) {
		Emp e = repo.save(new Emp(id, name, city, salary));
		return "Saved";
	}

	public void disPlayEmpInfo(int id) {
		Optional<Emp> o = repo.findById(id);
		if (o.isPresent()) {
			Emp emp=o.get();
			System.out.println(emp.getEmpId() + " " + emp.getName() + " " + emp.getSalary());
		} else {
			System.out.println("No Data Found..");
		}
	}

	public void showEmpList() {

		repo.findAll().stream().forEach(e -> System.out.println(e.getEmpId() + " " + e.getName() + " " + e.getSalary()));
	}
	
	public void listWithSalaryRange(double s1, double s2) {
		repo.getEmpWithSalBetweenRange(s1, s2)
		.stream()
		.forEach(e -> System.out.println(e.getEmpId() + " " + e.getName() + " " + e.getSalary()));
	}

}
