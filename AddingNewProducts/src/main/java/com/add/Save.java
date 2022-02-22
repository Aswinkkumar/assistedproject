package com.add;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.add.Product;
import com.add.HibernateUtil;


@WebServlet("/save")
public class Save extends HttpServlet {
	private static final long serialVersionUID = 1L;     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SessionFactory factory= HibernateUtil.getSessionFactory();
		Session session=factory.openSession();		
		Transaction tx= session.beginTransaction();
		Product cust= new Product("black pen","black ink");
		session.save(cust);
		tx.commit();
		session.close();
		response.getWriter().print("<h1><center>Data Inserted</center></h1>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}