/**
 * 
 */
package basics.java.collection.vector;

import java.util.LinkedList;
import java.util.Vector;

/**
 * 
 */
public class VectorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Vector namesVector = new Vector();
		namesVector.add("Nagappa");
		namesVector.add("Srikanth");
		namesVector.add("aswin");
		namesVector.add("soundarys");
		namesVector.add("kiran reddy");
		namesVector.add("Chakri");
		
		Vector newlyAddedNamesVector = new Vector();
		newlyAddedNamesVector.add("Nani");
		newlyAddedNamesVector.add("Chiru");
		newlyAddedNamesVector.add("Mohan");
		newlyAddedNamesVector.add("Kavitha");
		newlyAddedNamesVector.add("Kiran");
		
		Vector newlyRemovedNamesVector = new Vector();
		newlyRemovedNamesVector.add("Chakri");
		newlyRemovedNamesVector.add("Kiran");
		
		Vector finalVector = new Vector();
		System.out.println("final vector size :" + finalVector.size());
		finalVector.addAll(namesVector);
		System.out.println("final vector size :" + finalVector.size());
		finalVector.addAll(newlyAddedNamesVector);
		System.out.println("final vector size :" + finalVector.size());
		finalVector.removeAll(newlyRemovedNamesVector);
		System.out.println("final vector size :" + finalVector.size());
		
		System.out.println("kiran contains in final vector : " + finalVector.contains("kiran reddy"));
		finalVector.add("kiran");
		finalVector.add("reddy");
		finalVector.add(5, "venkat");
		System.out.println("final vector  :" + finalVector);
		finalVector.remove(5);
		System.out.println("final vector size :" + finalVector.size());
		System.out.println("final vector  :" + finalVector);
		
		System.out.println("names vector size :" + namesVector.size());
		System.out.println("added vector size :" + newlyAddedNamesVector.size());
		System.out.println("remove vector size :" + newlyRemovedNamesVector.size());
	

	}

}
