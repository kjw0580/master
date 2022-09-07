<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" href="/resources/css/style.css">
</head>
<body>
	<jsp:include page="../menu.jsp" />
	<div id="container">
		<section id="signup">
			<div class="title">
				<h2>ȸ�� ����</h2>
			</div>
			<form action="/member/update" method="post" 
				  onsubmit="return checkForm()" name="newWrite">
				<table class="tbl_signup">
					<tr>
						<td>���̵�</td>
						<td><input type="text" name="userid" value="${member.userid}"></td>
					</tr>
					<tr>
						<td>��й�ȣ</td>
						<td><input type="password" name="userpw"
						       value="${member.userpw}"></td>
					</tr>
					<tr>
						<td>��й�ȣ Ȯ��</td>
						<td><input type="password" name="userpw_confirm"
						       value="${member.userpw}"></td>
					</tr>
					<tr>
						<td>�̸�</td>
						<td><input type="text" name="username" value="${member.username}"></td>
					</tr>
					
					<tr>
						<td colspan="2">
							<input type="submit" value="����">
							<a href="/member/delete?userid=<c:out value="${member.userid }"/>"
								onclick="return confirm('������ Ż���Ͻðڽ��ϱ�?')">
								<input type="button" value="Ż��">
							</a>
							<a href="/member/memberList"><input type="button" value="���"></a>
						</td>
					</tr>
				</table>
				<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			</form>
		</section>
	</div>
</body>
</html>