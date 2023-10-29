package com.tns.abstraction;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		square sq=new square(0);
		rect r=new rect();
		System.out.println(sq);
		System.out.println(r);
		
		shape sh;
		sh=new square(4.0f);
		sh.calArea();
		sh.show();
		
		 sh=new rect(4.0f,2.0f);
		sh.calArea();
		sh.show();
	}

}
