package com.codingdojo.session.numbergame;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PickaNumber
 */
@WebServlet("/home")
public class PickaNumber extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public PickaNumber() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
        view.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        
        request.setAttribute("name", name);
        RequestDispatcher view = request.getRequestDispatcher("home.jsp");
        view.forward(request, response);
	}

}
