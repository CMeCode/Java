/***********************************
Name: Chad Medeiros

Description:
	Calculates the squares and cubes of the numbers from 0 to 10 and prints the resulting values in table format.
Variables:
	ints: i - a counter used to count from 0 to 10.
Expected results:
	This code will make a table with headings Number Square and Cube. 
	The table will contain 11 rows (0 to 10) with appropriate calculated values.
Possible errors:
	No user input, so no potential bad results could occur.
***********************************/

// Start of Template Class
public class questionTwo {
	// Start of Main Method
	public static void main(String[] args) {
		
		// Print table headings to default output
		System.out.println("Number\tSquare\tCube");
		// For loop to iterate through 0 to 10
		for (int i=0; i <= 10; i++) {
			// For each number in 0 to 10, print out a line in the table with the value of i, i squared, and i cubed
			System.out.println(i+"\t"+i*i+"\t"+i*i*i);
		}// End of For Loop

	}// End of Main Method
}// End of Template Class
