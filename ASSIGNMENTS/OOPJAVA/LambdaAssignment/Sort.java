import java.util.*;

public class Sort
{
    public static void main(String[] args)
    {
        String[] names =
        {
            "Ravi",
            "Rahul",
            "RK"
        };
        //Without lambda
//        SortArray s = new SortArray()
//        {
//            @Override
//            public void sort(String[] arr)
//            {
//                Arrays.sort(arr);
//            }
//        };
        //With Lambda 
        SortArray s=arr->Arrays.sort(arr);
        s.sort(names);
        

        System.out.println(Arrays.toString(names));
    }
}