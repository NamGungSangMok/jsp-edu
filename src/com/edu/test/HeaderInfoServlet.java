package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/headerInfo")
public class HeaderInfoServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {

		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>Request 정보 출력</title></head>");	
		out.print("<body><h1>요청 헤더 정보</h1>");	
		Enumeration<String> em = req.getHeaderNames();
		while(em.hasMoreElements()) {
			String s = em.nextElement();
			out.print(s + " : " + req.getHeader(s) + "<br/>");
		}
		out.print("</body></html>");	
		out.close();
	}
}

