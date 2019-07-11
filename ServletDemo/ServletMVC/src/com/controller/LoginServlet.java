package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Deparment;
import com.service.Service;
import com.serviceimp.ServiceImp;
@WebServlet(urlPatterns="/login")
public class LoginServlet  extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse res)
			throws ServletException, IOException {
		
		Service s=new ServiceImp();
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		if(email.equals("admin") && password.equals("admin"))
		{
			List<Deparment>list=s.showData();
			
			request.setAttribute("data", list);

			RequestDispatcher rd=request.getRequestDispatcher("success.jsp");	
			rd.forward(request, res);
		}
	}

}
