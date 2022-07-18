package collection.member;

public class MemberArrayListTest {

	public static void main(String[] args) {

		MemberArrayList mal = new MemberArrayList();
		
		//회원 생성 및 추가
		mal.addMember(new Member(1001, "추신수"));
		mal.addMember(new Member(1002, "손흥민"));
		mal.addMember(new Member(1003, "박인비"));
		mal.addMember(new Member(1004, "김연아"));

		
		mal.addMember(chu);
		mal.addMember(son);
		mal.addMember(park);
		mal.addMember(kim);
		//회원 목록 조회
		mal.showAllMember();
		
	}

}
