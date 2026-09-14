public class Triangle {

    int side1;
    int side2;
    int side3;

    Triangle(int side1, int side2, int side3) {

        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public int Area() {

        int area = (side1 * side2) / 2;

        return area;
    }

    public int Perimeter() {

        int perimeter = side1 + side2 + side3;

        return perimeter;
    }

    public static void main(String[] args) {

        Triangle t1 = new Triangle(3, 4, 5);

        System.out.println("Area = " + t1.Area());

        System.out.println("Perimeter = " + t1.Perimeter());
    }
}