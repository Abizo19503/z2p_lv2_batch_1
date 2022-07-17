package mmit;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/servlet_3"})
public class servlet_4 extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		var username = req.getParameter("uname");
		var password = req.getParameter("upass");
		PrintWriter out = resp.getWriter();
		if(username.equals("jeon") && password.equals("123")) {
			out.print("<h4>Login Success Content</h4>");
		}else {
			out.print("<h4>Authentication faillllll.....</h4>");
		}
	
		}
}
