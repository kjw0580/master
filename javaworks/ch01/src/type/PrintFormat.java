package type;

public class PrintFormat {

	public static void main(String[] args) {
		// 서식 문자 - %d(정수), %f(실수), %s(문자)
		// 이스케이프 문자
		
		int year = 2022;
		System.out.printf("올해는 %d년입니다.\n", year);
		
		float weight = 63.7F;
		System.out.printf("그의 몸무게는 %.1fkg입니다.\n", weight);
		
		String nick = "얼음 공주";
		System.out.printf("그녀의 별명은 %s입니다.\n", nick);
		
		//표
		/*System.out.println("---------------------");
		System.out.println("이름\t나이\t나라");
		System.out.println("강감찬\t82\t고려");
		System.out.println("이순신\t53\t조선");
		System.out.println("---------------------");*/
		
		String table = "";
		table += "---------------------\n";
		table += "이름\t나이\t나라\n";
		table += "강감찬\t82\t고려\n";
		table += "이순신\t53\t조선\n";
		table += "---------------------";
		System.out.println(table);
	}

}
