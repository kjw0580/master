<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록 보기</title>
<style>
body{width:100%}
h2{margin:10px auto; text-align:center; border-bottom:1px solid #555; width:100%; padding:20px;}
table{border-collapse:collapse; text-align:center; margin:0 auto;}
td{height:30px;}
th{background : #eee;}
</style>
</head>
<body>
<%
      String driverClass = "com.mysql.cj.jdbc.Driver";
      String url = "jdbc:mysql://localhost:3306/jspdb?useUnicode=true&serverTimezone=Asia/Seoul";
      String username = "root";
      String password = "12345";
      
      Connection conn = null;
      PreparedStatement pstmt = null;
      ResultSet rs = null;
      
      try{
         Class.forName(driverClass);
         conn = DriverManager.getConnection(url, username, password);
         String sql = "select * from user";
         pstmt = conn.prepareStatement(sql);
         rs = pstmt.executeQuery();
         out.println("<h2>회원명단</h2>");
         out.println("<table border=1 width=500 collapse>");
         out.println("<tr><th>아이디</th><th>비밀번호</th><th>이름</th></tr>");
         while(rs.next()){
        	 out.println("<tr><td>" + rs.getInt("uid") + "</td>");
        	 out.println("<td>" + rs.getString("pwd") + "</td>");
        	 out.println("<td>" + rs.getString("name") + "</td></tr>");
         }
         out.println("</table>");
      }catch(Exception e){
         out.println("MySQL DB 연결 실패했습니다");
         out.println(e.getMessage());
      }finally{
    	 if(rs != null){
    		 rs.close();
    	 }
    	 if(pstmt != null){
    		 pstmt.close();
    	 }
         if(conn != null){
            conn.close();
         }
      }
   %>
</body>
</html>