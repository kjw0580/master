package enums;

import java.util.Calendar;

public class EnumWeek {

	public static void main(String[] args) {
		
		Week today = null; //null - 객체 초기화
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK); //요일을 나타내는 숫자 일 - 1 월 - 2 ....
		
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WEDNESDAY; break;
		case 5:
			today = Week.THIRSDAY; break;
		case 6:
			today = Week.FIRDAY; break;
		case 7:
			today = Week.SATURDAY; break;
		default:
			System.out.println("찾을수없습니다."); break;
		
		}
		System.out.println("오늘 요일 : " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 영화를 보러 갑니다.");
		}else {
			System.out.println("열심히 프로그램 코딩합니다.");
		}

	}

}
