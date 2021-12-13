<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
</head>
<body>
	<h3>선언문으로 구현한 덧샘</h3>
	<%!
		public int sum(int a, int b) {
			return a+b;
		}
	%>
	덧샘의 결과 : 30 + 50 = <%=this.sum(30, 50) %>
</body>
</html>

