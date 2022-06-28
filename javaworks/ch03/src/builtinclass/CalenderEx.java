package builtinclass;

import java.util.Calendar;

public class CalenderEx {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		//날짜 - 년, 월, 일
		String daybox = (" ");
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		
		//시간 - 시, 분, 초
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		//요일
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(year + "년 " + month + "월 " + date + "일");
		System.out.println(hour + "시 " + minute + "분 " + second + "초");
		
		if(day == 1) {
			daybox = ("일요일");
		}else if(day == 2) {
			daybox = ("월요일");
		}else if(day == 3) {
			daybox = ("화요일");
		}else if(day == 4) {
			daybox = ("수요일");
		}else if(day == 5) {
			daybox = ("목요일");
		}else if(day == 6) {
			daybox = ("금요일");
		}else {
			daybox = ("토요일");
		}
		System.out.println(daybox);
	}
}
