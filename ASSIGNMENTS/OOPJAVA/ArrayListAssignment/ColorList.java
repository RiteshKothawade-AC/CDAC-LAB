package org.ritesh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class ColorList {
	public static void main(String[]args)
	{
		// Create an empty ArrayList of Strings
		//1. Write a Java program to create a new array list, add some colors (string) and print out the collection.

		ArrayList<String>colors=new ArrayList<>();
		
		// Add colors into the ArrayList
		colors.add("Red");
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Black");
		//printed
		System.out.println(colors);
		
		//call cursor
		//check string empty or not
		Iterator itr = colors.iterator();

		while(itr.hasNext())
		{
		    System.out.println(itr.next());
		}
		//2.add element by index
		colors.add(0,"orange");
		System.out.println(colors);
		//3.To retrieve an element
		colors.get(2);
		System.out.println(colors.get(1));
		
		// 4.Update specific element by index
        colors.set(1, "green");

        // Display updated list
        System.out.println(colors);
        
        
        // 5.Remove element
        colors.remove(2);

        // Display updated list
        System.out.println(colors);
        
        
         //6.Search Element //case sensitive
        if(colors.contains("Green"))
        {
            System.out.println("Element Found");
        }
        else
        {
            System.out.println("Element Not Found");
        }
        
        // 7.set sorting given arraylist
         Collections.sort(colors);
         System.out.println("Sorted ArrayList :"+colors);
         
         //8.make a copy of arraylist
         ArrayList<String>colors2= new ArrayList<>();
         for(int tmp=0;tmp<colors.size();tmp++)
         {
        	 colors2.add(null);
        	 
         }
         //colors2.addAll(colors);
         Collections.copy(colors2,colors);
         System.out.println("copiedlist :" +colors2);
         
//9. Modify the above Java program to shuffle elements in a array list.
         Collections.shuffle(colors);
         System.out.println("Shuffled List :"+colors);
         
         //10.Reverse elements of the Arraylist
         Collections.reverse(colors2);
         System.out.println("Reversed ArrayList :"+colors2);
         
				
	}

}
