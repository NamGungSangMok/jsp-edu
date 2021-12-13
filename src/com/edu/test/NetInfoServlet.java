package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/netinfo")
public class NetInfoServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
	
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<html><head><title>Request 정보 출력</title></head>");	
		out.print("<body><h1>네트워크 관련 요청 정보</h1>");	
		out.print("요청 시 사용한 프로코톨 : " 	+ req.getScheme()		+"<br/>");	
		out.print("서버 이름 : " 			+ req.getServerName()	+"<br/>");	
		out.print("서버 주소 : " 			+ req.getLocalAddr()	+"<br/>");	
		out.print("서버 포트 : " 			+ req.getServerPort()	+"<br/>");	
		out.print("클라이언트 주소 : " 		+ req.getRemoteAddr()	+"<br/>");	
		out.print("클라이언트 호스트명 : " 		+ req.getRemoteHost()	+"<br/>");	
		out.print("클라이언트 포트 : " 		+ req.getRemotePort()	+"<br/>");	
		out.print("</body></html>");	
		out.close();
	}
}

