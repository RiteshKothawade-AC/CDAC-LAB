import java.util.Scanner;
import java.util.function.Predicate;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Predefined FuntionalInterface it return boolean 
        Predicate<Integer> isPrime =
                n ->
                {
                    if(n <= 1)
                    {
                        return false;
                    }

                    for(int i = 2; i < n; i++)
                    {
                        if(n % i == 0)
                        {
                            return false;
                        }
                    }

                    return true;
                };

        if(isPrime.test(num))
        {
            System.out.println(num + " is a Prime Number");
        }
        else
        {
            System.out.println(num + " is not a Prime Number");
        }

    }
}