public class Reverse {

	public static void main(String[] args) {

		String str = "abcdef";

		System.out.println("Original String: " + str);

		// Variable to store reversed string
		String reverse = "";

		// Loop from last char to first char
		//It str.length=6.So,length-1=5 it will be 5 to 0=6
		for(int i = str.length() - 1; i >= 0; i--) {

			// Add each char
			reverse = reverse + str.charAt(i);
		}

		System.out.println("Reversed String: " + reverse);
		
		//Inbuilt Method by usinsg StringBuffer
		StringBuffer objStr = new StringBuffer(str);

		System.out.println("Reverse By Using StringBuffer: "+ objStr.reverse());
	}
}