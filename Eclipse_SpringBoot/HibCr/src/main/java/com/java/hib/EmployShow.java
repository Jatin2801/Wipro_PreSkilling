package com.java.hib;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.java.hib.model.Employ;

public class EmployShow {
	public static void main(String[] args) {
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		List<Employ> employList = cr.list();
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
}
