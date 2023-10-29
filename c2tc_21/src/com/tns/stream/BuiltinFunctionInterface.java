package com.tns.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltinFunctionInterface {

	 public void printCities() {
	    
	    List<String> cities = new ArrayList<>();
	    cities.add("Delhi");
	    cities.add("Mumbai");
	    cities.add("Goa");
	    cities.add("Pune");
	    
	    Consumer<String> printConsumer= city-> System.out.println(city);    
	    cities.forEach(printConsumer);
	    
	    

}
	public void filterCities() {

	   List<String> cities = new ArrayList<>();
	   cities.add("Delhi");
	   cities.add("Mumbai");
	   cities.add("Goa");
	   cities.add("Pune");

	   Predicate<String> filterCity = city -> city.equals("Mumbai");
	   cities.stream().filter(filterCity).forEach(System.out::println);
	}
	public void supplyCities() {

	    Supplier<String[]> citySupplier = () -> {
	        return new String[]{"Mumbai", "Delhi", "Goa", "Pune"};
	    };
	    Arrays.asList(citySupplier.get()).forEach(System.out::println);
	}
	public void mapCities() {

	    List<String> cities = new ArrayList<>();
	    cities.add("Delhi");
	    cities.add("Mumbai");
	    cities.add("Goa");
	    cities.add("Pune");

	    Function<String, Character> getFirstCharFunction = city -> {
	        return city.charAt(0);
	    };
	    cities.stream().map(getFirstCharFunction)
	                   .forEach(System.out::println);
	}
	
}
