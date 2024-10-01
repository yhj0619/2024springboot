package com.sample.spring.bean1;

import org.springframework.stereotype.Component;

@Component("printerA")
public class PrinterA implements Printer{

	@Override
	public void print(String message) {
		// TODO Auto-generated method stub
		System.out.println("Print A : " + message);
	}
	
}
