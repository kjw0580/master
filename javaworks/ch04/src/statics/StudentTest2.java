package statics;

public class StudentTest2 {

	public static void main(String[] args) {
	
		Student2 lee = new Student2();
		Student2 han = new Student2();
		lee.setName("이대한");
		han.setName("한지수");
		
		System.out.println("학번 : " + lee.getId());
		System.out.println("이름 : " + lee.getName());
		
		System.out.println("학번 : " + han.getId());
		System.out.println("이름 : " + han.getName());
	}
}
