public class UpperCase {

	public static void main(String[] args) {

		String str = "The Quick BroWn Fox!";

		System.out.println("Original String: " + str);
		
		//String is Immutable.So,it is assign to new object
		String upperStr = str.toUpperCase();

		System.out.println("Uppercase String: " + upperStr);
	}
}