# COP2251 – Java Assignments 5 & 6

## Summary
These assignments emphasize modular design with overloaded methods and repetition structures. Assignment 5 implements multiple drawing utilities using nested loops and method overloading to render rectangles with various sizes and characters. Assignment 6 prints a formatted multiplication table using nested loops and alignment with `printf`.

## Program Behavior
- DrawShape (Assignment 5)
  - Provides several overloaded `drawRectangle` methods:
    - `drawRectangle(int sideLength)` – prints a square using `'+'` characters.
    - `drawRectangle(int height, int width)` – prints a filled rectangle using `'X'`.
    - `drawRectangle(int height, int width, char fillChar)` – prints a filled rectangle using a custom fill character.
    - `drawRectangle(int height, int width, char borderChar, char fillChar)` – prints a rectangle with a border rendered by `borderChar` and interior filled by `fillChar`.
  - `DrawShapeTest.main` calls each overload with sample dimensions to demonstrate the different outputs.
- TimesTable (Assignment 6)
  - Prints a “Multiplication Table” heading.
  - Uses nested `for` loops to display products between 1..9.
  - Applies simple parity checks to control which rows/columns are printed and uses `System.out.printf("%4d", value)` to align the table output.

## Key Concepts Demonstrated
- Method Overloading: Multiple `drawRectangle` signatures for different rendering requirements.
- Nested Loops: Outer/inner `for` loops to iterate rows and columns in ASCII-art shapes and multiplication tables.
- Console Formatting: `System.out.printf` with width specifiers for aligned columns.
- Package and Module Layout: Source under `package nazario5and6` with a simple `module-info.java`.
- Basic API Design: Separating a utility class (`DrawShape`) from a driver/test class (`DrawShapeTest`).

## How to Compile and Run
Requirements:
- Java Development Kit (JDK) 17 or later
- Command line terminal or IDE (IntelliJ IDEA, Eclipse, or VS Code)

Commands (from the `nazario5and6/src` directory):
javac -d ../out module-info.java nazario5and6/DrawShape.java nazario5and6/DrawShapeTest.java nazario5and6/TimesTable.java  
java -cp ../out nazario5and6.DrawShapeTest  
java -cp ../out nazario5and6.TimesTable
