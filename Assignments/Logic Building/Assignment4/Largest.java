import java.util.*;

public class Largest {
    public static void main(String[] args) {
        int arr[] = {1, 2, 7, 4, 9};
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}