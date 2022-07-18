package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		//Set 자료 구조 - 순서가 없고, 중복 저장이 불가
		//이미 hashCode(), equals() 재정의 되어 있어서 중복 불가
		Set<String> set = new HashSet<>();
		
		//요소 저장
		set.add("Java");
		set.add("JDBC");
		set.add("JSP/Servlet");
		set.add("Java");  //중복
		set.add("MyBatis");
		
		//set의 크기
		int size = set.size();
		System.out.println("총 객체수: " + size);
		
		//전체 요소 출력
		//반복자로 요소들을 꺼내옴 : 순서가 없으므로..
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {  //객체 수만큼 반복
			String element = iterator.next(); //1개의 객체 가져옴
			System.out.println("\t" + element);
		}
		
		//요소 삭제
		set.remove("JDBC");
		System.out.println("총 객체수: " + set.size());
		
		//모든 요소 삭제
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어 있음");
		}
	}

}















