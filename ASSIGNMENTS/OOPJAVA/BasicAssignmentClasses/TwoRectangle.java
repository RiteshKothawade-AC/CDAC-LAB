public class TwoRectangle {

    int length;
    int breadth;

    TwoRectangle(int length, int breadth) {

        this.length = length;
        this.breadth = breadth;
    }

    public int Area() {

        return length * breadth;
    }

    public static void main(String[] args) {

        TwoRectangle r1 = new TwoRectangle(4, 5);
        System.out.println("Area = " + r1.Area());

        TwoRectangle r2 = new TwoRectangle(5, 8);
        System.out.println("Area = " + r2.Area());
    }
}