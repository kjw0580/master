package com.cloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cloud.domain.MemberVO;
import com.cloud.service.MemberService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor
@Log4j
@RequestMapping("/member/*")
@Controller
public class MemberController {
	
	private MemberService service;  //생성자 주입
	
	//회원 가입 폼 요청
	@GetMapping("/signup")
	public void signUp() {
		log.info("회원 가입 폼");
	}
	
	//회원 가입 처리
	@PostMapping("/signup")
	public String signUp(MemberVO member) {
		service.signup(member);
		return "redirect:/customLogin";
	}
	
	//회원 목록 보기
	@GetMapping("/memberList")
	@PreAuthorize("isAuthenticated()")   //로그인 창 뜸
	public String getMemberList(Model model) {
		List<MemberVO> memberList = service.getMemberList();
		model.addAttribute("memberList", memberList); //view로 모델 보냄
		return "/member/memberList";
	}
	
	//회원 상세 보기
	@GetMapping("/memberView")
	public String getMember(String userid, Model model) {
		MemberVO member = service.read(userid);
		model.addAttribute("member", member);
		return "/member/memberView";
	}
	
	//회원 삭제
	@GetMapping("/delete")
	public String delete(MemberVO member) {
		service.delete(member);
		return "redirect:/";  //메인페이지 이동
	}
	
	//회원 수정
	@PostMapping("/update")
	public String update(MemberVO member) {
		service.update(member);
		return "redirect:/member/memberList";
	}
	
	//ID 중복 체크
	@RequestMapping(value="/checkID", method=RequestMethod.POST)
	@ResponseBody
	public int checkID(String userid) {
		int result = service.checkID(userid);
		return result;
	}
}