import java.util.Scanner;

public class SumofNumbers{
    static void calculateSum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println(sum);
    }

    public static void main(String[] args) {
        SumofNumbers.calculateSum();
    }
}