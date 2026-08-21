import java.util.Scanner;

class PositiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;

        do {
            System.out.println("Enter the Number :");
            i = sc.nextInt();
            System.out.println("Number is Positive :" + i);
        } while (i <= 0);
    }
}