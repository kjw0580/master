package information_hiding;

public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate date = new MyDate();
		
		date.setMonth(2);
		date.setYear(2020);
		date.setDay(29);
		
		System.out.println("내 생일은 " + date.getYear() + "년 " +
		date.getMonth() + "월 " + date.getDay() + "일 ");
	}
}
