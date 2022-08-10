
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class User
 */
public class LoginServlet8 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet8() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user=request.getParameter("user");
		PrintWriter pw=response.getWriter();
		pw.print("Hello " + user);
		response.setContentType("text/html");
		pw.print(
				"<html>"
				+ "<body>"
				+ "<form action='SecondServlet8'>"
				+ "<input type='hidden' name='user' value="+"'"+user+"'>"
				+ "<input type='submit'>"
				+ "</body>"
				+ "</html>"
				);
	}

}

