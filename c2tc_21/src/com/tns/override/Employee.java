package com.tns.override;

public class Employee {

	private String name;
		private int id;
		
	
		static String companyName = "TNS";


		public Employee(String name, int id) {
			// TODO Auto-generated constructor stub
			this.name = name;
			this.id = id;
		}

		@Override
		public String toString() {
			return "Employee [name=" + name + ", id=" + id + ", Company= "+companyName+"]";
		}

}
