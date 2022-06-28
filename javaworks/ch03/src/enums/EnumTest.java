package enums;

enum Level{
	LOW,
	MEDIUM,
	HIGH
}

public class EnumTest {

	public static void main(String[] args) {
		Level level = Level.MEDIUM;
		
		switch(level) {
		case LOW:
			System.out.println("Low Level");
			break;
		case MEDIUM:
			System.out.println("Medium Level");
			break;
		case HIGH:
			System.out.println("High Level");
			break;
		default:
			System.out.println("레벨이 없습니다.");
			break;
		}
	}
	

}
