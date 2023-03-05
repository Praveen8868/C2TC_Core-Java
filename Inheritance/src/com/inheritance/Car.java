package com.inheritance;

public class Car extends Vehicle{
	public void drive() {
		System.out.println("we can drive the car");
	}
	@Override
	public void run() {
		System.out.println("Car is running ");
	}
}
