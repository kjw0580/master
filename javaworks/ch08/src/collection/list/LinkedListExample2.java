package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample2 {

	public static void main(String[] args) {
		//ArrayList는 내부 리스트에 객체를 저장해서 관리
		//LinkedList는 인접 참조를 링크해서 체인처럼 관리
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		//10000개의 객체 저장하는데 걸린 시간
		long startTime, endTime;
		
		startTime = System.nanoTime();        //시작 시간
		for(int i=0; i<10000; i++) {
			list1.add(0, String.valueOf(i));  //String.valueOf() - 정수를 문자로 반환
		}
		endTime = System.nanoTime();          //종료 시간
		System.out.println("ArrayList 걸린 시간: " + (endTime-startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린 시간: " + (endTime-startTime) + " ns");

	}

}
