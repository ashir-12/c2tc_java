package com.tns.abstraction;

public class rect extends shape {


	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + "]";
	}

	private float width, height;
	
	public rect() {
		this.width=5.0f;
		this.height=10.0f;
	}

	public rect(float width, float height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	void calArea() {
		// TODO Auto-generated method stub
		super.area=width*height;
		
	}
	
}
