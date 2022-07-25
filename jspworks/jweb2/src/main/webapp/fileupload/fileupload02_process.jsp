<%@page import="java.io.File"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<style type="text/css">
table{width: 300px;}
table, th{border: 1px solid black; padding:10px ;}
</style>
<%
   request.setCharacterEncoding("utf-8");

	//업로드 폴더 경로
	String realFolder = "C:\\master\\jspworks\\jweb2\\src\\main\\webapp\\upload";

	//5개의 매개변수 설정
	MultipartRequest multi = new MultipartRequest(request, realFolder, 5 * 1024 * 1024, "utf-8", new DefaultFileRenamePolicy());
	
	//폼 데이터 가져오기
	String name1 = multi.getParameter("name1");
	String title1 = multi.getParameter("title1");
	
	String name2 = multi.getParameter("name2");
	String title2 = multi.getParameter("title2");
	
	String name3 = multi.getParameter("name3");
	String title3 = multi.getParameter("title3");

	//파일 정복 가져오기(스택 자료 구조)
	Enumeration<String> files = multi.getFileNames();
	
	String file3 = files.nextElement();
	String filename3 = multi.getFilesystemName(file3);
	
	String file2 = files.nextElement();
	String filename2 = multi.getFilesystemName(file2);
	
	String file1 = files.nextElement();
	String filename1 = multi.getFilesystemName(file1);
	
/* Enumeration<String> files = multi.getFileNames();
	
	while (files.hasMoreElements()) { //파일이 있다면 반복
        String name = files.nextElement(); //파일의 이름을 가져오기
        String fileName = multi.getFilesystemName(name); //서버에 업로드 된 파일 가져오기
        String original = multi.getOriginalFileName(name); //파일이 서버에 저장되기 전 파일 이름
        String type = multi.getContentType(name); //파일이 콘텐츠 유형
        File file = multi.getFile(name);   //전송된 파일의 정보나 경로 */
%>
<table>
	<tr>
		<th>이름</th>
		<th>제목</th>
		<th>파일</th>
	</tr>
	<tr>
		<th><%=name1 %></th>
		<th><%=title1 %></th>
		<th><%=filename1 %></th>
		<th><img src="../upload/<%=filename1 %>"></th>
	</tr>
	<tr>
		<th><%=name2 %></th>
		<th><%=title2 %></th>
		<th><%=filename2 %></th>
		<th><img src="../upload/<%=filename2 %>"></th>
	</tr>
	<tr>
		<th><%=name3 %></th>
		<th><%=title3 %></th>
		<th><%=filename3 %></th>
		<th><img src="../upload/<%=filename3 %>"></th>
	</tr>
</table>
