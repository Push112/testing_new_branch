package test.practice;

import java.util.ArrayList;
import java.util.List;

public class genericCompile {
	/**
	 * This class is used to show the compile time checking test.
	 * 
	 */

		public static void main(String args[]){
			//Arraylist without generics.
			List list1 = new ArrayList();
			list1.add("Roxy");
			list1.add("Sandy");
			//No compile time error here 
			//because no compile time checking is done. 
			list1.add(new Integer(6));
	 
			//Arraylist with generics.	
			List<String> list2 = new ArrayList<String>();
			list2.add("Roxy");
			list2.add("Sandy");
			//Compile time error here 
			//because we are adding a integer 
			//in the string array list. 
			list2.add(new Integer(6));
		}
	}
}