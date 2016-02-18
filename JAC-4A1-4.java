/***********************************
Name: Chad Medeiros

Description: 
	Evaluates the factorials of the integers from 1 to 5 and display the results in tabular format.
Variables:
	ints: i - a counter (from 1 to 5) that will act as the Number value to base a Factorial off of.
	ints: factorial - the calculated Factorial value based on the Number (i)
Expected results:
	This code will make a table with headings Number and Factorial.
	The table will contain 5 rows (1 to 5) with appropriate values calculated
Possible errors:
	No user input, so no potential errors could occur.
	
***********************************/

// Start of Template Class
public class questionFour {

// Start of Main Method
	public static void main(String[] args) {
	
		// Declare variables
		int factorial = 1;
		
		// Print table headings to default output
		System.out.println("Number\tFactorial");
		// For loop to iterate through 1 to 5
		for (int i=1; i<=5; i++) {
			// Calculate factorial value based on number (i)
			factorial *= i;
			// Print out line of table: Number (i) and Factorial (factorial)
			System.out.println(i+"\t"+factorial);
			
		}// End of For Loop
	}// End of Main Method
}// End of Template Class
