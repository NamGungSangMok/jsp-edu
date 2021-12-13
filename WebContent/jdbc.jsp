<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
    
<%
	Class.forName("oracle.jdbc.driver.OracleDriver");
	String url 		= "jdbc:oracle:thin:@192.168.2.151:1521:SWSPROD";
	Connection conn = DriverManager.getConnection(url, "cc", "cc");
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

