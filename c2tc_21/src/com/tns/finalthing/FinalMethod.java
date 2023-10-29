package com.tns.finalthing;

public class FinalMethod {
	FinalMethod(){
		System.out.println("default constructor");
		
	}
	void display() {
		System.out.println("hello");
	}
	final int a=22;
	// final method
	void show() {
		System.out.println("value of a"+ a);
		
	}
}
