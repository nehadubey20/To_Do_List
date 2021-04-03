package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.UserBean;
import DAO.SignUpDAO;

/**
 * Servlet implementation class SignUp
 */
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.sendRedirect("signup.jsp");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		register(request,response);		

	}
	
		private void register(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String phone = request.getParameter("phone");
		
		UserBean ub = new UserBean();
		ub.setFname(fname);
		ub.setLname(lname);
		ub.setUsername(username);
		ub.setPassword(password);
		ub.setPhone(phone);
		
		PrintWriter out=response.getWriter();
		try {
			boolean result = SignUpDAO.insertData(ub);
			if(result==true)
			{
				request.setAttribute("NOTIFICATION", "User Registered Successfully!");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("signup.jsp");
        dispatcher.forward(request, response);
		
     }
}

