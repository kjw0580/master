<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Navbar</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="#">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Link</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Dropdown
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <li><a class="dropdown-item" href="/boardList.do">게시판</a></li>
            <li><a class="dropdown-item" href="/memberForm.do">회원가입</a></li>
            <li><a class="dropdown-item" href="/loginMember.do">로그인</a></li>
            <li><a class="dropdown-item" href="/memberList.do">회원목록</a></li>
          </ul>
        </li>
        <li class="nav-item">
          <a class="nav-link disabled">Disabled</a>
        </li>
      </ul>
      <form class="d-flex">
        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>
    </div>
  </div>
</nav>

<%-- <nav class = "navbar navbar-expand navbar-dark" style="background-color: #85586F">
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
</nav> --%>
