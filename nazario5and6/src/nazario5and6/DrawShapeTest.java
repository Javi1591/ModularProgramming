package nazario5and6;

public class DrawShapeTest {

	public static void main(String[] args) {
		DrawShape.drawRectangle(3);  // draw a square of plus signs
		DrawShape.drawRectangle(3, 6);  // draw a rectangle of X's
		DrawShape.drawRectangle(3, 7, '*'); // draw a rectangle of *
		DrawShape.drawRectangle(4, 8, 'X','O'); // draw a rectangle
	}
}
