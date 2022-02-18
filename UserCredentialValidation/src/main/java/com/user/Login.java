package com.user;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;


public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Set the content type
		   response.setContentType("text/html");      
	       PrintWriter pwriter = response.getWriter();                
	       String name=request.getParameter("uname");      
	       String pass=request.getParameter("upass");                
	       if(name.equals("Aswin") && 
	          pass.equals("aswin123"))
	       {          
	          RequestDispatcher dis=request.getRequestDispatcher("Dashboard");          
	          dis.forward(request, response);      
	       }     
	       else
	       {      
	       
	          pwriter.println("<h1 style=\"color:red\" align=\"center\" > Enter valid username and password!! </h1>");
	          RequestDispatcher dis=request.getRequestDispatcher("index.html");          
	          dis.include(request, response); 
	          
	       }      
	   }    
	}  
