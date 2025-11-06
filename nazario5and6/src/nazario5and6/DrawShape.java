// Xavier Nazario
// Student ID# 2512208
package nazario5and6;

// Program that draws shapes using 4 methods through loops

public class DrawShape {

	// Method 1: Draws a Square with +
	// Use side length
	// Use integer
    public static void drawRectangle(int sideLength) {
    	
    	// Outer for loop
    	for (int i = 0; i < sideLength; i++) {
    		// Inner for loop
            for (int j = 0; j < sideLength; j++) {
            	// Display no fill Square
                if (i == 0 || i == sideLength - 1 || j == 0 || j == sideLength - 1) {
                    System.out.print("+ ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Method 2: Draws a Rectangle with X's
    // Use height and width
    // Use integer
    public static void drawRectangle(int height, int width) {
    	
    	// Outer for loop
        for (int i = 0; i < height; i++) {
        	// Inner for loop
            for (int j = 0; j < width; j++) {
            	// Display no fill Rectangle
            	if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    System.out.print("X ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Method 3: Draws a Rectangle with *
    // Use height and width
    // Use integer
    // Use character border
    public static void drawRectangle(int height, int width, char borderChar) {
    	
    	// Outer for loop
        for (int i = 0; i < height; i++) {
        	// Inner for loop
            for (int j = 0; j < width; j++) {
            	// Display no fill Rectangle
            	if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                    System.out.print(borderChar + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    // Method 4: Draws a Rectangle with X and O
    // Use width and height
    // Use integer
    // Use character and border fill
    public static void drawRectangle(int height, int width, char borderChar, char fillChar ) {
    	
    	// Outer for loop
        for (int i = 0; i < height; i++) {
        	// Inner for loop
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1 || j == 0 || j == width - 1) {
                	// Display no fill Rectangle
                    System.out.print(borderChar + " ");
                } else {
                    System.out.print(fillChar + " ");
                }
            }
            System.out.println();
        }
    }
}