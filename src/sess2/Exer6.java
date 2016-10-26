//Ext4.java
//Author: Luke Ngakane

// This program converts a time in hours, minutes and seconds to seconds only.

package sess2;

/*
 * -----------------------
 *  Import java utilities
 * -----------------------
 */

import java.util.Scanner; // Scanner 

public class Exer6 {
	
	public static void main(String[] args) {
		
//		Initiate new command line scanner
		Scanner scan = new Scanner(System.in);
		
//		Initiate Integer (int) variables 
		int givenHours, givenMinutes, givenSeconds, totalSeconds;
		
//		Add a new line (purely aesthetic)
		System.out.println();
		
//		Ask for hours
        System.out.print("Enter a number of hours: ");
//		Save integer input to variable        
        givenHours = scan.nextInt();
        
//		Ask for minutes
        System.out.print("Enter a number of minutes: ");
//		Save integer input to variable
        givenMinutes = scan.nextInt();
        
//		Ask for seconds
        System.out.print("Enter a number of seconds: ");
//		Save integer input to variable
        givenSeconds = scan.nextInt();

//      Calculate total number of seconds 
        totalSeconds = ((60 * givenHours) + givenMinutes) * 60 + givenSeconds;

//		Add a new line (purely aesthetic)
		System.out.println();
		
//      Output hours
        System.out.print(givenHours + " hour");
//      add an "s" if more than 1 hour
        if (givenHours > 1)
            System.out.print("s");       
        
//      Output minutes
        System.out.print(" and " + givenMinutes + " minute");
//      add an "s" if more than 1 minute
        if (givenMinutes > 1)
            System.out.print("s");       

//      Output seconds
        System.out.print(" and " + givenSeconds + " second");
//      add an "s" if more than 1 second
        if (givenSeconds > 1)
            System.out.print("s");
        
        System.out.print(" is equivalent to " + totalSeconds + " second");
        if (totalSeconds > 1)
            System.out.print("s");
        System.out.println(".");
        
//        Add a new line (purely aesthetic)
        System.out.println();
        
        
        
        
        
		
	}

}
