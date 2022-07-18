package system;

public class SystemTime {

	public static void main(String[] args) {
		//수행 시간 측정
		//long start = System.currentTimeMillis();
		
		long start = System.nanoTime();
		
		//1부터 백만까지 더하기
		int sum = 0;
		for(int i = 0; i<=10000000; i++) {
			sum += i;
		}
		
		//long end = System.currentTimeMillis();
		long end = System.nanoTime();
		System.out.println("합계: " + sum);
		System.out.println("소요 시간: " + (end-start) + "나노");

	}

}
