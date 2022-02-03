package test.practice;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {

	    // creating an array list
	    ArrayList<String> animals = new ArrayList<>();
	    animals.add("Cow");
	    animals.add("Cat");
	    animals.add("Dog");
	    System.out.println("ArrayList: " + animals);

	    // iterate using for-each loop
	    System.out.println("Accessing individual elements:  ");
	    int size =animals.size();
	    boolean result=animals.isEmpty();
	    System.out.println("Checking ... "  +result);
	    System.out.println(size);
	    System.out.println("sublist... "  +animals.subList(0, 2));
	    for (String language : animals) {
	      System.out.print(language);
	      System.out.print(", ");
	    }
	  }
	}



