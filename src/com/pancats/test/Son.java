package com.pancats.test;

public class Son extends Person {

	public Son() {
	}
	
	@Override
	public void say() {
		System.out.println("Son:say");
		
	}
	
	public static void main(String[] args) {
		Son son = new Son();
		
		
	}
}
