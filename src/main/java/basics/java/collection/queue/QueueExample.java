/**
 * 
 */
package basics.java.collection.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * 
 */
public class QueueExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub
		ArrayDeque namesQueue = new ArrayDeque();
		namesQueue.add("Nagappa");
		namesQueue.add("Srikanth");
		namesQueue.add("Aswin");
		namesQueue.add("Soundarya");
		namesQueue.add("Kiran reddy");
		namesQueue.add("Chakri");
		namesQueue.add("Nagappa");
		
		ArrayDeque newlyAddedNamesQueeu = new ArrayDeque();
		newlyAddedNamesQueeu.add("Nani");
		newlyAddedNamesQueeu.add("Chiru");
		newlyAddedNamesQueeu.add("Mohan");
		newlyAddedNamesQueeu.add("Kavitha");
		newlyAddedNamesQueeu.add("Kiran");
		newlyAddedNamesQueeu.add("Nagappa");
		
		ArrayDeque newlyRemovedNamesQueue = new ArrayDeque ();
		newlyRemovedNamesQueue.add("Chakri");
		newlyRemovedNamesQueue.add("Kiran");
		
		ArrayDeque finalQueue = new ArrayDeque();
		System.out.println("final queue size :" + finalQueue.size());
		finalQueue.addAll(namesQueue);
		System.out.println("final queue size :" + finalQueue.size());
		finalQueue.addAll(newlyAddedNamesQueeu);
		System.out.println("final queue size :" + finalQueue.size());
		finalQueue.removeAll(newlyRemovedNamesQueue);
		System.out.println("final list size :" + finalQueue.size());
		
		System.out.println("kiran contains in final queue : " + finalQueue.contains("Kiran reddy"));
		finalQueue.add("Kiran");
		finalQueue.add("Reddy");
		System.out.println("final queue  :" + finalQueue);
		finalQueue.remove();
		//finalList.remove(5);
		System.out.println("final queue size :" + finalQueue.size());
		System.out.println("final queue  :" + finalQueue);
		
		finalQueue.remove();
		//finalList.remove(5);
		System.out.println("final queue size :" + finalQueue.size());
		System.out.println("final queue  :" + finalQueue);
		
		System.out.println("names queue size :" + namesQueue.size());
		System.out.println("added queue size :" + newlyAddedNamesQueeu.size());
		System.out.println("remove queue size :" + newlyRemovedNamesQueue.size());
	
		
	
	}

}

//PriorityQueue is sort the the of that queue, ArrayDeque is not sorting by default


