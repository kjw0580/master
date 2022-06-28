package builtinclass;

public class MathRandomEx {

	public static void main(String[] args) {
		System.out.println("주사위 10번 던지기");
		for(int i=1; i<=10; i++) {
			int dice = (int)(Math.random()*6)+1;
			System.out.print(dice + " ");
		}
		
		System.out.println("문자열 랜덤 출력");
		String[] word = {"나", "너", "우리", "우주", "세계"};
//		System.out.println(word[2])
		int num = (int)(Math.random()*word.length);
		System.out.println(num);
		System.out.println(word[num]);
	}
}
