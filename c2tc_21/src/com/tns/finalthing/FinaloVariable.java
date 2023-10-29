package com.tns.finalthing;

public class FinaloVariable {
	
	int x;
	static int z=10;
	final static int m;
	
	void change(){
		x=30;
		z=35;
	}
	static {
		z=666;
		m=22;
	}
}
