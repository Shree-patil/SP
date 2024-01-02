/**
 * 
 */
package basics.java.collection.linkedhashset;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * 
 */
public class LinkedHashSetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet namesHashSet = new LinkedHashSet();
		namesHashSet.add("Nagappa");
		namesHashSet.add("Srikanth");
		namesHashSet.add("Aswin");
		namesHashSet.add("Soundarya");
		namesHashSet.add("Kiran reddy");
		namesHashSet.add("Kiran");
		namesHashSet.add("Chakri");
		namesHashSet.add("Nagappa");
		
		LinkedHashSet newlyAddedNamesSet = new LinkedHashSet();
		newlyAddedNamesSet.add("Nani");
		newlyAddedNamesSet.add("Chiru");
		newlyAddedNamesSet.add("Mohan");
		newlyAddedNamesSet.add("Kavitha");
		newlyAddedNamesSet.add("Kiran");
		newlyAddedNamesSet.add("Nagappa");
		
		LinkedHashSet newlyRemovedNamesSet = new LinkedHashSet();
		newlyRemovedNamesSet.add("Chakri");
		newlyRemovedNamesSet.add("Kiran");
		
		LinkedHashSet finalSet = new LinkedHashSet();
		System.out.println("final queue size :" + finalSet.size());
		finalSet.addAll(namesHashSet);
		System.out.println("final queue size :" + finalSet.size());
		finalSet.addAll(newlyAddedNamesSet);
		System.out.println("final queue size :" + finalSet.size());
		finalSet.removeAll(newlyRemovedNamesSet);
		System.out.println("final list size :" + finalSet.size());
		
		System.out.println("kiran contains in final queue : " + finalSet.contains("Kiran reddy"));
		finalSet.add("Kiran");
		finalSet.add("Reddy");
		
		System.out.println("final queue  :" + finalSet);
		finalSet.remove("Kiran");
		//finalList.remove(5);
		System.out.println("final queue size :" + finalSet.size());
		System.out.println("final queue  :" + finalSet);
		
		finalSet.remove("Nani");
		//finalList.remove(5);
		System.out.println("final queue size :" + finalSet.size());
		System.out.println("final queue  :" + finalSet);
		
		System.out.println("names queue size :" + namesHashSet.size());
		System.out.println("added queue size :" + newlyAddedNamesSet.size());
		System.out.println("remove queue size :" + newlyRemovedNamesSet.size());
	
	}

}
