package com.bridgelabz.day5FunctionalPrograms;

import java.util.Scanner;

public class TripletSum {

	public static void main(String[] args) {

		int count = 0;
		int countTriplets = 0;
		
		 Scanner scan = new Scanner(System.in);
	       
	        System.out.print("Total numbers you want to take are  : ");
	        int n = scan.nextInt();
	        
	        
	        
	    if (n<3) {
	       	System.out.println("For Triplets minimum 3 numbers required");
	        }
	   else {
	        
	        int arr[] = new int[n];		// declared array of length n
	       
	        System.out.println("Enter your numbers");
	        for(int i=0;i<n;i++) {
	            arr[i] = scan.nextInt();
	        }
	       
	        /*
	         * 	calculating total no. of triplets can form
	         *  calculating & checking sum of triplet of numbers
	         */
	        
	        System.out.println("\nTriplets whose sum is zero are :");
	        
	        for(int i=0; i<n-2; i++) {
	           
	            for(int j=i+1; j<n-1; j++) {
	               
	                for(int k=j+1; k<n; k++) {
	                	countTriplets++;
	                    if(arr[i]+arr[j]+arr[k] == 0) {
	                        System.out.println(arr[i] +"," + arr[j] +"," + arr[k]);
							count++;
	                    }
	                }
	            }
	        }
	        System.out.println("\nNo. of Triplets whose sum is zero = " +count);

	        System.out.println("\nTotal no. of Triplets = " +countTriplets);
	  }
	    
scan.close();
	    }
	}