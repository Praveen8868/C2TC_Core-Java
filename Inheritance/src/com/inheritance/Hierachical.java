package com.inheritance;

public class Hierachical {

	public static void main(String[] args) {
		Car myCar = new Car();
		
		Bus myBus = new Bus();
		
		myCar.run();
		myCar.drive();
		
		myBus.run();
		myBus.travel();

	}

}
