//Ext2.java
//Author: Luke Ngakane
 
// This program prints the sum, difference and product of two decimal numbers.

package sess2;

/*
 * -----------------------
 *  Import java utilities
 * -----------------------
 */

import java.util.Scanner; // Scanner 
import java.text.DecimalFormat; // Decimal Formater

public class Ext3 {
	
	public static void main(String[] args) {
	
//		Initiate new command line scanner
		Scanner scan = new Scanner(System.in);
		
//		Initiate Float (double) variables 
		double firstDouble, secondDouble;

//		Ask for First Number
		System.out.println("Enter the first decimal number: ");
//		Save input as firstDouble
		firstDouble = scan.nextDouble();
		
//		Ask for Second Number
		System.out.println("Enter the second decimal number: ");
//		Save input as secondDouble
		secondDouble = scan.nextDouble();
		
//		Calculate sum
		double sum = firstDouble + secondDouble;
		
//		Calculate difference
		double diff = firstDouble - secondDouble;
		
//		Calculate product
		double product = firstDouble * secondDouble;
		
//		\t = a tab space
		System.out.println("\n\t" + firstDouble + " + " + secondDouble + " = " + sum);
		System.out.println("\n\t" + firstDouble + " - " + secondDouble + " = " + diff);
		System.out.println("\n\t" + firstDouble + " * " + secondDouble + " = " + product);
		
	}
}
