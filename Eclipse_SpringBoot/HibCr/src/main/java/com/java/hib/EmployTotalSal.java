package com.java.hib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Projections;

import com.java.hib.model.Employ;

public class EmployTotalSal {
	public static void main(String[] args) {
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sf.openSession();
		double salary = (Double) session.createCriteria(Employ.class).
				setProjection(Projections.sum("basic")).uniqueResult();
		System.out.println(salary);
	}
}
