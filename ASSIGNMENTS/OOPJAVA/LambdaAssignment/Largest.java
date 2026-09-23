import java.util.Scanner;
import java.util.function.Function;

public class Largest
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
        // predefined Interface Lambda 
        Function<Integer[], Integer> largest =
                a ->
                {
                    Integer max = a[0];
                    for(int i = 0; i < a.length; i++)
                    {
                        if(a[i] > max)
                        {
                            max = a[i];
                        }
                    }
                    return max;
                };

        System.out.println("Largest Number = " + largest.apply(arr));

        sc.close();
    }
}