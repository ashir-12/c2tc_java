package com.tns.nestedinterface;

public interface MyInterface {

	void calculateArea();
	interface MyInnerInterface{// inner interface
		int id=20;
		void print();
	}
}
