package collection.member;

import java.util.ArrayList;

public class MemberArrayList {

	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	//회원 추가 메서드
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	//회원 전체 조회
	public void showAllMember() {
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			System.out.println(member);
		}
	}
}
