package com.spring.di.sample;

import org.springframework.stereotype.Component;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

//@RequiredArgsConstructor
@Component
@ToString
public class Hotel {
	
	//private final Chef chef;  //@RequiredArgsConstructor�� ������ ���
	
	private Chef chef;

	public Hotel(Chef chef) { //�����ڸ� ���� ���� ���
		super();
		this.chef = chef;
	}
}
