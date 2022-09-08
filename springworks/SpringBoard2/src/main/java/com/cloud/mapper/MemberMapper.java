package com.cloud.mapper;

import java.util.List;

import com.cloud.domain.MemberVO;

public interface MemberMapper {
	
	//ȸ�� �� ����
	public MemberVO read(String userid);
	
	//ȸ�� ����
	public void insertMember(MemberVO member);
	
	//ȸ�� ���
	public List<MemberVO> getMemberList();
	
	//ȸ�� Ż��
	public void deleteMember(MemberVO member);
	
	//ȸ�� ����
	public void updateMember(MemberVO member);
	
	public int checkID(String userid);

}





