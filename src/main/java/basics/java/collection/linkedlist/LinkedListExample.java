/**
 * 
 */
package basics.java.collection.linkedlist;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 * 
 */
public class LinkedListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList namesList = new LinkedList();
		namesList.add("Nagappa");
		namesList.add("Srikanth");
		namesList.add("aswin");
		namesList.add("soundarya");
		namesList.add("kiran reddy");
		namesList.add("Chakri");
		namesList.add("soundarya");
		namesList.add("Chakri");
		namesList.add(123);
		
		
		LinkedList newlyAddedNamesList = new LinkedList();
		newlyAddedNamesList.add("Nani");
		newlyAddedNamesList.add("Chiru");
		newlyAddedNamesList.add("Mohan");
		newlyAddedNamesList.add("Kavitha");
		newlyAddedNamesList.add("Kiran");
		newlyAddedNamesList.add("Kavitha");
		newlyAddedNamesList.add("Mohan");
		LinkedList newlyRemovedNamesList = new LinkedList();
		newlyRemovedNamesList.add("Chakri");
		newlyRemovedNamesList.add("Kiran");
		
		LinkedList finalList = new LinkedList();
		System.out.println("final list size :" + finalList.size());
		finalList.addAll(namesList);
		System.out.println("final list size :" + finalList.size());
		finalList.addAll(newlyAddedNamesList);
		System.out.println("final list size :" + finalList.size());
		finalList.removeAll(newlyRemovedNamesList);
		System.out.println("final list size :" + finalList.size());
		
		System.out.println("kiran contains in final list : " + finalList.contains("kiran reddy"));
		finalList.add("kiran");
		finalList.add("reddy");
		finalList.add(5, "venkat");
		System.out.println("final list  :" + finalList);
		finalList.remove();
		//finalList.remove(5);
		System.out.println("final list size :" + finalList.size());
		System.out.println("final list  :" + finalList);
		
		HashSet finalSet = new HashSet();
		finalSet.addAll(finalList);
		System.out.println("final set  :" + finalSet);
		TreeSet treeSet = new TreeSet();
		treeSet.addAll(finalList);
		System.out.println("tree set  :" + treeSet);
		
		finalList.remove();
		//finalList.remove(5);
		System.out.println("final list size :" + finalList.size());
		System.out.println("final list  :" + finalList);
		
		System.out.println("names list size :" + namesList.size());
		System.out.println("added list size :" + newlyAddedNamesList.size());
		System.out.println("remove list size :" + newlyRemovedNamesList.size());
		
	}

}
