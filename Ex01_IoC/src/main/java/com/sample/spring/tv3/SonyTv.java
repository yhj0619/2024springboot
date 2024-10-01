package com.sample.spring.tv3;

public class SonyTv implements Tv{
	public SonyTv() {
		System.out.println("==>SonyTv");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("sony 전원킨다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("sony 전원끈다");
	}

	@Override
	public void soundUP() {
		// TODO Auto-generated method stub
		System.out.println("sony 소리킨다");
	}

	@Override
	public void soundDown() {
		// TODO Auto-generated method stub
		System.out.println("sony 소리끈다");
	}

}
