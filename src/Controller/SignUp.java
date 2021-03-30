package Controller;

import java.io.IOException;
import java.io.PrintWriter;

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
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
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
		if(SignUpDAO.insertData(ub)==true)
		{
			out.println("<script type=\"text/JavaScript\">");
            out.println("alert(\"User Registered Successfully!\")");
            out.println("</script>");	
            //wait(1000);
    		
		}
		else
		{
			out.println("<script type=\"text/JavaScript\">");
            out.println("alert(\"Registeration Fail!\")");
            out.println("</script>");
            
		
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
        request.getRequestDispatcher("login.jsp").forward(request, response);

	}

}
