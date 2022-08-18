<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Menu</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
</head>
<body>
<nav class = "navbar navbar-expand navbar-dark" style="background-color: #85586F">
	<div class = "container">
		<div class = "navbar-header">
			<a class = "navbar-brand" href="/index.jsp">Home</a>
		</div>
		<div>
			<c:choose>
		<c:when test="${empty sessionId}">
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="/boardList.do">게시판</a></li>
			<li class="nav-item"><a class="nav-link" href="/memberForm.do">회원가입</a></li>
			<li class="nav-item"><a class="nav-link" href="/loginMember.do">로그인</a></li>
			<li class="nav-item"><a class="nav-link" href="/memberList.do">회원목록</a></li>
		</ul>
		</c:when>
		<c:otherwise>
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="/boardList.do">게시판</a></li>
			<li class="nav-item"><a class="nav-link" href="/memberView.do">나의 정보</a></li>
			<li class="nav-item"><a class="nav-link" href="/logout.do">(<c:out value="${name}" /> 님) 로그아웃</a></li>
			<li class="nav-item"><a class="nav-link" href="/memberList.do">회원목록</a></li>
		</ul>
		</c:otherwise>
	</c:choose>
		</div>
	</div>
</nav>
</body>
</html>