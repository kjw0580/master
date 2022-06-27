package nestedfor;

public class Gugudan {

	public static void main(String[] args) {
		// 구구단 전체 출력
		int dan, times;
		
		for(dan = 2; dan <= 9; dan++) {
			for(times = 1; times <= 9; times++) {
				System.out.println(dan + "x" + times + "=" + (dan * times));
			}
			System.out.println();
		}
		System.out.println("====================");
		
		int i, j;
		for(i = 2; i <= 9; i++) {
			for(j = 1; j <= 9; j++) {
				System.out.println(i + "x" + j + "=" + (i * j));
			}
			System.out.println();
		}
	}
}
