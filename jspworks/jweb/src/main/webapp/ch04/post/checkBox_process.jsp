<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
	
	String[] fruit = request.getParameterValues("fruit");
	%>
	
	<h4>선택한 과일</h4>
	<p>
		<% for(String fru : fruit){
			out.println(fru);
		}
			%>	
	
	</p>
</body>
</html>