package test.practice;

class BaseClass {
	   p void display() {
	      System.out.println("In the base class,test() method");
	   }
	}
	class ChildClass extends BaseClass {
	   @Override 
	   public void display() {
	      System.out.println("In the child class, test() method");
	   }
	}
	// main class
	public class InheritenceEx {
	   public static void main(String args[]) {
	      System.out.println("@Override Example");
	      BaseClass test = new ChildClass();
	      test.display();
	   }
	}