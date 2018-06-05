package com.trinity.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Action")
public class Action extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		 response.setContentType("text/html");

	      PrintWriter out = response.getWriter();
	      //String title = "Using GET Method to Read Form Data";
	      out.println("okkkkk");
		
		//response.sendRedirect("/index.jsp");
		
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//response.setContentType("text/html");

	     // PrintWriter out = response.getWriter();
	      //String title = "Using GET Method to Read Form Data";
	     // out.println("okkkkk");
		response.sendRedirect("index.jsp");
	}
	
	
	
}
