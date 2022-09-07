package com.cloud.controller;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.cloud.domain.BoardVO;
import com.cloud.service.BoardService;

@RequestMapping("/board/*")  //localhost:8080/board/aaa
@Controller
public class BoardController {
	
	@Autowired
	private BoardService service;

	//목록 보기
	@GetMapping("/boardList")//localhost:8080/board/boardList
	public String getBoardList(Model model) {
		List<BoardVO> boardList = service.getBoardList();
		model.addAttribute("boardList", boardList); //view로 전송
		return "/board/boardList";
	}
	
	//글쓰기 폼 페이지 요청
	@PreAuthorize("isAuthenticated()")
	@GetMapping("/insertBoard")
	public String insert() {
		return "/board/insertBoard";
	}
	
	//글쓰기 처리 요청
	@PostMapping("/insertBoard")
	@PreAuthorize("isAuthenticated()")
	public String insert(BoardVO vo){
		
		//파일 업로드 처리
		MultipartFile uploadFile = vo.getUploadFile();
		if(!uploadFile.isEmpty()) { //파일이 첨부되었다면
			String fileName = uploadFile.getOriginalFilename();
			String filePath = "C/upload/";
			uploadFile.transferTo(new File(filePath + fileName));
		}
		service.insert(vo);      
		return "redirect:/board/boardList";
	}
	
	//글 상세보기 처리
	@GetMapping("/boardView")
	public String getBoard(int bno, Model model) {
		service.updateCount(bno);   //조회수 증가
		BoardVO board = service.getBoard(bno); //상세 보기 처리
		model.addAttribute("board", board);  //model="board" 보내기
		return "/board/boardView";
	}
	
	//글 삭제
	@GetMapping("/deleteBoard")
	public String delete(BoardVO vo) {
		service.delete(vo);
		return "redirect:/board/boardList";
	}
	
	//글 수정
	@PostMapping("/updateBoard")
	public String update(BoardVO vo) {
		service.update(vo);
		return "redirect:/board/boardList";
	}
	
}