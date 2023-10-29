package com.tns.streamapiprg;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
	 ArrayList<String>cities= new ArrayList<>();// source
		
		cities.add("goa");
		cities.add("bang");
		cities.add("chennai");
		
		Predicate<String>filtercity=city->city.equals("bang");
	
		cities.stream().filter(filtercity).forEach(System.out::println);
	}

}
