package com.sample.spring.tv1;

public class TvUser {

	public static void main(String[] args) {
//		LgTv tv = new LgTv();
		SamsungTv tv = new SamsungTv();
		tv.turnOn();
		tv.turnOff();
		tv.soundUP();
		tv.soundDown();
	}

}
