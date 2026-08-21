import java.util.Scanner;

public class AgeChecker {
    static void checker() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();

        if (age < 18) {
            System.out.println("You are a teenager");
        } else if (age >= 18 && age <= 50) {
            System.out.println("You are a Adult");
        } else {
            System.out.println("You are old");
        }
    }

    public static void main(String[] args) {
        AgeChecker.checker();
    }
}