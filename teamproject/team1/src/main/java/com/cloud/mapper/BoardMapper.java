package com.cloud.mapper;

import java.util.List;

import com.cloud.domain.BoardVO;
import com.cloud.domain.Criteria;

//DAO 역할
public interface BoardMapper {
	
	public List<BoardVO> getBoardList(); //글 목록 보기
	
	public void insertBoard(BoardVO vo);  //글쓰기
	
	public List<BoardVO> getListWithPage(Criteria cri); //목록 페이지 처리
	
	public int getTotalCount(Criteria cri); //게시글 총 개수
	
	public BoardVO getBoard(int bno);  //글 상세 보기
	
	public void deleteBoard(BoardVO vo);  //글 삭제
	
	public void updateBoard(BoardVO vo);  //글 수정
	
	public void updateCount(int bno);  //조회수
}