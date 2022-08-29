package com.cloud.mapper;

import java.util.List;

import com.cloud.domain.BoardVO;

//DAO ����
public interface BoardMapper {
	
	public void insert(BoardVO vo);
	
	public List<BoardVO> getBoardList(); //�� ��� ����
	
	public void delete(BoardVO vo); 
}
