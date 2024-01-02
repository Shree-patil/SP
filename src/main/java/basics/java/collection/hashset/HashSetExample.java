/**
 * 
 */
package basics.java.collection.hashset;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 */
public class HashSetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		HashSet namesHashSet = new HashSet();
		namesHashSet.add("Nagappa");
		namesHashSet.add("Srikanth");
		namesHashSet.add("Aswin");
		namesHashSet.add("Soundarya");
		namesHashSet.add("Kiran reddy");
		namesHashSet.add("Kiran");
		namesHashSet.add("Chakri");
		namesHashSet.add("Nagappa");
		
		HashSet newlyAddedNamesSet = new HashSet();
		newlyAddedNamesSet.add("Nani");
		newlyAddedNamesSet.add("Chiru");
		newlyAddedNamesSet.add("Mohan");
		newlyAddedNamesSet.add("Kavitha");
		newlyAddedNamesSet.add("Kiran");
		newlyAddedNamesSet.add("Nagappa");
		
		HashSet newlyRemovedNamesSet = new HashSet();
		newlyRemovedNamesSet.add("Chakri");
		newlyRemovedNamesSet.add("Kiran");
		
		HashSet finalSet = new HashSet();
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
	
		for(Object data : finalSet) {
			System.out.println("content : "+data);
		}
	
	
	}

}
