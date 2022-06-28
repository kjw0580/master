 package classpart;

public class Student {
	//필드(멤버 변수)
	int studentId;       //학번
	String studentName;  //이름
	
	//기본 생성자 - 객체의 초기화, 생략할 수 있음
	//클래스 이름과 같으나, 함수는 아님 - 반환값이 없음
	//Student(){}
	
	//메소드(public - 접근제한자)
	public void showInfo() {  //반환 자료형이 없는 함수
		System.out.println("학번 : " + studentId + 
				", 이름 : " + studentName);
	}
}
