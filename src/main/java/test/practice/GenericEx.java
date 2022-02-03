package test.practice;

	// A generic class to store any type of object. 
	// Here,
//e when an object of type Myclass is created.
	public class Myclass<T>
	{
	    T obj; // Declaring an object of type T.
	// Declare a constructor to initialize T type object. 
	     Myclass(T obj) {
	           this.obj = obj; 
	    }
	// Declare an instance method that will return T type object. 
	     T getObject() {
		  return obj; 
	    }
	}
	public class GenericEx {
	public static void main(String[] args) 
	{
	// Create an object of Integer class.
	     Integer i = 20; // This is same as: Integer i = new Integer(20);
	// Create an object of Myclass and store Integer object into it.  
	     Myclass<Integer> obj = new Myclass<Integer>(i);
	// Call getObject() method to get Integer object.   
	     System.out.println("Stored value: " +obj.getObject());   

	// In the same way, we will use Myclass for storing Double object and retrieve it.
	     Double d = 20.25; // Same as Double d = new Double(20.25);
	     Myclass<Double> obj2 = new Myclass<Double>(d);
	     System.out.println("Stored value: " +obj2.getObject());
	// We can also use Myclass to store String type data also, as:
	     String str = "Scientech Easy";
	     Myclass<String> obj3 = new Myclass<String>(str);
	     System.out.println("Stored value: " +obj3.getObject());
	  }
	}

}
