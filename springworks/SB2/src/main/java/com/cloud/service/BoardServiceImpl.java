package com.cloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.domain.BoardVO;
import com.cloud.mapper.BoardMapper;

@Service
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardMapper mapper;

	@Override
	public List<BoardVO> getBoardList() {
		return mapper.getBoardList();
	}

	@Override
	public void insert(BoardVO vo) {
		
	}

	@Override
	public BoardVO getBoard(int bno) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(BoardVO vo) { //�� ����
		mapper.delete(vo);
	}
}
