public class LargestNumber {
    public static void main(String[] args) {
        int a = 50;
        int b = 25;
        int c = 200;

        if (a > b && a > c) {
            System.out.println("A is Largest");
        } else if (b > c) {
            System.out.println("B is Largest");
        } else {
            System.out.println("C is Largest");
        }
    }
}