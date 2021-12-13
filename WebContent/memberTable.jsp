<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>

<%
	Class.forName("oracle.jdbc.driver.OracleDriver");
	String url 		= "jdbc:oracle:thin:@192.168.2.151:1521:SWSPROD";
	Connection conn = DriverManager.getConnection(url, "cc", "cc");
	Statement stmt 	= conn.createStatement();
	
	stmt.executeUpdate("create table test_member(id varchar2(5), pwd varchar2(5))");
	out.print("test member 테이블이 생성되었습니다.");
	stmt.close();
	conn.close();
%>

