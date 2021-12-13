package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/addInfo")
public class AdditionalInfoServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {

		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>Request 정보 출력</title></head>");	
		out.print("<body><h1>추가적인 요청 정보 </h1>");	
		out.print("요청 방식 : " 			+ req.getMethod()			+"<br/>");	
		out.print("요청 경로 : " 			+ req.getPathInfo()			+"<br/>");	
		out.print("요청 절대 경로 : " 			+ req.getPathTranslated()	+"<br/>");	
		out.print("질의 문자열 : " 			+ req.getQueryString()		+"<br/>");	
		out.print("바디 데이터 길이 : " 		+ req.getContentLength()	+"<br/>");	
		out.print("바디 데이터형식 : " 		+ req.getContentType()		+"<br/>");	
		out.print("</body></html>");	
		out.close();
	}
}

