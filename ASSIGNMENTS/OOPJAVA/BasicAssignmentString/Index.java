
public class Index {
	public static void main(String[] args) {

		String str = "The quick brown fox jumps over the lazy dog.";

		for(char ch = 'a'; ch <= 'z'; ch++) {

			System.out.print(ch + ":" + str.indexOf(ch)+" ");
		}
	}

}
