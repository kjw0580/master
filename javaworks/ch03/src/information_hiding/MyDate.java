package information_hiding;

public class MyDate {

	//필드
	private int day;
	private int month;
	private int year;
	
	
	public void setDay(int day) {
		if(month == 2) {
			if(day < 1 || day > 28) {
				if(day == 29) {
					if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
						System.out.println("윤년입니다.");
					}
					System.out.println("날짜 오류입니다.");
				}
			}
		}
		this.day = day;
	}

	public int getDay() {
		return day;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public int getYear() {
		return year;
	}
}
