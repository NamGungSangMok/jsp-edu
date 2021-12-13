package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/queryTest")
public class QueryTestServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>Query 문자열 테스트</title></head>");	
		out.print("<body><h1>GET 방식 요청</h1>");	
		
		String id 			= req.getParameter("id");
		String[] hobbies 	= req.getParameterValues("hobby");
		out.print("ID : " + id	+ "<br/>");
		out.print("취미 : " );
		for (int i=0; i<hobbies.length; i++) {
			out.print(hobbies[i]+ " ");
		}
		out.print("<br/>");
		out.print("전체 질의문자열 : " + req.getQueryString());
		out.print("</body></html>");	
		out.close();
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>질의 문자열 테스트</title></head>");	
		out.print("<body><h1>POST 방식 요청</h1>");	
		
		ServletInputStream input = req.getInputStream();
		int len = req.getContentLength();
		byte[] buf = new byte[len];
		input.readLine(buf, 0, len);
		String s = new String(buf);
		out.print("전체 문자열 : " + s);
		out.print("</body></html>");	
		out.close();
	}
}


