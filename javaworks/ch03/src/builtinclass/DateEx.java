package builtinclass;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateEx {

	public static void main(String[] args) {
		// Date클래스 사용
		Date today = new Date();
		System.out.println(today);
		
		//SimpleDateFormat 클래스
		SimpleDateFormat date = new SimpleDateFormat("yyyy-mm-dd");
		System.out.println(date.format(today));
		
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		System.out.println(time.format(today));
		
		System.out.println("===============================");
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		DateTimeFormatter myFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss a");
		
		String formattedDate = now.format(myFormat);
		System.out.println( formattedDate);
	} 

}
 