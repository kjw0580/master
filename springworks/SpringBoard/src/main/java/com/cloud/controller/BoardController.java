package com.cloud.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cloud.repository.BoardVO;
import com.cloud.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService service;
	
	@RequestMapping("/boardList")
	public String getBoardList(Model model, HttpSession session) {  //�Խñ� ��� ��û
		List<BoardVO> boardList = service.getBoardList();
		String id = (String)session.getAttribute("sessionId");
		
		model.addAttribute("boardList", boardList); //model-"boardList"
		model.addAttribute("id", id);
		return "boardList";
	}
	
	@RequestMapping("/boardView")
	public String getBoard(int bno, Model model) { //�� ���� ��û
		service.updateCount(bno);  //��ȸ�� ����
		BoardVO board = service.getBoard(bno);  //�� ���� ó��
		model.addAttribute("board", board); //model-"board"
		return "boardView";
	}
	
	@RequestMapping(value="/insertBoard", method=RequestMethod.GET)
	public String insertBoard() {  //�۾��� �� ������ ��û
		return "insertBoard";
	}
	
	/*@RequestMapping(value="/insertBoard", method=RequestMethod.POST)
	public String insertBoard(HttpServletRequest request) throws UnsupportedEncodingException {
		//����� �Է� ���� ����
		request.setCharacterEncoding("utf-8");
		
		String title = request.getParameter("title");
		String writer = request.getParameter("title");
		String content = request.getParameter("content");
		
		//db ����
		BoardVO vo = new BoardVO();
		vo.setTitle(title);
		vo.setWriter(writer);
		vo.setContent(content);
		
		boardService.insert(vo);
		return "redirect:boardList";
	}*/
	
	@RequestMapping(value="/insertBoard", method=RequestMethod.POST)
	public String insertBoard(BoardVO vo){  //�۾��� ó��
		//command ��ü - BoardVO -> HttpServletRequest request ��ü��
		service.insert(vo);
		return "redirect:boardList";
	}
	
	@GetMapping("/deleteBoard")
	public String deleteBoard(BoardVO vo) {  //�� ���� ��û
		service.delete(vo);
		return "redirect:boardList";
	}
	
	@PostMapping("/updateBoard")
	public String updateBoard(BoardVO vo) {  //�� ���� ��û
		service.update(vo);
		return "redirect:boardList";
	}
}
