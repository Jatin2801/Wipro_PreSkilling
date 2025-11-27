package com.java.hibernatelibraryproject.resources;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.text.Position.Bias;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class MainProg {

	SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
	Session s = sf.openSession();
	Query q;

	public int loginCheck(LibUsers lib) {

		q = s.createQuery(
				"from LibUsers where username='" + lib.getUsername() + "' and password='" + lib.getPassword() + "'");
		List<LibUsers> lst = q.list();

		if (lst.isEmpty())
			return 0;
		else
			return 1;

	}

	public List<Books> searchBooks(String searchtype, String searchvalue) {

		if (searchtype.equals("id"))
			q = s.createQuery("from Books where id=" + Integer.parseInt(searchvalue));
		else if (searchtype.equalsIgnoreCase("dept"))
			q = s.createQuery("from Books where dept='" + searchvalue + "'");

		else if (searchtype.equalsIgnoreCase("bookname"))
			q = s.createQuery("from Books where name='" + searchvalue + "'");

		else if (searchtype.equalsIgnoreCase("authorname"))
			q = s.createQuery("from Books where author='" + searchvalue + "'");
		else
			q = s.createQuery("from Books where name!='" + searchvalue + "' or 1=1");

		List<Books> lst = q.list();

		if (lst.isEmpty())
			return null;
		else
			return lst;

	}

	public String issuedOrNot(String user, int bid) {

		q = s.createQuery("from TransBook where userName='" + user + "' and bookId=" + bid);
		List<TransBook> lst = q.list();

		if (!lst.isEmpty()) {
			return "yes";
		} else {
			return "no";
		}
	}

	public void issueBook(TransBook tb) {
		SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		s.save(tb);
		t.commit();

		t = s.beginTransaction();
		q = s.createQuery("from Books where id=" + tb.getBookId());
		List<Books> lst = q.list();

		// Transaction t1 = s.beginTransaction();
//		t.begin();
		Books b1 = new Books();
		if (lst.size() > 0) {
			for (Books b2 : lst) {
				b1 = b2;
				// b2.setTotalbooks(b2.getTotalbooks() - 1);

			}
			b1.setTotalbooks(b1.getTotalbooks() - 1);
		}

		s.save(b1);
		t.commit();

	}

	public List<TransBook> showBooks(String user) {
		q = s.createQuery("from TransBook where userName='" + user + "'");

		List<TransBook> lst = q.list();
		if (lst.isEmpty()) {
			return null;
		} else {
			return lst;
		}
	}

	public void UpdateBook(TransBook tb) {

		q = s.createQuery("from Books where id=" + tb.getBookId());
		List<Books> lst = q.list();

		Books b1 = new Books();
		if (lst.size() > 0) {
			for (Books b2 : lst) {
				b1 = b2;
			}
			b1.setTotalbooks(b1.getTotalbooks() + 1);
		}

		s.save(b1);

	}
	//return book

	public int returnBooks(int bookid, String userName) throws ParseException {

		q = s.createQuery("from TransBook where userName='" + userName + "' and bookid=" + bookid);
		List<TransBook> lst = q.list();

		if (lst.isEmpty()) {
			return -1;
		}

		TransBook tb = lst.get(0);
		TransReturn tr = new TransReturn();

		String fdate = tb.getFromDate();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date idate = sdf.parse(fdate);
		Date rdate = new Date();

		int totalDays = (int) ((rdate.getTime() - idate.getTime()) / (1000 * 60 * 60 * 24));

		int fine = 0;
		if (totalDays > 30) {
			fine = (totalDays - 30) * 10;
		}

		tr.setBookid(bookid);
		tr.setUserName(userName);
		tr.setFromdate(fdate);
		tr.setToDate(sdf.format(rdate));

		Transaction t = s.beginTransaction();
		s.save(tr);

		UpdateBook(tb);

		s.delete(tb);

		t.commit();

		return fine;
	}

	public List<TransBook> accountDetails(String user) {

		q = s.createQuery("from TransBook where userName='" + user + "'");
		List<TransBook> lst = q.list();

		return lst;
	}

	public List<TransReturn> bookHistory(String user) {

		q = s.createQuery("from TransReturn where userName='" + user + "'");
		List<TransReturn> lst = q.list();

		return lst;
	}

	//login
	public String addLogin(LibUsers lib) {
		q = s.createQuery("from LibUsers where username ='" + lib.getUsername() + "'");
		List<LibUsers> lst = q.list();
		if (!lst.isEmpty()) {
			return "User Already Exists";
		} else {
			Transaction t = s.beginTransaction();
			s.save(lib);
			t.commit();
			return "User Added Successfully";
		}
	}

	//add book
	public String addBook(Books b) {

		q = s.createQuery("from Books where name = '" + b.getName() + "' and author='" + b.getAuthor() + "'");
		List<Books> lst = q.list();
		Transaction t = s.beginTransaction();

		if (!lst.isEmpty()) {

			Books oldBook = lst.get(0);
			oldBook.setTotalbooks(oldBook.getTotalbooks() + b.getTotalbooks());
			s.update(oldBook);
			t.commit();
			return "Book Already Exists → Copies Updated Successfully";
		} else {

			q = s.createQuery("from Books where id = " + b.getId());
			List<Books> checkId = q.list();
			if (!checkId.isEmpty()) {
				t.rollback(); // abort transaction
				return "ID already exists! Please use a unique Book ID.";
			}

			s.save(b);
			t.commit();
			return "New Book Added Successfully";
		}
	}

}
