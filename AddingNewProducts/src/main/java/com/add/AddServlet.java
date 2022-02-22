package com.add;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.add.Product;
import com.add.HibernateUtil;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		SessionFactory factory= HibernateUtil.getSessionFactory();
		Session session=factory.openSession();
		
		List<Product> list= session.createQuery("from Product").list();
		
		PrintWriter out=response.getWriter();
		 out.println("<html><body>");
         out.println("<b>Product Listing</b><br>");
		for(Product c:list) {
			out.print(c.getProductname()+" "+c.getProductdesc());
		out.print("Data Added <br/><br/></br>");
		
	}
	out.println("</body></html>");
		}catch (Exception ex) {
            throw ex;
    }
	}
	

}
