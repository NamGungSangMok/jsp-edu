package com.edu.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/hello2")
public class FirstServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("init() 실행");
	}
	
	@Override
	public void service(ServletRequest req, ServletResponse res) 
			throws ServletException, IOException {
		System.out.println("service() 실행");
	}
	
}

