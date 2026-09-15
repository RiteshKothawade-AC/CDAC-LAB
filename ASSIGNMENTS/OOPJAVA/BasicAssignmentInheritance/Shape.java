class ShapeDemo {

	public void displayShape() {
		System.out.println("This is shape");
	}
}

class Rectangle extends ShapeDemo {

	public void displayRectangle() {
		System.out.println("This is rectangular shape");
	}
}

class Circle extends ShapeDemo {

	public void displayCircle() {
		System.out.println("This is circular shape");
	}
}

class Square extends Rectangle {

	public void displaySquare() {
		System.out.println("Square is a rectangle");
	}
}

public class Shape {

	public static void main(String[] args) {

		Square objSquare = new Square();

		objSquare.displayShape();

		objSquare.displayRectangle();

		objSquare.displaySquare();
	}
}