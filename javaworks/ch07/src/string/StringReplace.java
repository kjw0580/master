package string;

public class StringReplace {

	public static void main(String[] args) {
		String oldStr = "자바는 개체 지향 언어입니다.";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
	}

}
