package reference;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student lee = new Student(1001, "이양파");
		Student park = new Student(1002, "박마늘");
		
		lee.koreanSubject("국어", 90);
		lee.mathSubject("수학", 80);
		park.koreanSubject("국어", 95);
		park.mathSubject("수학", 70);
		
		
		park.showInfo();
		lee.showInfo();
	}

}
