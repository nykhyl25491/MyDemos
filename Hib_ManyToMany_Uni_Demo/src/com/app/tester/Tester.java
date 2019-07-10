package com.app.tester;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.app.pojo.Address;
import com.app.pojo.Author;
import com.app.pojo.Book;
import com.app.pojo.Employee;
import com.app.pojo.Project;
import  com.app.utils.HibUtil;


public class Tester {
	public static void main(String[] args) 
	{
		SessionFactory sf = HibUtil.getSf();
		Session session = null;
		Transaction tx = null;
		
		
		  try 
		  { 
			  Author author1 = new Author("Shashi","Pune");
			  Author author2 = new Author("Gauri","UP");
			  List<Author> aList = new ArrayList<Author>();
			  aList.add(author1);
			  aList.add(author2);
			  Book book = new Book("Java","Mast");
			  
			  book.setAuthors(aList);
			  session = sf.getCurrentSession();
			  tx = session.beginTransaction(); 
			  session.save(book);
			  tx.commit();
		  } 
		  catch (Exception e) 
		  { if(tx!=null) 
			  tx.rollback(); 
		  } 
		  finally {
		  session.close(); }
		 
	}
}
