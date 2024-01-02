/**
 * 
 */
package basics.java.collection.treeset;

import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * 
 */
public class TreeSetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SortedSet namesHashSet = new TreeSet();
		TreeSet nameTreeSet = new TreeSet();
		nameTreeSet.add("Nagappa");
		nameTreeSet.add("Srikanth");
		nameTreeSet.add("Aswin");
		nameTreeSet.add("Soundarya");
		nameTreeSet.add("Kiran reddy");
		nameTreeSet.add("Kiran");
		nameTreeSet.add("Chakri");
		nameTreeSet.add("Nagappa");
		
		TreeSet newlyAddedNamesSet = new TreeSet();
		newlyAddedNamesSet.add("Nani");
		newlyAddedNamesSet.add("Chiru");
		newlyAddedNamesSet.add("Mohan");
		newlyAddedNamesSet.add("Kavitha");
		newlyAddedNamesSet.add("Kiran");
		newlyAddedNamesSet.add("Nagappa");
		
		TreeSet newlyRemovedNamesSet = new TreeSet();
		newlyRemovedNamesSet.add("Chakri");
		newlyRemovedNamesSet.add("Kiran");
		
		TreeSet finalSet = new TreeSet();
		System.out.println("final set size :" + finalSet.size());
		finalSet.addAll(nameTreeSet);
		System.out.println("final set size :" + finalSet.size());
		finalSet.addAll(newlyAddedNamesSet);
		System.out.println("final queue size :" + finalSet.size());
		finalSet.removeAll(newlyRemovedNamesSet);
		System.out.println("final set size :" + finalSet.size());
		
		System.out.println("kiran contains in final set : " + finalSet.contains("Kiran reddy"));
		finalSet.add("Kiran");
		finalSet.add("Reddy");
		
		System.out.println("final set  :" + finalSet);
		finalSet.remove("Kiran");
		//finalList.remove(5);
		System.out.println("final set size :" + finalSet.size());
		System.out.println("final set  :" + finalSet);
		
		finalSet.remove("Nani");
		//finalList.remove(5);
		System.out.println("final set size :" + finalSet.size());
		System.out.println("final set  :" + finalSet);
		
		System.out.println("names set size :" + nameTreeSet.size());
		System.out.println("added set size :" + newlyAddedNamesSet.size());
		System.out.println("remove set size :" + newlyRemovedNamesSet.size());
	
		
		
	
	}

}
