package com.cloud.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cloud.domain.BoardVO;
import com.cloud.domain.Criteria;
import com.cloud.domain.PageDTO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
   
	@Autowired
   private BoardMapper mapper;
   
	/* @Test
	public void testGetList() {
		List<BoardVO> list = mapper.getBoardList();
		
		list.stream()
			.map(board -> board.getBno()) //글번호 매핑
			.forEach(board -> log.info(board)); //글번호 출력
	}	 */
	
	/* @Test
	public void testPaging() {
		Criteria cri = new Criteria();
		cri.setPageNum(1); //1페이지
		cri.setAmount(10); //게시글 수 - 10개
		
		List<BoardVO> list = mapper.getListWithPage(cri);
	}
	*/
	
	@Test
	public void testPageDTO() {
		Criteria cri = new Criteria();
		//cri.setPageNum(1); // startPage - 1페이지
		cri.setPageNum(11); //startPage - 11페이지
		
		PageDTO page = new PageDTO(cri, 152);
		log.info(page);
	}
}