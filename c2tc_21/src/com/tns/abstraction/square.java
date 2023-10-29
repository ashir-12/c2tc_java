package com.tns.abstraction;

public class square extends shape{
private float side;
	
	public square(float f) {
	// TODO Auto-generated constructor stub
}
	public void Square() {
		side=2.0f;
	}
	public void Square(float side) {
		this.side=side;
	}
	@Override
	void calArea() {
		super.area=side*side;
		
	}
	@Override
	public String toString() {
		return "Square [side=" + side + "]";
	}
}
