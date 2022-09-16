package com.cloud.service;

import java.util.List;

import com.cloud.domain.BoardVO;
import com.cloud.domain.Criteria;

public interface BoardService {
	
	public List<BoardVO> getBoardList();
	
	public List<BoardVO> getListWithPage(Criteria cri);
	
	public int getTotalCount(Criteria cri);
	
	public void insert(BoardVO vo);  //�۾���
	
	public BoardVO getBoard(int bno);  //�� �� ����
	
	public void delete(BoardVO vo);  //�� ����
	
	public void update(BoardVO vo);  //�� ����
	
	public void updateCount(int bno);  //��ȸ��
}
