package chap05;

public class test5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LoginResult result = LoginResult.FAIL_PASSWORD;
		if(result == LoginResult.SUCCESS_ID) {
			System.out.println("로그인 성공");
		}else if(result == LoginResult.FAIL_ID) {
			System.out.println("아이디가 틀렸습니다.");
		}else if(result == LoginResult.FAIL_PASSWORD) {
			System.out.println("비밀번호가 틀렸습니다.");
		}
	}

}
