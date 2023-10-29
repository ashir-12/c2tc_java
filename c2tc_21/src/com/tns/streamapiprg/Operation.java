package com.tns.streamapiprg;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		List<Integer>prime=Arrays.asList(2,3,5,6,7);// getting source  from arrays
		
		
		
		IntSummaryStatistics stats = prime.stream() 
				.mapToInt((x) -> x) 
				.summaryStatistics();
		System.out.println("Highest prime number in List : " + stats.getMax()); 
		System.out.println("Lowest prime number in List : " + stats.getMin()); 
		System.out.println("Sum of all prime numbers : " + stats.getSum());
		System.out.println("Average of all prime numbers : " + stats.getAverage());

}
	}


