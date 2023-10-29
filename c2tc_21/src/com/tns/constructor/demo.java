package com.tns.constructor;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner( System.in);
		String name, city;
		int id;
		System.out.println("enter customer id");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter customer name");
		name=sc.next();
		System.out.println("enter customer city");
		city=sc.next();

		Customer c1=new Customer(name,id,city);
		
		System.out.println(c1);
		
	}

}

