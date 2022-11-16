package com.standridge.areacalculator;
/**
 * @author caleb
 * JavaBootcamp popquiz
 * 11/16/22
 */
public class AreaCircle {
	
	/* 
	 * instance variables 
	 */
	
	private static double area = 0.0;
	private static double radius = 16.8;
	private final static double PI = Math.PI;
	
	/*
	 * calculates area of the circle given the radius and value of PI
	 */
	public static void calcAreaOfCircle(double newRadius, double newPI) {
		area = newPI * (newRadius * newRadius);
	}
	
	/*
	 * prints area of circle to the console
	 */
	public static void displayArea() {
		System.out.printf("The area is %f", area);
	}

	public static void main(String[] args) {
		calcAreaOfCircle(radius, PI);
		displayArea();
	}

}
