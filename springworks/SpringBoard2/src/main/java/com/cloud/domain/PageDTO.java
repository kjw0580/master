package com.cloud.domain;

import lombok.Data;

@Data
public class PageDTO {
	private int startPage;
	private int	endPage;
	private boolean prev, next; //이전, 다음
	
	private int total; //게시글 총 수
	private Criteria cri; //페이지번호, ㅔㅍ이지당 게시글 수 참조
	
	public PageDTO(Criteria cri, int total) {
		this.cri = cri;
		this.total = total;
		
		//마지막(끝) 페이지		//3/10.0.. 0.3 ->1 (올림)*10 -> 10page
		this.endPage = (int)(Math.ceil(cri.getPageNum() / 10.0)) * 10;
		
		//시작페이지
		this.startPage = this.endPage - 9;
		
		//실제 끝 페이지	//1.0은 실수형으로 자동형변환 // 74.0/10 -> 7.4 ->8
		int realEndPage = (int)(Math.ceil((total * 1.0) / cri.getAmount()));
		
		//끝 페이지 조건
		this.endPage = realEndPage < endPage ? realEndPage : endPage;
		
		this.prev = this.startPage > 1;   //이전(메뉴)
		this.next = this.endPage < realEndPage; //다음
	}
}
