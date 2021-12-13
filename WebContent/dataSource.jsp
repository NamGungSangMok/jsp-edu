<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<%@ page import="javax.naming.*" %>
<%
	InitialContext ic = new InitialContext();
	DataSource dc = (DataSource) ic.lookup("java:comp/env/jdbc/myoracle");
	Connection conn = dc.getConnection();
	
	Statement stmt 	= conn.createStatement();
	
	stmt.executeUpdate("create table test(id varchar2(5), pwd varchar2(5))");
	
	stmt.executeUpdate("insert into test values('aa','11')");
	stmt.executeUpdate("insert into test values('bb','22')");
	
	PreparedStatement pstmt = conn.prepareStatement("insert into test values(?,?)");
	pstmt.setString(1, "cc");
	pstmt.setString(2, "33");
	pstmt.executeUpdate();
	
	ResultSet rs = stmt.executeQuery("select * from test");
	while (rs.next()) {
		out.print("<br>" + rs.getString("id") + ":" + rs.getString(2));
	}
	
	stmt.executeUpdate("drop table test");
	
	pstmt.close();
	stmt.close();
	conn.close();
%>
OK

