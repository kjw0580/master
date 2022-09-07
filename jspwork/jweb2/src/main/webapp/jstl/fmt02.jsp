<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>다국어 처리</title>
</head>
<body>
	<h2>Java Server Page</h2>
	<fmt:setLocale value="${param.language}"/>
	<fmt:setBundle basename="com.bundle.message"/>
	
	<a href="?Language=ko">KOR</a> | <a href="?Language=en">ENG</a>
	
	<p>제 목 : <fmt:message key="title" />
	<p>이 름 : <fmt:message key="username" />
</body>
</html>