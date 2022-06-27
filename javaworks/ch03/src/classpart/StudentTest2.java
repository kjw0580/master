package classpart;

public class StudentTest2 {
	
	public static void main(String[] args) {
		//클래스의 객체 사용
		Student std1 = new Student();
		
		//student 멤버에 접근(점 연산자 사용)
		std1.studentId = 100;
		std1.studentName = "다있소";
		
		System.out.println("학번 : " + std1.studentId);
		System.out.println("이름 : " + std1.studentName);
	}
}
