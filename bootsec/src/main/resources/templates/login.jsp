<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- action태그와 input nmae은 고정이다 -->
	<form action="${pageContext.request.contextPath}/login" 
		  method="post">
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
		<input name="userid" type="text">
		<input name="password" type="password">
		<button>로그인</button>
	</form>
</body>
</html>