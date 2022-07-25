package com.bridgelabz.day5FunctionalPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number of rows : ");
		int m = scan.nextInt();
		
		System.out.print("Enter number of columns : ");
		int n = scan.nextInt();
		
		int[][] arrayInt = new int[m][n];		// declaring array of m*n
		
		System.out.println("Enter elements of array");
		for (int i=0; i<m; i++) {			
			for(int j=0; j<n; j++) {
				arrayInt[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("\n Array is :");
		
		System.out.println("\n" +Arrays.deepToString(arrayInt));		// printing array as string
		System.out.println();
		
		/*
		 * 	printing array elements
		 */
		
		for (int i=0; i<m; i++) {			
			for(int j=0; j<n; j++) {
				System.out.print(arrayInt[i][j] +" ");
			}
			System.out.println();
		}
		
				
		
scan.close();		
	}

}
