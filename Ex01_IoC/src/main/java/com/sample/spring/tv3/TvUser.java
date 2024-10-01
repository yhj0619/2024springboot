package com.sample.spring.tv3;

public class TvUser {

	public static void main(String[] args) {
//		LgTv tv = new LgTv();
//		Tv tv = new SamsungTv();
		
		BeanContainer container = new BeanContainer();
		
		Tv tv1 = (Tv)container.getBean(args[0]);
		
		tv1.turnOn();
		tv1.turnOff();
		tv1.soundUP();
		tv1.soundDown();
	}

}
