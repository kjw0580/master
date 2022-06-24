package type;

public class Variable {

	public static void main(String[] args) {
		String name;   //문자열 변수 name 선언(할당)
		name = "한지수";
		
		int grade;  //정수형 변수 grade 선언
		grade = 2;
		
		//int class; 예약어는 변수로 사용할 수 없음
		int schoolClass = 3;
		
		System.out.println(name + "는 " + grade 
				+ "학년 " + schoolClass + "반입니다.");
	}
}
