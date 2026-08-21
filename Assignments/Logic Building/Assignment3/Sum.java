import java.util.Scanner;

public class Sum {
    static int sumOfNum(int num1, int num2) {
        int answer = num1 + num2;
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();

        int ans = Sum.sumOfNum(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + ans);
    }
}