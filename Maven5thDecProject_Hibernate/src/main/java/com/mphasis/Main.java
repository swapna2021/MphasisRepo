package com.mphasis;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mphasis.model.Course;
import com.mphasis.model.Student;


public class Main {

	public static void main(String[] args) {
		
		
		Configuration cfg=new Configuration().configure();
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
//		Course c=new Course(1, "Java", 25000);
//		session.save(c);
//		System.out.println("course added");
//		Student s=new Student(1, "swapna", c, "9090909090", "swapna@gmail.com");
//		session.save(s);
//		System.out.println("student added");
		
//		Student s=session.get(Student.class, 1);
//		session.delete(s);
		
		Course c=session.get(Course.class, 1);
		session.delete(c);
		tx.commit();
		session.close();
		sessionFactory.close();

	}

}
