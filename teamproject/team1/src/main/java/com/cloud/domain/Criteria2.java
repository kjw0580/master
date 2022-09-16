package com.cloud.domain;

import lombok.Data;

@Data
public class Criteria2 {
	private int pageNum;
	private int amount;
	
	public Criteria2() {
		this(1, 10);
	}
	
	public Criteria2(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
	}
}
