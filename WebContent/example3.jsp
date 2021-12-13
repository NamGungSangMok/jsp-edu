<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<%
	response.setStatus(200);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>예외사항 처리</title>
</head>
<body>
	<h4>다음과 같은 에러가 발생했습니다.</h4>
	에러 타입 : 
	<%=exception.getClass().getName() %>
	<br>
	에러메시지 :
	<%=exception.getMessage() %>
</body>
</html>

