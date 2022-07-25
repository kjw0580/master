<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script>
	function checkForm(){
		
		let form = document.frm;
		let name = form.name.value;
		
		//정규 표현식 - 이름 항목은 숫자로 시작할 수 없음.
		let regExp = /^[a-zA-Z가-힣]/;
		
		if(!regExp.test(name)){
			alert("이름은 숫자로 시작할 수 없습니다.");
		}
		
		form.submit();
	}
</script>
</head>
<body>
	<form action="" method="post" name="frm">
	
	</form>
</body>
</html>