package com.wap;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class UserDetail extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
	
	HttpSession session = req.getSession(false);
	
	PrintWriter printWriter = resp.getWriter();
	
	resp.setContentType("text/html");
	
	printWriter.write("<html><body>");
	if(session != null) {
		Uzytkownik uz1 = (Uzytkownik)session.getAttribute("user");
		printWriter.write("<h2>email: "+uz1.getEmail()+" </br>login= "+uz1.getLogin()+" </br> nazwa: "+uz1.getNazwa()+ " </br> haslo: "+ uz1.getHaslo()+"</h2>");
	}
	else {
		printWriter.write("Brak uzytkownika");
	}
	
	printWriter.write("</body></html>");
	}

}
