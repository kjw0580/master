package thisexam;

import java.util.Scanner;

public class Method {

	public static void main(String[] args) {
		String[] words = {"river", "mountain", "sky", "earth", "moon", "tree", "flower", "cow", "pig", "horse"};
		
		int n = 1;
		long start, end;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("영어타자 게임, 준비되면 엔터");
		scan.nextLine();
		start = System.currentTimeMillis();
		while(n < 11) {
			int rand = (int)(Math.random()*words.length);
			System.out.println("문제" + n);
			String question = words[rand];
			System.out.println(question);
			
			String answer = scan.nextLine();
			if(answer.equals(question)) {
				System.out.println("통과!");
				n++;
			}else {
				System.out.println("오타! 다시 도전!");
			}
		}
		end = System.currentTimeMillis();
		System.out.println("게임 소요 시간은 " + (end-start)/1000 + "초입니다." );
		scan.close();
	}

}
