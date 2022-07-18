package collection.set;

import java.util.HashSet;
import java.util.Set;

public class StudentTest {

	public static void main(String[] args) {
		//set 객체 생성
		Set<Student> set = new HashSet<>();
		
		//객체 추가
		set.add(new Student("오지능", 30));
		set.add(new Student("오지능", 30));
		
		System.out.println("총 객체수: " + set.size());
	}

}
