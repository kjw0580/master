<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 등록 폼</title>
<script>
	function signUp(){
		let form = document.loginForm;
		let userid = form.userid.value;
		let passwd = form.passwd.value;
		
		//정규 표현식
		let a = /^[a-z]*$/
		
		
		if(form.userid.value == ""){
			alert("아이디를 입력해주세요");
			form.userid.focus();  //커서 표시
			return false;         //전송을 막음
		}
		if(!a.test(userid)){
			alert("아이디를 입력해주세요");
			form.userid.focus();  //커서 표시
			return false;         //전송을 막음
		}
		/* for(var 1=0; i<userid.length; i ++){
			var ch = userid.charAt(i);
			
			if(form.passwd.value == ""){ //비밀번호 값이 없는 경우
				alert("비밀번호를 입력해주세요");
				form.passwd.focus();  //커서 표시
				return false;         //전송을 막음
			}
		} */
		}
		if(passwd == ""){ //비밀번호 값이 없는 경우
			alert("비밀번호를 입력해주세요");
			form.passwd.focus();  //커서 표시
			return false;         //전송을 막음
		}
		if(isNaN(passwd)){ //비밀번호 값이 없는 경우
			alert("비밀번호는 숫자만 입력해주세요");
			form.passwd.focus();  //커서 표시
			return false;         //전송을 막음
		}
</script>
</head>
<body>
<form action="loginProcess2.jsp" method="post" name="loginForm">
		<p>
			<label for="userid">아이디 : </label>
			<input type="text" id="userid" name="userid">
		</p>
		<p>
			<label for="passwd">비밀번호 : </label>
			<input type="password" id="passwd" name="passwd">
		</p>
		<p><input type="button" value="로그인" onclick="checkForm()" >
	</form>
</body>
</html>



