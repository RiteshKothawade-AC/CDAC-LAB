public class Replace{

	public static void main(String[] args) {

		String str = "The quick brown fox jumps over the lazy dog.";

		System.out.println("Original String: " + str);
		
		//String is Immutable.So,it is assign to new object
		String newStr = str.replace("fox", "cat");

		System.out.println("New String: " + newStr);
	}
}