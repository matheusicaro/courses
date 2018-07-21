package br.com.alura.gerenciador.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/Logout")
public class Logout extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		Cookie getLoggedUser = new Cookies(req.getCookies()).getUserCookie();
		getLoggedUser.setMaxAge(0);
		
		resp.addCookie(getLoggedUser);
		PrintWriter writer = new PrintWriter(resp.getWriter());
		
        writer.println("<html><body>Deslogado com sucesso!</body></html>");

	}

}
