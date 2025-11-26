package com.java.hib;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import com.java.hib.model.Employ;

public class EmployShowNames {
	public static void main(String[] args) {
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Criteria cr = session.createCriteria(Employ.class);
		Projection projection = Projections.property("name");
		cr.setProjection(projection);
		List<String> strList = cr.list();
		for (String s : strList) {
			System.out.println(s);
		}
	}
}
