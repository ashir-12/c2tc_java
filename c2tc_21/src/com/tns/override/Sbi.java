package com.tns.override;

public class Sbi extends Rbi{
 
	@Override
	
	public float getRateofIntrest() // override the method
	{
		super.getRateofIntrest();
		return 8.7f;
		//super.getRateofIntrest();
	}
}
