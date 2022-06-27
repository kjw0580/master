package seats;

public class ForFor {

	public static void main(String[] args) {
		/*
		 1 2 3 4 5
		 6 7 8 9 10
		 11 12 13 14 15
		 16 17 18 19 20 
		 21 22 23 24 25 
		*/
		
		int i, j;
		for(i = 0; i < 5; i++) {
			for(j = 1; j <= 5; j++) {
				System.out.print(i * 5 + j + " ");
			}
			System.out.println();
		}
	}

}
