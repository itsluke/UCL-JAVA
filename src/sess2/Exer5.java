// Exer2.java
// Author: Luke Ngakane
    
/* This program prints a 3 line pounds/euros/dollars exchange table. */ 

package sess2;

/*
 * -----------------------
 *  Import java utilities
 * -----------------------
 */

import java.util.Scanner; // Scanner 
import java.text.DecimalFormat; // Decimal Formatter

public class Exer5 {
	
	public static void main(String[] args) {

//		Initiate new command line scanner
		Scanner scan = new Scanner(System.in);
		
//		Initiate an Double which can only be assigned once,
//		variable should be written in FULL_CAPS to indicate this.
//		more info - https://en.wikipedia.org/wiki/Final_(Java)
		final double EURO_EXCHANGE_RATE = 1.12059;
	    final double DOLLAR_EXCHANGE_RATE = 1.22312;

//		Create a new decimal formatter (2 decimal places)
	    DecimalFormat twoDecPlcFormatter = new DecimalFormat("0.##"); 
	    
//	    Ask user to enter UK amount
	    System.out.print("\nEnter a starting amount in UK sterling: ");
//	    Save double as ukAmount
	    double ukAmount = scan.nextDouble();
	    
//	    \n = new line, \t = tab
	    System.out.println("\n\tPOUNDS\t\tEUROS\t\tDOLLARS");
	    
//	    Print UK amount
//	    **NOTE** using System.out.print not println 
	    System.out.print("\t" + twoDecPlcFormatter.format(ukAmount) + "\t\t");
//	    Print EURO amount
	    System.out.print(twoDecPlcFormatter.format(ukAmount*EURO_EXCHANGE_RATE) + "\t\t");
//	    Print DOLLAR amount
//	    **NOTE** using println to terminate the line
	    System.out.println(twoDecPlcFormatter.format(ukAmount*DOLLAR_EXCHANGE_RATE));
		
//	    increase ukAmount by 10
	    ukAmount = ukAmount + 10; 
	    
//	    Print UK amount
//	    **NOTE** using System.out.print not println 
	    System.out.print("\t" + twoDecPlcFormatter.format(ukAmount) + "\t\t");
//	    Print EURO amount
	    System.out.print(twoDecPlcFormatter.format(ukAmount*EURO_EXCHANGE_RATE) + "\t\t");
//	    Print DOLLAR amount
//	    **NOTE** using println to terminate the line
	    System.out.println(twoDecPlcFormatter.format(ukAmount*DOLLAR_EXCHANGE_RATE));
			    
//	    increase ukAmount by 100
	    ukAmount = ukAmount + 90; // note the variable has already changed +10 
	    
//	    Print UK amount
//	    **NOTE** using System.out.print not println 
	    System.out.print("\t" + twoDecPlcFormatter.format(ukAmount) + "\t\t");
//	    Print EURO amount
	    System.out.print(twoDecPlcFormatter.format(ukAmount*EURO_EXCHANGE_RATE) + "\t\t");
//	    Print DOLLAR amount
//	    **NOTE** using println to terminate the line
	    System.out.println(twoDecPlcFormatter.format(ukAmount*DOLLAR_EXCHANGE_RATE));
			    
		
	}
}
