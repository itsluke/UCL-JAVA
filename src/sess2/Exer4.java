//Ext4.java
//Author: Luke Ngakane
 
// This program Computes the Celsius equivalent of a user given Fahrenheit
// value using the formula C = (5/9)(F - 32). 

package sess2;

/*
 * -----------------------
 *  Import java utilities
 * -----------------------
 */

import java.util.Scanner; // Scanner 
import java.text.DecimalFormat; // Decimal Formater

public class Exer4 {

	public static void main(String[] args) {
		
//		Initiate new command line scanner
		Scanner scan = new Scanner(System.in);
		
//		Initiate an Integer which can only be assigned once,
//		variable should be written in FULL_CAPS to indicate this.
//		more info - https://en.wikipedia.org/wiki/Final_(Java)
		final int BASE = 32;
		final double CONVERSION_FACTOR = 5.0 / 9.0;

//		Initiate other variables
		int fahrenheitTemp;
		double celsiusTemp;
		
//		Ask user to enter a temp in Fahrenheit 
		System.out.print("\nEnter temperature in Fahrenheit: ");
//		Save integer as fahrenheitTemp
		fahrenheitTemp = scan.nextInt();
		
//		Calculate temp in Celsius
		celsiusTemp = (fahrenheitTemp - BASE) * CONVERSION_FACTOR;
		
//		Original Print result
//		System.out.println("Celsius Equivalent: " +  celsiusTemp + "°C\n");
		
//		-- IMPROVEMENTS --
//		using the decimal formatter from the Ext2 to format output
		
//		Create a new decimal formatter (2 decimal places)
		DecimalFormat twoDecPlcFormatter = new DecimalFormat("0.##");
		System.out.println("Celsius Equivalent: " +  twoDecPlcFormatter.format(celsiusTemp) + "°C\n");
	}

}
