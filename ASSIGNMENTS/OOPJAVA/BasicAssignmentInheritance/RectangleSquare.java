class Rectangle1 {

	private double length;
	private double breadth;

	Rectangle1(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public void printArea() {
		double area = length * breadth;
		System.out.println("Area: " + area);
	}

	public void printPerimeter() {
		double perimeter = 2 * (length + breadth);
		System.out.println("Perimeter: " + perimeter);
	}
}


class Square1 extends Rectangle1 {

	Square1(double side) {
		super(side, side);
	}
}


public class RectangleSquare {

	public static void main(String[] args) {

		System.out.println("Enter side :");
		int length = ConsoleInput.getInt();
		int breadth = ConsoleInput.getInt();
		Rectangle1 rectangleObj = new Rectangle1(length,breadth);

		rectangleObj.printArea();
		rectangleObj.printPerimeter();

		int side = ConsoleInput.getInt();
		Square1 squareObj = new Square1(side);

		squareObj.printArea();
		squareObj.printPerimeter();
	}
}