package com.mphasis.daos;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mphasis.entities.Employee;
import com.mphasis.utils.HibernateUtil;

public class EmployeeDao {
	
	public List<Employee> findAll(){
		Session session=HibernateUtil.buildSessionFactory().openSession();
		List<Employee> elist=session.createQuery("From Employee",Employee.class).list();
		return elist;
		
	}
	
	public void addEmployee(Employee e) {
		try(Session session=HibernateUtil.buildSessionFactory().openSession()){
		Transaction t=session.beginTransaction();
		session.save(e);
		t.commit();
		
		System.out.println("record inserted");
		}
	}
	
	public Employee findById(int id) {
		try(Session session=HibernateUtil.buildSessionFactory().openSession()){
			return session.get(Employee.class, id);
		}
		
	}

}
