<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.edu.beans.BookBean" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<% BookBean book = new BookBean(); %>

<c:set target="<%=book %>" property="title" value="The Secret" />
<%=book.getTitle()%><br>

<c:set var="b" value="<%=book %>"/>
<c:set target="${b}" property="title" value="Sempio" />
${b.title}

<hr>

<% String str = request.getParameter("msg"); %>

<c:catch var="e">
	<%
		if(str.equals("add")) {
			out.print(str);
		}
	%>
</c:catch>
<c:out value="${e}"/>

