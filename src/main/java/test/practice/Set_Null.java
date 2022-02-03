package test.practice;

import java.util.HashSet;

public class Set_Null {

	public static void main(String[] args)
    {
        //Creating HashSet object
 
        HashSet<String> set = new HashSet<String>();
 
        //Adding elements to HashSet
 
        set.add("ONE");
 
        set.add("TWO");
 
        set.add("THREE");
 
        set.add("FOUR");
        set.add("FOUR");
 
        //Adding 3 null elements to hashSet
 
        set.add(null);
 
        set.add(null);
 
        set.add(null);
 
        //Printing the elements of HashSet
 
        System.out.println(set);     //Output : [null, ONE, TWO, THREE, FOUR]
 
        //You can notice that HashSet contains only one null element
    }
}


