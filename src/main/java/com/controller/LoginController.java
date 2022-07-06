package com.controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.UseDTO;
import com.service.LoginService;

import java.io.IOException;
import java.net.http.HttpRequest;
	
@WebServlet("/login")
public class LoginController extends HttpServlet {

	private static final long serialversionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("do post method");

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		LoginService loginService = new LoginService();
		boolean isAuthenticated = loginService.authenticateUserLogin(username, password);
		if (isAuthenticated) {
			
//			Get full name
			
			String fullName = loginService.getFullNameByUserName(username);
			
			UseDTO UseDTO=loginService.getFullDetailsOfUser(username);
			
			request.getSession().setAttribute("fullNAme", fullName);
			
			request.getSession().setAttribute("UseDto", UseDTO);
			
			response.sendRedirect("home.jsp");

		} else {
			response.sendRedirect("login.jsp");
		}
	}

}
