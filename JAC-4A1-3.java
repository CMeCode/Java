/***********************************
Name: Chad Medeiros

Description:
	Inputs one salesperson’s items sold for a week and calculates and displays 
	that salesperson’s earnings based on a given formula.
Variables:
	ints: i - a counter used to count the total number of items entered.
	double: value, total - value stores each entered item's value, total stores the combination of all items values.
Expected results:
	This code will make a table with headings Number Square and Cube. 
	The table will contain 11 rows (0 to 10) with appropriate calculated values.
Possible errors:
	Possible runtime error (input error) if user does not enter valid double values.
***********************************/

// Include the Scanner library
import java.util.Scanner;
// Start of Template Class

public class questionThree {
// Start of Main Method

	public static void main(String[] args) {
	
		// Declare variables
		int i = 1;
		double value = 0;
		double total = 0;
		// Initialize Scanner to allow input
		Scanner in = new Scanner(System.in);

		// Ask user to enter values for all items sold
		System.out.println("Enter the value of the items sold (one at a time). Enter '0' to end.");
		// Start a do-while loop to begin with one item and continue until the user enters zero (0)		
		do {
				// Ask for individual item value
				System.out.print("Item "+ i++ + ": ");	
				// Store entered value as 'value'
				value = in.nextDouble();
				// Calculate and store total
				total += value;
		} while (value != 0); // Continue loop until user enters 0

		// Once input is complete, output the calculated sales earnings based on total value of items sold
		System.out.printf("Total earnings for salesperson this week: %.2f", (200+(total*0.09)));
		
		// Free the memory used by 'in' object
		in.close();
		
	}// End of Main Method
}// End of Template Class
