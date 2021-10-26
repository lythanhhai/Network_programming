

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/tinhToanServlet")
public class tinhToanServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public tinhToanServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public static long USCLN(long a, long b) {
        if (b == 0) return a;
        return USCLN(b, a % b);
    }
    public static long BSCNN(long a, long b) {
        return (a * b) / USCLN(a, b);
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		long a = Integer.parseInt(request.getParameter("value1"));
		long b = Integer.parseInt(request.getParameter("value2"));
		
		PrintWriter printWriter = response.getWriter();
		printWriter.print("<p> USCLN la  " + String.valueOf(USCLN(a, b)) + "</p>");
		printWriter.print("<p> BSCLN la  " + String.valueOf(BSCNN(a, b)) + "</p>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
