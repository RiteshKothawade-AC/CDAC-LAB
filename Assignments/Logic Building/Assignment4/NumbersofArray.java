import java.util.*;

public class NumbersofArray {
    public static void main(String[] args) {
        int arr[] = {-1, 4, -7, -8, 9, -13, -67};
        int positive = 0;
        int negative = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive++;
            } else if (arr[i] < 0) {
                negative++;
            } else {
                System.out.println("Number is zero");
            }
        }

        System.out.println("Total Positive Number :" + positive);
        System.out.println("Total Negative Number :" + negative);
    }
}