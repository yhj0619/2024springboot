package com.sample.spring.tv3;

public class SamsungTv implements Tv{
	public SamsungTv() {
		System.out.println("==>SamsungTv");
		
	}
	
	@Override
	public void turnOn() {
		System.out.println("SamsungTv 전원킨다");
	}
	@Override
	public void turnOff() {
		System.out.println("SamsungTv 전원끈다");
	}
	@Override
	public void soundUP() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTv 소리킨다");
	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		System.out.println("SamsungTv 소리끈다");
	}
	
}
