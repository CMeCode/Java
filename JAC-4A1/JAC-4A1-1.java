/***********************************
Name: Chad Medeiros

Description:
	Asks the user to enter two integers, obtains them from the user, and prints their sum, product, difference and quotient.
Variables:
	ints: first, second - these store the two integers entered by the user.
	Scanner: in - this is the variable name of the Scanner object that will accept input from user.
Expected results:
	This code will ask for two integers, then print Sum: w Product: x Difference: y Quotient: z
Possible errors:
	Possible runtime error (input error) if user does not enter valid integer values.
	
***********************************/
// Include the Scanner library
import java.util.Scanner;

// Start of Template Class
public class questionOne {

	// Start of Main Method
	public static void main(String[] args) {
	
		// Declare variables
		int first, second;
		// Initialize Scanner to allow input
		Scanner in = new Scanner(System.in);
		
		// Ask user for input
		System.out.print("Enter an integer: ");
		// Allow user to enter first integer
		first = in.nextInt();
		// Ask user for input again
		System.out.print("Enter another integer: ");
		// Allow user to enter second integer
		second = in.nextInt();
		
		// Print to default output the Sum, Product, Difference, and Quotient calculations
		System.out.println("Sum: " + (first+second));
		System.out.println("Product: " + (first*second));
		System.out.println("Difference: " + (first-second));
		System.out.println("Quotient: " + (first/second));

		// Free the memory used by 'in' object
		in.close();
		
	}// End of Main Method
}// End of Template Class
