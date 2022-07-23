package com.bridgelabz.day5FunctionalPrograms;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Temperature in Fahrenheit (t<=50) : ");
		double t = scan.nextDouble();
		
		System.out.print("Enter Wind speed in miles per hour (3<=v<=120) : ");
		double v = scan.nextDouble();
		
		double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
		
        System.out.println("\n Wind chill  = " + w);
		
		
scan.close();
	}

}
