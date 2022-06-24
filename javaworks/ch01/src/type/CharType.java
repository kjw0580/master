package type;

public class CharType {

	public static void main(String[] args) {
		// 문자 자료형 - 아스키 코드 < 유니코드
		//char - 2바이트
		char ch1 = 'A';  //문자형 변수 ch1에 'A'를 저장
		System.out.println(ch1);  //A
		System.out.println((int)ch1); //숫자 코드값
		
		char ch2 = 66;
		System.out.println(ch2);
		
		System.out.println("***** 유니코드 *****");
		
		char uniCode1 = '한'; //한문자이므로 홑따옴표 사용
		System.out.println(uniCode1);
		
		char uniCode2 = '\uD55C'; //유니코드 한문자 표기
		System.out.println(uniCode2);
		
		//영어 소문자 출력
		for(char c = 97; c < 123; c++) {
			System.out.print(c + " ");
		}
		
		
	}

}
