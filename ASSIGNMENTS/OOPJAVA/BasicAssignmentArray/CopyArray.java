
public class CopyArray {

	public static void main(String[] args) {

		System.out.println("Enter the Size :");

		int size = ConsoleInput.getInt();

		int[] arr = new int[size];
		int[] arr1 = new int[size];

		for (int itmp = 0; itmp < size; itmp++) {
			System.out.println("Enter value:");
			arr[itmp] = ConsoleInput.getInt();
		}

		System.out.println("Array Elements:");

		for (int itmp = 0; itmp < size; itmp++) {
			System.out.print(arr[itmp] + " ");

		}

		// Copy elements from arr1 to arr2
		for (int itmp = 0; itmp < arr.length; itmp++) {
			arr1[itmp] = arr[itmp];
		}
		System.out.println("\nCopied Array");

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}

	}

}
