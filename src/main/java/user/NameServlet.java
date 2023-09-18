package user;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/name")
public class NameServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");

		if (name != null && !name.isEmpty()) {
			// Store the name in the session
			HttpSession session = req.getSession();
			session.setAttribute("userName", name);
            req.getRequestDispatcher("GreetingServlet").forward(req, resp);	
		} else {
			// Handle invalid input
			resp.getWriter().println("<h1>Please enter a valid name.</h1>");
		}
	}
}
