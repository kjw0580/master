package nestedfor;

public class StarPrint {

	public static void main(String[] args) {
		// 별찍기(삼각형 모양)
		int i, j;
		
		for(i = 1; i <= 5; i++) {
			//행이 증가하며 별이 1개 증가
			for(j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(); //행 바꿈
		}
		
		for(i = 1; i <= 5; i++) {
			//행이 증가하면서 별이 1개 감소
			for(j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println(); //행 바꿈
		}
		
		/*
		   *
		   **
		   ***
		   ****
		   *****
		   
		   *****
		   ****
		   ***
		   **
		   *
		  공백이 먼저 있고, 별이 있는 경우
		       *
		      **
		     ***
		    ****
		   *****
		   
		   *****
		    ****
		     ***
		      **
		       *
		 */
		
		for(i = 1; i <= 5; i++) {
			//첫 행에서 공백 4개, 별이 1개로 구성
			//행이 바뀌면서 공백은 1개 감소, 별은 1개 증가
			for(j = 1; j <= 5-i; j++) {
				System.out.print(" "); //공백 문자
			}
			for(j = 1; j <= i; j++) {
				System.out.print("*"); //별
			}
			System.out.println();
		}
		
		for(i = 1; i <= 5; i++) {
			//첫 행에서 공백 0개, 별이 5개로 구성
			//행이 바뀌면서 공백은 1개 증가, 별은 1개 감소
			for(j = 1; j < i; j++) {
				System.out.print(" "); //공백 문자
			}
			for(j = 5; j >= i; j--) {
				System.out.print("*"); //별
			}
			System.out.println();
		}
	}
}
