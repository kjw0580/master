package collection.member;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MemberHashSet {

	private Set<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public void showAllMember() {
		//반복자 객체 얻기
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			System.out.println(member);
		}
	}
	
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int dbMemberId = member.getMemberId();
			if(dbMemberId == memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "번 회원이 존재하지 않습니다.");
		return false;
	}
}
