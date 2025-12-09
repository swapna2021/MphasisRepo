package com.mphasis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mphasis.dao.PassportDao;
import com.mphasis.dao.PersonDao;
import com.mphasis.entities.Passport;
import com.mphasis.entities.Person;

/**
 * Hello world!
 */
public class App {
	private static final Logger logger=LoggerFactory.getLogger(PassportDao.class);
    
	public static void main(String[] args) {
        
    	logger.info("App started");
    	Passport pass1=new Passport("India56");
    	logger.info("passport generated {}",pass1);
    	Person person=new Person( "amit", "9090909090", "amit@gmail.com");
    	person.setPassport(pass1);
    	logger.info("person object created successfull {}",person);
    	PersonDao dao=new PersonDao();
    	//dao.addPerson(person);
    	//dao.findAll().forEach(System.out::println);
    	
    	Person p=dao.findById(2l);
    	System.out.println(p);
    	
    	
//    	PassportDao dao1=new PassportDao();
//    	System.out.println(dao1.findByPersonId(1l));
    	logger.info("dao updated person status");
    	logger.info("App closed");
    }
}
