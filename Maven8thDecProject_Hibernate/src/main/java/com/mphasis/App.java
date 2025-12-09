package com.mphasis;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mphasis.model.Student;
import com.mphasis.util.HibernateUtil;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        SessionFactory factory=HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        Transaction tx=session.beginTransaction();
        Student s=new Student(125,"amit","spring");
        session.save(s);
        System.out.println("object added successfully");
        tx.commit();
        
        //retrieve all students
        
        List<Student> studList=session.createQuery("From Student",Student.class).list();
        for(Student s1:studList)
        	System.out.println(s1);
        
        session.close();
        factory.close();
        
    }
}
