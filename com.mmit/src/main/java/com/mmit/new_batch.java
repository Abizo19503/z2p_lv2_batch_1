package com.mmit;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.mmit.entity.Batch;
import com.mmit.entity.Student;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/add-batch"})
public class new_batch extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext contx = getServletConfig().getServletContext();
		
		String name = req.getParameter("BatchName");
		String date = req.getParameter("date");
		Batch new_batch = new Batch();
		new_batch.setName(name);
		new_batch.setStart_date(LocalDate.parse(date));
		List<Batch> list = (ArrayList<Batch>) contx.getAttribute("batches");
		if(list == null)
			list = new ArrayList<Batch>();
		
		list.add(new_batch);
		
		resp.sendRedirect(req.getContextPath() + "/batch_page");
	}
}
