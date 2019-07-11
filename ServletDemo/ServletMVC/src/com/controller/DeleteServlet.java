package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

import com.dao.Dao;
import com.daoimp.DaoImp;
import com.model.Deparment;

@WebServlet(urlPatterns="/delete")
public class DeleteServlet  extends HttpServlet{
	
	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		
			int rd=Integer.parseInt(request.getParameter("id"));
		
			Dao d=new DaoImp();
			d.deleteData(rd);
		
			List<Deparment>list=d.showData();
			request.setAttribute("data", list);
			
			RequestDispatcher r=request.getRequestDispatcher("success.jsp");
			
			r.forward(request, response);
		
		
		
		
		
		
		
		
	
	}
	

}
