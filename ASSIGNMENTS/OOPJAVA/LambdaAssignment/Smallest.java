import java.util.Scanner;
import java.util.function.Function;

public class Smallest
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

        //inbuilt FuntionalInterface Lambda expression 
        Function<Integer[], Integer> smallest =
                a ->
                {
                    Integer min = a[0];

                    // Compare each element with current minimum
                    for(int i = 0; i < a.length; i++)
                    {
                        if(a[i] < min)
                        {
                            min = a[i];
                        }
                    }

                    return min;
                };

        System.out.println("Smallest Number = " + smallest.apply(arr));

        sc.close();
    }
}