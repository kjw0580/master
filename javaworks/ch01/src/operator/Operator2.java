package operator;

public class Operator2 {

	public static void main(String[] args) {
		// 증가, 감소 연산자
		int num = 10;
		int val = 0;
		
		//val = num++;  //val = num, num = num + 1
		val = ++num;    //num = num + 1, val = num
		System.out.println(val);  //10, 11
		System.out.println(num);  //11, 11
		
		//val = num--;   //val = num, num = num - 1
		val = --num;     //num = num - 1, val = num
		System.out.println(val);  //11, 10
		System.out.println(num);  //10. 10
		
		//산술 연산자 - 총점과 평균
		int mathScore = 90, engScore = 75;
		int totalScore = 0;
		double avgScore = 0.0;
		
		//총점
		totalScore = mathScore + engScore;
		
		//평균 = 총점 / 개수
		avgScore = (double)totalScore / 2;
		//avgScore = totalScore / 2.0;
		
		//출력
		System.out.println(totalScore);
		System.out.println(avgScore);
	}

}
