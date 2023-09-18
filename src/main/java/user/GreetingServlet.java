package user;

import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/GreetingServlet")
public class GreetingServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		HttpSession session = req.getSession();
        String userName = (String) session.getAttribute("userName");
        resp.getWriter().println("<h1>Hello, " + userName + "</h1>");
        
	}
    
}

