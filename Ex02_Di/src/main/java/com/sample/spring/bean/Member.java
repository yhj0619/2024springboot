package com.sample.spring.bean;

public class Member {
	private String name;
	private String nickname;
	private Printer printer;
	
	public Member() {
		super();
	}
	public Member(String name, String nickname, Printer printer) {
		super();
		this.name = name;
		this.nickname = nickname;
		this.printer = printer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public Printer getPrinter() {
		return printer;
	}
	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", nickname=" + nickname + ", printer=" + printer + "]";
	}
	
	public void print() {
		printer.print("Hello " + name + " : " + nickname);
	}
}
