package com.tns.lamdaprg;

public class WithParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		Cube c=(a)->{return(a*a*a);};
		System.out.println("cube of a no is"+c.calculate(5));
		
		Square s=(x)->{return(x*x);};
		System.out.println("Square of a no is"+s.calculate(5));
	}

}
