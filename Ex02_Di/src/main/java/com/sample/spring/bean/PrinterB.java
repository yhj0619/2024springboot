package com.sample.spring.bean;

public class PrinterB implements Printer{

	@Override
	public void print(String message) {
		// TODO Auto-generated method stub
		System.out.println("Print B : " + message);
	}
	
}
