package eu.ensup.servletproject.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MethodsServlet
 */

@WebServlet("/Accueil")
public class MethodsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MethodsServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println(request.getSession());
		System.out.println(request.getContextPath());
		System.out.println(request.getLocalPort());
		System.out.println(request.getLocalAddr());
		System.out.println(request.getRemotePort());
		System.out.println(request.getCookies());
		System.out.println(request.getProtocol());
		System.out.println(request.getRemoteUser());
		System.out.println(request.getUserPrincipal());
		System.out.println(request.getRemoteHost());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
