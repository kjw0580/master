<%@page import="java.util.Arrays"%>
<%@page import="java.util.ArrayList"%>
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
		//배열
		int[] arr = new int[]{10, 20, 30};
		for(int i=0; i<arr.length; i++){
			out.println(arr[i]);
		}
		
		//Arrays 클래스
		int[] arr2 = new int[]{10, 20, 30};
		out.println(Arrays.toString(arr2));
		
		ArrayList<String> fruitList = new ArrayList<>();		
		fruitList.add["참외"];
		fruitList.add["사과"];
	%>
</body>
</html>