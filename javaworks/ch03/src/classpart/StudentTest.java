package classpart;

public class StudentTest {

	public static void main(String[] args) {
		// 클래스의 객체(인스턴스) 사용
		Student std1 = new Student();
		Student std2 = new Student();
		
		//std1 멤버에 접근(점 연산자 사용)
		std1.studentId = 100;
		std1.studentName = "다있소";
		
		std2.studentId = 101;
		std2.studentName = "장그래";
		
		System.out.println("학번 : " + std1.studentId);
		System.out.println("이름 : " + std1.studentName);
		
		System.out.println("학번 : " + std2.studentId);
		System.out.println("이름 : " + std2.studentName);

	}
}
