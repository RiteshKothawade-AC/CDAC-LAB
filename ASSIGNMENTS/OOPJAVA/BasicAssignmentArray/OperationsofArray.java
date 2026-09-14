
public class OperationsofArray {
	public static void main(String[] args) {

		System.out.println("Enter the Size :");

		int size = ConsoleInput.getInt();

		int[] arr = new int[size];

		int Sum = 0;
		Float avg = 0f;

		// Sum of Array
		for (int itmp = 0; itmp < size; itmp++) {
			System.out.println("Enter Element:");
			arr[itmp] = ConsoleInput.getInt();

			Sum += arr[itmp];
		}
		System.out.println("\nSum = " + Sum);

		// Average of Array Elements
		avg = (float) Sum / arr.length;
		System.out.print("Average = " + avg);

		// Find Maximum and Minimum Element
		int max = arr[0];
		int min = arr[0];

		for (int itmp = 1; itmp < arr.length; itmp++) {

			if (arr[itmp] > max)
				max = arr[itmp];

			if (arr[itmp] < min)
				min = arr[itmp];
		}

		System.out.println("\nMax = " + max);
		System.out.println("Min = " + min);

		System.out.print("Reverse Array : ");

		for (int itmp = arr.length - 1; itmp >= 0; itmp--) {
			System.out.print(arr[itmp] + " ");
		}
			System.out.println("\nDuplicate Elements :");

			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {

					if (arr[i] == arr[j]) {
						System.out.print(arr[i]+" ");
					}
				}
			}

		
	}
}
