package collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample1 {

	public static void main(String[] args) {
		//List 인터페이스 타입으로 LinkedList 객체 생성
		List<String> myList = new LinkedList<>();
		
		//자료 추가
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		//객체 출력
		System.out.println(myList);
		
		//특정 위치에 자료 추가
		myList.add(2, "D");
		System.out.println(myList);
		
		//자료 삭제
		myList.remove(1);
		System.out.println(myList);
		
		//전체 출력
		for(String list : myList)
			System.out.print(list + " ");
		
	}

}













