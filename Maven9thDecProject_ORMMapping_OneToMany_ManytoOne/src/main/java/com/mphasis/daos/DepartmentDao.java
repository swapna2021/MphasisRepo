package com.mphasis.daos;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mphasis.entities.Department;
import com.mphasis.utils.HibernateUtil;

public class DepartmentDao {
	
	public List<Department> findAll(){
		try(Session session=HibernateUtil.buildSessionFactory().openSession()){
			List<Department> dlist= session.createQuery("From Department",Department.class).list();
			dlist.forEach(d->Hibernate.initialize(d.getEmpList()));
			return dlist;
		}
	}
	
	public void addDepartment(Department department) {
		Transaction tx;
		try(Session session=HibernateUtil.buildSessionFactory().openSession()){
			tx=session.beginTransaction();
			session.save(department);
			tx.commit();
		}
	}
	
	
	public Department findById(int id) {
		
		try(Session session=HibernateUtil.buildSessionFactory().openSession()){
			return session.get(Department.class, id);
		}
		
	}
	
	
	public void delete(int id) {
		
		try(Session session=HibernateUtil.buildSessionFactory().openSession()){
			Transaction tx=session.beginTransaction();
			Department dept=session.get(Department.class,id);
			if(dept!=null) {
				session.delete(dept);
			}
			tx.commit();
			System.out.println("Department deleted");
		}
		
	}

}
