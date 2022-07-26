<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보</title>
<style>
table{width:400px; margin:0 auto; text-align:center;}
table, td, th{border: 1px solid #ccc; border-collapse:collapse}
table td{height: 50px;}
table input{height:30px}
</style>
</head>
<%
	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("id");
	String passwd = request.getParameter("passwd");
	String name = request.getParameter("name");

%>
<body>
	<div id="container">
		<h2>회원 정보</h2>
		<hr>
		<table>
			<tr>
				<th>아이디</th>
				<th>패스워드</th>
				<th>이름</th>
			</tr>
			<tr>
				<td><%=id %></td>
				<td><%=passwd %></td>
				<td><%=name %></td>
			</tr>
		</table>
	</div>
</body>
</html>