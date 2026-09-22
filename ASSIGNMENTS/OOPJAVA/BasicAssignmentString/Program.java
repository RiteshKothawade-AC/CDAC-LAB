
public class Program {
	public static void main(String[]args)
	{
		//String is Immutable
		String str1 ="CDAC";
		str1.concat("Mumbai");
		System.out.println(str1);
		
		//This creates new string
		str1=str1 +" Mumbai";
		System.out.println(str1);
		
		//StringBuffer is mutable
		StringBuffer objStr=new StringBuffer(str1);
		objStr.append(" Mumbai");
		System.out.println(objStr);
		
		//Retrieve character of index
		String str="JAVA EXERCISES!";
		System.out.println("Original String = " + str);
		System.out.println("At 0 Position= " + str.charAt(0));
		System.out.println("At 10th position= " + str.charAt(10));

		
		
		
		
	}
}
