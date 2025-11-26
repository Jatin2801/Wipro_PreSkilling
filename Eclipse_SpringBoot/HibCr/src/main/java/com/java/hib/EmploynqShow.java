package com.java.hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.java.hib.model.Employ;

public class EmploynqShow {
	public static void main(String[] args) {
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Query query = session.getNamedQuery("showEmploy");
		List<Employ> employList = query.list();
		for (Employ employ : employList) {
			System.out.println(employ);
		}
	}
}
