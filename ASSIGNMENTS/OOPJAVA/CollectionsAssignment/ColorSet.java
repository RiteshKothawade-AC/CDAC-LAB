package org.ritesh;
import java.util.TreeSet;

public class ColorSet {
	public static void main(String[]args)
	{
		TreeSet<String>colors=new TreeSet<>();
		
		colors.add("Red");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Black");
		
		System.out.println(colors);
		
	//Copy set to another
	TreeSet<String>colors2=new TreeSet<>();
	
	colors2.addAll(colors);
	System.out.println("Copied Set :"+colors);
	
	//Reserve the Set
	System.out.println(colors2.descendingSet());
	
	//retrieve first amd last element
	System.out.println("First Element: "+ colors.first());
	System.out.println("Last Element: "+ colors.last());
	
	// Find element greater than or equal
	//if not equal gives next element
    System.out.println(colors.ceiling("Green"));


	
	}
	

}
