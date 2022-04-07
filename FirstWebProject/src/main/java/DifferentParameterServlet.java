
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/DifferentParameterServlet")
public class DifferentParameterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, jakarta.servlet.http.HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();

		Enumeration<String> paraname = request.getParameterNames();
		while (paraname.hasMoreElements()) {
			String parameString = paraname.nextElement();
			out.println("<ol>");
			out.println("<li>" + paraname + "->" + request.getParameterValues(parameString) + "</li>");
			out.println("</ol>");
		}

	}
}
