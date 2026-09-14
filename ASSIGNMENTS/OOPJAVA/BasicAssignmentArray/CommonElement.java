public class CommonElement {

    public static void main(String[] args) {

        System.out.println("Enter size of first array :");
        int size1 = ConsoleInput.getInt();

        int[] arr1 = new int[size1];

        for(int i = 0; i < arr1.length; i++) {
            System.out.println("Enter element");
            arr1[i] = ConsoleInput.getInt();
        }

        System.out.println("Enter size of second array:");
        int size2 = ConsoleInput.getInt();

        int[] arr2 = new int[size2];

        for(int i = 0; i < arr2.length; i++) {
            System.out.println("Enter element:");
            arr2[i] = ConsoleInput.getInt();
        }

        System.out.println("Common Elements:");

        for(int i = 0; i < arr1.length; i++) {

            for(int j = 0; j < arr2.length; j++) {

                if(arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}