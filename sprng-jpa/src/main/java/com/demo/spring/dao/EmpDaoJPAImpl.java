package com.demo.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.demo.spring.entity.Emp;

@Repository
public class EmpDaoJPAImpl implements EmpDao {

	@PersistenceContext
	EntityManager em;

	@Override
	public String save(Emp e) {
		em.persist(e);
		return "emp saved";
	}

	@Override
	public String delete(int id) {
		return null;
	}

	@Override
	public Emp findById(int id) {
		Emp e = em.find(Emp.class, id);
		return e;
	}

	@Override
	public List<Emp> getAll() {
		Query query=em.createQuery("select e from Emp e");
		
		return query.getResultList();
	}

}
