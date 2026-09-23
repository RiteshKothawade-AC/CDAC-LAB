import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class Reverse
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        Integer[] arr = new Integer[size];

        System.out.println("Enter array elements:");
        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }

        Function<Integer[], Integer[]> reverse =
                a ->
                {
                    Integer[] rev = new Integer[a.length];

                    for(int i = 0; i < a.length; i++)
                    {
                        rev[i] = a[a.length - 1 - i];
                    }

                    return rev;
                };

        Integer[] reversedArray = reverse.apply(arr);

        System.out.println("Reversed Array = "
                + Arrays.toString(reversedArray));

        sc.close();
    }
}