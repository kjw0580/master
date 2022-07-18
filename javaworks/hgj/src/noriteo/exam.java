package noriteo;

import java.util.Scanner;

public class exam {

	public static void main(String[] args) throws Exception{
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";   // 3.9는 실수이기에 바로 Integer.parseInt로 변환이 불가능 먼저 double로 변환후 int로 재변환 시켜줘야함!!
		int result = (int)var1  + (int)(var2 + var3) + (int)Double.parseDouble(var4);
		System.out.println(result);
		
		int a = 1;
		String b = "문자";
		double c = 3232.1551351351351534;
		
		System.out.printf("%d는 정수 %s는 문자 %.10f는 실수", a, b, c);
		
	}

}
