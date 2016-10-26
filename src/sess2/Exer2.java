// Exer2.java
// Author: Luke Ngakane
    
/* This program calculates the average of three integers. */ 

package sess2;

/*
 * -----------------------
 *  Import java utilities
 * -----------------------
 */

import java.util.Scanner; // Scanner 
import java.text.DecimalFormat; // Decimal Formater

public class Exer2 {

	public static void main(String[] args) {
		
//		Initiate new command line scanner
		Scanner scan = new Scanner(System.in);
		
//		Initiate Integer (int) variables 
		int firstInt, secondInt, thirdInt;
//		Initiate double (I think this is a float)
		double average;
		
//		Ask for First Number
		System.out.println("Enter the first integer: ");
//		Save input as firstInt
		firstInt = scan.nextInt();

//		Ask for Second Number
		System.out.println("Enter the second integer: ");
//		Save input as secondInt
		secondInt = scan.nextInt();
		
//		Ask for Third Number
		System.out.println("Enter the third integer: ");
//		Save input as thirdInt
		thirdInt = scan.nextInt();
		
//		calculate the average
		average = ( firstInt + secondInt + thirdInt ) / 3.0; // the .0 is important because it's a "float"(decimal) not an "integer" (whole number)
		
//		Output the result
		
//		String formatters; \n = new line, 
		System.out.print( "\nThe average of " + firstInt + ", " + secondInt + "and " + thirdInt );
		
//		You don't need to split this, it's just for readability.  
		System.out.print( " is : " );
	
//		threeDecPlcFormatter.format() is a function from the decimal formater (this is something google would tell you to do) 
//		System.out.print( average ); would work but might be 1000's of decimals 
//		Initiate a new formatter
		
		DecimalFormat threeDecPlcFormatter = new DecimalFormat("0.###");
		System.out.print( threeDecPlcFormatter.format(average) + "\n" );
		
	}

}
