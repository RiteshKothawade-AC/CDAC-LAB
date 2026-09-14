public class Array {
	public static void main(String[] args) {
		// Method 1
		// int[] arr1 = new int[10];

		// Method 2
		int[] arr2 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// Method 3 (Shorthand)
		// int[] arr = {1,2,3,4,5};

		// arr[0] = 11;

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
	}
}