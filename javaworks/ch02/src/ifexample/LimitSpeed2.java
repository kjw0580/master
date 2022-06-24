package ifexample;

public class LimitSpeed2 {

	public static void main(String[] args) {
		// 자동차 제한속도 - 50km 이상이면 "제한속도 위반"
		
		int limitSpeed = 45;
		
		if(limitSpeed >= 50) {
			System.out.println("제한 속도 위반!! 과태료 10만원 부과 대상");
		}else {
			System.out.println("안전 속도 준수!!");
		}
		
		//출력
		System.out.println("시속 " + limitSpeed + "km입니다.");
	}
}
