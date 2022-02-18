package com.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Dashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

	    response.setContentType("text/html"); 
	    PrintWriter pwriter = response.getWriter(); 
	 
	    String name=request.getParameter("uname"); 
	   
	    pwriter.print("<h1 style=\\\"color:red\\\" align=\\\"center\\\" > Welcome to Page!! "); 
	    pwriter.print("<div align style=\\\"color:red\\\" align=\\\"center\\\" > Hello "+name+"!<br/><br/></br></div>");
        pwriter.println("  <a href='logout'>Logout of session</a><br>");
       
	    
	 } 
	
	 
	} 