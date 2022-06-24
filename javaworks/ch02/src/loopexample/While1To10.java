package loopexample;

public class While1To10 {

	public static void main(String[] args) {
		
		int n = 0;
		/*while(n < 10) {
			n++;
			System.out.println(n);
		}*/
		
		while(true) {  //무한반복(무조건 반복)
			n++;
			if(n > 100)
				break;
			System.out.println(n);
		}
	}
}
