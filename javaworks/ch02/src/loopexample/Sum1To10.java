package loopexample;

public class Sum1To10 {

	public static void main(String[] args) {
		// 1부터 10까지의 합계
		int i = 0; 
		int sum = 0;
		
		/*while(i < 10) {
			i++;
			sum += i;
			System.out.println("i=" + i + ", sum=" + sum);
		}
		System.out.println("합계 : " + sum);*/
		
		//방법2
		while(true) {
			i++;
			if(i > 10)
				break;
			sum += i;
		}
		System.out.println("합계 : " + sum);
		
		/*int num = 1;
		num += 2;
		num += 3;
		num += 4;
		num += 5;
		System.out.println(num);*/

	}

}
