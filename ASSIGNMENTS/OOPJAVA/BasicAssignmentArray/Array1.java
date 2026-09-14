public class Array1 {

	public static void main(String[] args) {

		System.out.println("Enter the Size :");

		int size = ConsoleInput.getInt();

		int[] arr = new int[size];

		for (int itmp = 0; itmp < size; itmp++) {
			System.out.println("Enter value:");
			arr[itmp] = ConsoleInput.getInt();
		}

		System.out.println("Array Elements:");

		for (int itmp = 0; itmp < size; itmp++) {
			System.out.print(arr[itmp] + " ");

		}
		for (int itmp = 0; itmp < arr.length - 1; itmp++) {
			for (int jtmp = itmp + 1; jtmp < arr.length; jtmp++) {
				if (arr[itmp] > arr[jtmp]) {
					int temp = arr[itmp];
					arr[itmp] = arr[jtmp];
					arr[jtmp] = temp;
				}
			}
		}
		System.out.println("\n" + "Sorted Array :");

		for (int itmp = 0; itmp < arr.length; itmp++) {
			System.out.print(arr[itmp] + " ");
		}

	}
}