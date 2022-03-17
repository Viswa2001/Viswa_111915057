package com.registration;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LogIn extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		String pass=request.getParameter("pass");
		
		LoginDao dao= new LoginDao();
		if(dao.check(id, pass))
		{
			HttpSession session=request.getSession();
			session.setAttribute("id", id);
			response.sendRedirect("report.jsp");
		}
		else
		{
			response.sendRedirect("login.jsp");
		}

	}

	
}