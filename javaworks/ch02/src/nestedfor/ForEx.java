package nestedfor;

public class ForEx {

	public static void main(String[] args) {
		// 중첩된 for문 - 행, 열
		int i, j;
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <=5; j++) {
				System.out.print("$");
			}
			System.out.println(); //행 바꿈
		}
		
		/*
		  i = 1(행) j = 1  $
		            j = 2  $$
		            j = 3  $$$
		            j = 4  $$$$
		            j = 5  $$$$$(최종)
		   i = 2    j = 1  $
		            j = 2  $$
		            j = 3  $$$
		            j = 4  $$$$
		            j = 5  $$$$$(최종)
		   .........
		   $$$$$
		   $$$$$
		   $$$$$
		   $$$$$
		   $$$$$
		  
		 */
		
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <=5; j++) {
				System.out.print("가");
			}
			System.out.println(); //행 바꿈
		}
	}

}
