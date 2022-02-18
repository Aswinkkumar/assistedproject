package com.user;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class Logout extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	HttpSession session=request.getSession();  
	request.getSession().invalidate();
	
		PrintWriter out = response.getWriter();
		
		request.getSession().invalidate();
		
		out.println("<h2 style=\"color:blue\" align=\"center\" >You are Successfully logged out<br/><br/></br><h2>");
		
		out.println("<a href='index.html'><div align style=\"color:black\" align=\"center\" >Login again<br></a></div>");
	}

}