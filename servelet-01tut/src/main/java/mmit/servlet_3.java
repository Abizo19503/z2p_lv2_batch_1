package mmit;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/servlet_3"})
public class servlet_3 extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		var name = req.getParameter("uname");
		var pass = req.getParameter("upass");
		
		out.write("<html>");
		out.write("<body>");
		out.write("<h3>Servlet_2</h3>");
		out.write("<h1>MinGaLarPar</h1>");
		out.print("<h5>Username: " + name+ "</h5>");
		out.print("<h5>Password: " + pass+ "</h5>");
		getServletContext().getRequestDispatcher("Servlet_4").include(req, resp);
		out.print("</body></html>");
	}
}
