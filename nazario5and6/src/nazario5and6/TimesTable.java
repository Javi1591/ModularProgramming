// Xavier Nazario
// Student ID# 2512208
package nazario5and6;

// Program that displays a times table with the
// numbers 1 through 9, using for loops.
public class TimesTable {

	/** Main method */
	public static void main(String[] args) {

		// Display table heading
		System.out.println("Multiplication Table");

		// Display the odd number column using for loop
		// Skip even number using nested loop
		// Use integer
		System.out.print(" ");
		for (int j = 1; j <= 9; j++)
			if (j % 2 != 0) { // Skip here
				System.out.print("   " + j);
			}

		// Display a dashed line
		System.out.println("\n----------" + "-------------------");

		// Display even numbered rows using for loop
		// Skip odd number
		// Use integer
		for (int i = 2; i <= 9; i++) { // Outer loop
			if (i % 2 == 0) { // Skip odd number
				System.out.print(i + "|");
				for (int j = 1; j <= 9; j++) { // Inner loop
					if (j % 2 != 0) // Skip here
						// Display body
						// Align
						System.out.printf("%4d", i * j);
				}

				System.out.println();
			}
		}
	}
}