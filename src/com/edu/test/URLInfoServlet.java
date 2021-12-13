package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/urlInfo")
public class URLInfoServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
	
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>Request 정보 출력</title></head>");	
		out.print("<body><h1>요청 방식과 프로토콜 정보 </h1>");	
		out.print("요청 URI : " 							+ req.getRequestURI()	+"<br/>");	
		out.print("요청 URL : " 							+ req.getRequestURL()	+"<br/>");	
		out.print("Context Path(웹애플리케이션 경로) : " 		+ req.getContextPath()	+"<br/>");	
		out.print("요청 프로토콜 : " 							+ req.getProtocol()		+"<br/>");	
		out.print("Servlet Path(루트디렉토리 기준 서블릿 경로) :" 	+ req.getServletPath()	+"<br/>");	
		out.print("</body></html>");	
		out.close();
		
	}
}

