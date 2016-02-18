/***********************************
Name: Chad Medeiros

Description:
	Prints the song “The Twelve Days of Christmas” using repetition and switch statements.
Variables:
	ints: i - a counter (from 1 to 12) that will iterate through each of the twelve days of christmas.
	strings: day - used to represent the numerical day (i.e. 2) as a literal day ('second').
	strings: gift - contains the unique gift of the day that is appended to each following day's output.
	strings: temp - temporary string to allow newest gift to be displayed first.
Expected results:
	The entire "The Twelve Days of Christmas" song should be outputted with proper formatting.
Possible errors:
	No user input, so no potential bad results could occur.
***********************************/

// Start of Template Class
public class questionFive {

//Start of Main Method
	public static void main(String[] args) {
	
		// Declare variables
		String day = null;
		String gift = null;
		String temp = null;
		
		// For loop to iterate days from 1 through 12
		for (int i=1; i <= 12; i++) {
		
			// Begin switch to determine what action to take depending on which day it is
			switch (i) {
			// If i is 1 then it is the 'first' day, and the gift is 'a partridge in a pear tree'
			case 1: 
				day = "first";
				gift = "a Partridge in a Pear Tree.\n";
			break;
			case 2: 
				day = "second";
				// temp stores the gifts of the previous days...
				temp = gift;
				gift = "Two Turtle Doves\nand " + temp; // and appends it to the end of the current day.
			break;
			case 3: 
				day = "third";
				temp = gift; 
				gift = "Three French Hens\n" + gift;
			break;
			case 4: 
				day = "fourth";
				temp = gift; 
				gift = "Four Calling Birds\n" + gift;
			break;
			case 5: 
				day = "fifth";
				temp = gift; 
				gift ="Five Gold Rings\n" + gift;
			break;
			case 6: 
				day = "sixth";
				temp = gift; 
				gift = "Six Geese a-Laying\n" + gift;
			break;
			case 7: 
				day = "seventh";
				temp = gift; 
				gift = "Seven Swans a-Swimming\n" + gift;
			break;
			case 8: 
				day = "eigth";
				temp = gift; 
				gift = "Eight Maids a-Milking\n" + gift;
			break;
			case 9: 
				day = "ninth";
				temp = gift; 
				gift = "Nine Ladies Dancing\n" + gift;
			break;
			case 10: 
				day = "tenth";
				temp = gift; 
				gift = "Ten Lords a-Leaping\n" + gift;
			break;
			case 11: 
				day = "eleventh";
				temp = gift; 
				gift = "Eleven Pipers Piping\n" + gift;
			break;
			case 12: 
				day = "twelfth";
				temp = gift; 
				gift = "Twelve Drummers Drumming\n" + gift;
			break;
			}// End of Switch
			
			// Print song to the default output
			System.out.println("On the "+day+" day of Christmas my true love sent to me\n" + gift);	
			
		}// End of For Loop
	}// End of Main Method
}// End of Template Class
