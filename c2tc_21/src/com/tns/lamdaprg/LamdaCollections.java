package com.tns.lamdaprg;

import java.util.ArrayList;

public class LamdaCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>li=new ArrayList<>();
		li.add(10);
		li.add(33);
		li.add(44);
//		//traversing list using foreach loop
//		for(Integer ele:li) {
//			System.out.println(ele);
//		}
	
		li.forEach(element->System.out.println(element));
		

	}

}
