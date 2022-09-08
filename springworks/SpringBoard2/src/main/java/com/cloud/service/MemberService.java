package com.cloud.service;

import java.util.List;

import com.cloud.domain.MemberVO;

public interface MemberService {

	//ȸ�� ����
	public void signup(MemberVO member);
	
	//ȸ�� ���
	public List<MemberVO> getMemberList();
	
	//ȸ�� �� ����
	public MemberVO read(String userid);
	
	//ȸ�� Ż��
	public void delete(MemberVO member);
	
	//ȸ�� ����
	public void update(MemberVO member);
	
	//id 중복 체크
	public int checkID(String userid);
}





