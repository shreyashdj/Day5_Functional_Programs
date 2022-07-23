package com.bridgelabz.day5FunctionalPrograms;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter point (x,y) :");
		int x = scan.nextInt();
        int y = scan.nextInt();
        
        double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		
        System.out.println("\nDistance from (0, 0) to (" + x + ", " + y + ") is " +distance);
		
scan.close();
	}

}
