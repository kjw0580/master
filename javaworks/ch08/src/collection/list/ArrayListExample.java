package collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		//인터페이스 형으로 ArrayList 객체 생성
		List<String> vegeList = new ArrayList<>();
		
		//객체 추가
		vegeList.add("양파");
		vegeList.add("마늘");
		vegeList.add("감자");
		
		//특정 위치에 추가
		vegeList.add(2, "고추");
		
		//객체의 개수
		int num = vegeList.size();
		System.out.printf("총 객체수: %d개\n", num);
		
		//vegeList 출력
		System.out.println(vegeList);
		
		//특정 객체 가져오기
		System.out.println(vegeList.get(1)); //마늘
		
		//전체 목록
		for(int i=0; i<vegeList.size(); i++) {
			String vegetable = vegeList.get(i);
			System.out.println("\t" + vegetable );
		}
		System.out.println();
		
		//객체 수정
		vegeList.set(0, "상추");
		
		//객체 삭제
		vegeList.remove(2);  //고추
		
		for(String vegetable : vegeList) {
			System.out.println("\t" + vegetable);
		}
	}

}





















