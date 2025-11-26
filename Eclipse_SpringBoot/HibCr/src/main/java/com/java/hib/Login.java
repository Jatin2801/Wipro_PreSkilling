package com.java.hib;

import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;



public class Login {
public static void main(String[] args) {
	SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
	Session session = sf.openSession();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter user name : ");
	String username = sc.next();
	System.out.println("Enter Password : ");
	String password = sc.next();
	Criteria cr = session.createCriteria(Login.class);
	cr.add(Restrictions.eq("username", username));
	cr.add(Restrictions.eq("password", password));
	Login loginFound = (Login)cr.uniqueResult();
	System.out.println(loginFound);
//	cr.setProjection(Projections.rowCount());
//	long  count =(Long)cr.uniqueResult();
//	if(count==1) {
//		System.out.println("correct");
//	}else {
//		System.out.println("invalid");
//	}
}
}
