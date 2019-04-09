package com.wap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserServlet extends HttpServlet {
				
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
				
		PrintWriter printWriter = resp.getWriter();
				
		String login = req.getParameter("login");
		String email = req.getParameter("email");
		String nazwa = req.getParameter("nazwa");
	    String haslo = req.getParameter("haslo");
	    
	    HttpSession session = req.getSession(true);
	    Uzytkownik uz1 = new Uzytkownik(login, email, nazwa, haslo);
	    
	    session.setAttribute("user", uz1);
	    session.setMaxInactiveInterval(10);
	    
		printWriter.write("Tworzymy uzytkownika");
						
	}
	
}
