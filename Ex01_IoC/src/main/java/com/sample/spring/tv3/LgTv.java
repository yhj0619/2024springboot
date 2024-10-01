package com.sample.spring.tv3;

public class LgTv implements Tv{
	public LgTv() {
		System.out.println("==>LgTv");
		
	}
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("LgTv 전원킨다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("LgTv 전원끈다");
	}

	@Override
	public void soundUP() {
		// TODO Auto-generated method stub
		System.out.println("LgTv 소리킨다");
	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		System.out.println("LgTv 소리끈다");
	}
	
}
