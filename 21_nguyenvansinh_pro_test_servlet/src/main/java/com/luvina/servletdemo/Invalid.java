/**
 * Copyright(C) 2021 Luvina
 * Invalid.java, Nov 11, 2021 Sinhnv
 */
package com.luvina.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * @author Sinhnv
 *
 */
public class Invalid extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		
		String Uname=req.getParameter("Uname");
		String Upass=req.getParameter("Upass");
		String result="";	
		if(Uname.equals("Luvina") && Upass.equals("Luvina")){ 
			result="Welcome";
		} else{
			result="Invalid username or password";}
		out.println("<html><head><title>Login Servlet</title></head><body>");
		out.println("<h1>" + result + "</h1>");
		out.println("</body></html>");

		
		

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
