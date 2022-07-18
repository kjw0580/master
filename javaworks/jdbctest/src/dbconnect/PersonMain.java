package dbconnect;

import java.util.ArrayList;

public class PersonMain {

	public static void main(String[] args) {
		ArrayList<Person> personList = new ArrayList<>();
		PersonDAO dao = new PersonDAO();
		
		//자료 삽입
		/*
		 * Person p1 = new Person(); p1.setUserId("1박2일"); p1.setUserPw("123456");
		 * p1.setName("강호동"); p1.setAge(44);
		 * 
		 * dao.insertPerson(p1);
		 */
		
		//자료 수정
		/*
		 * Person p2 = new Person(); p2.setUserId("today"); p2.setUserPw("12345");
		 * p2.setName("투게더"); p2.setAge(50);
		 * 
		 * dao.updatePerson(p2);
		 */
		
		//자료 삭제
		/*
		 * Person deleteOne = new Person(); deleteOne.setUserId("내 아이디");
		 * 
		 * dao.deletePerson(deleteOne);
		 */
		
		//1명 조회 (상세보기)
		
		  Person slcOne = dao.getPerson("회원아뒤 ");
		  
		  System.out.println("아이디: " +slcOne.getUserId());
		  System.out.println("비밀번호: " + slcOne.getUserPw());
		  System.out.println("이름: " + slcOne.getName());
		  System.out.println("나이: " +slcOne.getAge());
		 
		
		//전체 조회
		
		 /* personList = dao.getPersonList();
		  
		  for(int i=0; i<personList.size(); i++) { 
			  Person person = personList.get(i);
		  PrintPerson(person); 
		 
		
	}*/

}

	private static void PrintPerson(Person person) {
		System.out.println("아이디: " + person.getUserId());
		  System.out.println("비밀번호: " + person.getUserPw());
		  System.out.println("이름: " + person.getName());
		  System.out.println("나이: " + person.getAge()); }
		
	}
