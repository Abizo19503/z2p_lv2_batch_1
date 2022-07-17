package com.mmit;

import java.io.IOException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet(urlPatterns = {"/scopes"})
public class ScopeServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//context scope
		ServletContext context = getServletConfig().getServletContext();
		context.setAttribute("Cscope","This is context scope");
		
		//session scope
		HttpSession session = req.getSession(true);
		session.setAttribute("Sscope", "This is session scope");
		
		//req scope
		req.setAttribute("Reqscope", "This is req scope");
		
		getServletContext().getRequestDispatcher("/first.jsp").forward(req, resp);
		
	}
	}

