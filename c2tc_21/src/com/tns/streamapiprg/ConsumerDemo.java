package com.tns.streamapiprg;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String>cities=new ArrayList<>();
		cities.add("delhi");
		cities.add("mumbai");
		cities.add("goa");
		System.out.println(cities);
		
		Consumer<String>printconsumer=city->System.out.println(city);
		cities.forEach(printconsumer);
	}

}
