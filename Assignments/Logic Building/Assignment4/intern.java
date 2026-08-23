public class intern{
    public static void main(String[] args) {
        
		String s1 = "hello";
        String s2 = new String("hello").intern();

        System.out.println(s1 == s2);
        
    }
}