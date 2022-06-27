package classpart;

public class StudentTest {
	
	public static void main(String[] args) {
		//클래스의 객체 사용
		//Student() - 생성자
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.studentId = 100;
		s1.studentName = "다이소";
		
		s1.showInfo();
		
		s2.studentId = 101;
		s2.studentName = "장그래";
		
		s2.showInfo();
		
		System.out.println(s1);
		System.out.println(s2);
	}
}
