/**
 * 
 */
package basics.java.collection.stack;

import java.util.Stack;
import java.util.Vector;

/**
 * 
 */
public class StackExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// TODO Auto-generated method stub
		Stack namesStack = new Stack();
		namesStack.add("Nagappa");
		namesStack.add("Srikanth");
		namesStack.add("aswin");
		namesStack.add("soundarys");
		namesStack.add("kiran reddy");
		namesStack.add("Chakri");
		
		Stack newlyAddedNamesStack = new Stack();
		newlyAddedNamesStack.add("Nani");
		newlyAddedNamesStack.add("Chiru");
		newlyAddedNamesStack.add("Mohan");
		newlyAddedNamesStack.add("Kavitha");
		newlyAddedNamesStack.add("Kiran");
		
		Stack newlyRemovedNamesStack = new Stack();
		newlyRemovedNamesStack.add("Chakri");
		newlyRemovedNamesStack.add("Kiran");
		
		Stack finalStack = new Stack();
		System.out.println("final Stack size :" + finalStack.size());
		finalStack.addAll(namesStack);
		System.out.println("final Stack size :" + finalStack.size());
		finalStack.addAll(newlyAddedNamesStack);
		System.out.println("final Stack size :" + finalStack.size());
		finalStack.removeAll(newlyRemovedNamesStack);
		System.out.println("final Stack size :" + finalStack.size());
		
		System.out.println("kiran contains in final Stack : " + finalStack.contains("kiran reddy"));
		finalStack.add("kiran");
		finalStack.add("reddy");
		finalStack.add(5, "venkat");
		System.out.println("final Stack  :" + finalStack);
		finalStack.remove(5);
		System.out.println("final Stack size :" + finalStack.size());
		System.out.println("final Stack  :" + finalStack);
		
		System.out.println("names Stack size :" + namesStack.size());
		System.out.println("added Stack size :" + newlyAddedNamesStack.size());
		System.out.println("remove Stack size :" + newlyRemovedNamesStack.size());

	}

}
