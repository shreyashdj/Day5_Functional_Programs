package com.bridgelabz.day5FunctionalPrograms;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {

		double root1, root2;
		
		Scanner scan = new Scanner(System.in);
		
		 // inputs of a, b, and c
		System.out.println("Enter values of a,b,c resp. : ");
	    int a = scan.nextInt();
	    int b = scan.nextInt();
	    int c = scan.nextInt();

	    System.out.println("Qudratic Eq. is : " +a+"x^2 + "+b+"x + "+c +" = 0");
	    
	    double delta = b * b - 4 * a * c;		// calculating the delta = (b^2 - 4ac)

	    // check if delta is greater than 0
	    
	   if (delta > 0) {		// two roots are real and distinct
		      
		      root1 = (-b + Math.sqrt(delta)) / (2 * a);
		      root2 = (-b - Math.sqrt(delta)) / (2 * a);

	      System.out.println("\n root1 of x = "+root1 +"\n root2 of x = "+ root2);
	    }

	    // check if delta is equal to 0
	   
	   else if (delta == 0) {		// two roots are real and equal
	      
	      root1 = -b / (2 * a);
	      
	      System.out.println("\n root1 & root2 of x = " + root1);
	    }

	    // check if delta is less than zero
	   
	    else {		// roots are complex number and distinct
	     
	      double real = -b / (2 * a);
	      double imaginary = Math.sqrt(-delta) / (2 * a);

	      System.out.printf("\n root1 of x = %.2f+%.2fi", real, imaginary);
	      System.out.printf("\n root2 of x = %.2f-%.2fi", real, imaginary);
	    }

scan.close();
	}

}