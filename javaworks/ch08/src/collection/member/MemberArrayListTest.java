package collection.member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		//회원 생성 및 추가
		Member chu = new Member(1001, "추신수");
		Member son = new Member(1002, "손흥민");
		Member park = new Member(1003, "박인비");
		Member kim = new Member(1004, "김연아");
		
		memberArrayList.addMember(chu);
		memberArrayList.addMember(son);
		memberArrayList.addMember(park);
		memberArrayList.addMember(kim);
		
		/*memberArrayList.addMember(new Member(1001, "추신수"));
		memberArrayList.addMember(new Member(1002, "손흥민"));
		memberArrayList.addMember(new Member(1003, "박인비"));
		memberArrayList.addMember(new Member(1004, "김연아"));*/
		
		//회원 목록 조회
		memberArrayList.showAllMember();
		System.out.println("================================");
		
		//회원 삭제
		memberArrayList.removeMember(1002);
		memberArrayList.removeMember(1005);
		
		memberArrayList.showAllMember();
	}

}
