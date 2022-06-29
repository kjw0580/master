package statics;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student lee = new Student();
		Student han = new Student();
		
		
		lee.setName("이대한");
		han.setName("한지수");
		
//		System.out.println(lee.seriaNum);
		Student.serialNum++;
		System.out.println(Student.serialNum); //클래스로 직접 접근
		System.out.println(lee.getName());
		
		Student.serialNum++;
		System.out.println(Student.serialNum); //클래스로 직접 접근
		System.out.println(han.getName());
	}

}
