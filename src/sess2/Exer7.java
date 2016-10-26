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

public class Exer7 {
	
	public static void main(String[] args) {
		
//		Initiate new command line scanner
		Scanner scan = new Scanner(System.in);
		
//		Initiate Integer (int) variables 
		int answerHours, answerMinutes, answerSeconds, totalSeconds, totalMinutes;
		
//		Add a new line (purely aesthetic)
		System.out.println();
		
//		Ask for total number of seconds
        System.out.print("Enter a number of seconds: ");
//		Save integer input to variable        
        totalSeconds = scan.nextInt();
        
//      **NOTE** % = remainder.
//      this (%) is called a Modulo operation, basically it divides the
//      value by the number after it and returns the left over
//      for more info http://stackoverflow.com/questions/2664301/how-does-modulus-divison-work

//      calculate leftover seconds
        answerSeconds = totalSeconds % 60;

//      calculate total minutes
        totalMinutes = totalSeconds / 60;
        
//		remove the extra seconds (we don't just round this otherwise 7.59 minutes would be 8)
        answerMinutes = totalMinutes % 60;
        
//      calculate total hours  
        answerHours = totalMinutes / 60;

//		Add a new line (purely aesthetic)
		System.out.println();

//		Output total seconds
        System.out.print(totalSeconds + " second");
//      add an "s" if more than 1 second
        if (totalSeconds> 1)
            System.out.print("s");       
        
//      Explain equivalant hours
        System.out.print(" is equivalent to " + answerHours + " hour");        
//      add an "s" if more than 1 hour
        if (answerHours > 1)
            System.out.print("s");       
        
//      Output minutes
        System.out.print(" and " + answerMinutes + " minute");
//      add an "s" if more than 1 minute
        if (answerMinutes > 1)
            System.out.print("s");       

//      Output seconds
        System.out.print(" and " + answerSeconds + " second");
//      add an "s" if more than 1 second
        if (answerSeconds > 1)
            System.out.print("s");
        
//      Add a new line (purely aesthetic)
        System.out.println(".");
        
        
        
        
        
		
	}

}
