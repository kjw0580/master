package generic;

import java.util.ArrayList;

public class GenericExample {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		//요소 추가(객체 추가)
		list.add("grape");
		list.add("egg");
		list.add("coffee");
		
		System.out.println(list);
		System.out.println(list.get(2));
		
		// 왜 제네릭 프로그래밍을 하는가? 
		// 타입을 정해주지 않으면 Object형이 되므로 형변환이 필요
		ArrayList cart = new ArrayList();
		cart.add("포도");
		cart.add("계란");
		cart.add("커피");
		
		String str = (String)cart.get(1);
		System.out.println(str);
		
	}

}





