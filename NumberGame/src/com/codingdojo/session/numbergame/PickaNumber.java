package com.codingdojo.session.numbergame;

import java.io.IOException;
import java.util.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
        HttpSession session = request.getSession();
		Integer counter = (Integer)session.getAttribute("seshCount");
		Random ran = new Random();
		counter = ran.nextInt(11)+1;
		if(session.getAttribute("seshCount")==null) {
			session.setAttribute("seshCount", counter);
		}
		int num = Integer.parseInt(request.getParameter("number"));
        if((Integer)session.getAttribute("seshCount") == num) {
        	request.setAttribute("result", 1);
        }
        else {
        	request.setAttribute("result", 2);
        }
		
        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
        view.forward(request, response);
	}

}
