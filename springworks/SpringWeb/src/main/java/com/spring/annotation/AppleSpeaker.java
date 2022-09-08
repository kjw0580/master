package com.spring.annotation;

import org.springframework.stereotype.Component;

//@Component("apple")
public class AppleSpeaker implements Speaker{
	
	public AppleSpeaker() {
		System.out.println("==> AppleSpeaker() ��ü ����");
	}

	@Override
	public void volumeUp() {
		System.out.println("AppleSpeaker -- �Ҹ� Ű��");
	}

	@Override
	public void volumeDown() {
		System.out.println("AppleSpeaker -- �Ҹ� ����");
	}

}