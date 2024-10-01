package com.sample.spring.tv2;

public class TvUser {

	public static void main(String[] args) {
//		LgTv tv = new LgTv();
		Tv tv = new SamsungTv();
		tv.turnOn();
		tv.turnOff();
		tv.soundUP();
		tv.soundDown();
	}

}
