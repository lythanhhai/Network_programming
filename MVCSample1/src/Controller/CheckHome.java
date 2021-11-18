package Controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.BO.CheckUser_BO;
import Model.bean.User;

/**
 * Servlet implementation class CheckHome
 */
@WebServlet("/CheckHome")
public class CheckHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckHome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String destination = null;
		CheckUser_BO checkUser_BO = new CheckUser_BO();
		ArrayList<User> listUser = new ArrayList<User>();
		try {
			listUser = checkUser_BO.getAllUser_BO("1");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String show = request.getParameter("show");
		String insert = request.getParameter("insert");
		if(show != null)
		{
			request.setAttribute("listUser", listUser);
			destination = "/Welcome.jsp";
			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
			rd.forward(request, response);			
		}
		if(insert != null)
		{
//			request.setAttribute("listUser", listUser);
//			destination = "/Welcome.jsp";
//			RequestDispatcher rd = getServletContext().getRequestDispatcher(destination);
//			rd.forward(request, response);
			destination = "formInsert.jsp";
			response.sendRedirect(destination);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
