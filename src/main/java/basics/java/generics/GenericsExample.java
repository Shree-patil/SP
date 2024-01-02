/**
 * 
 */
package basics.java.generics;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * 
 */
public class GenericsExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> namesList = new ArrayList<>();
		namesList.add("kiran");
		namesList.add("reddy");
		ArrayList<Integer> rollNumberList = new ArrayList<>();
		rollNumberList.add(123);
		rollNumberList.add(764);
		ArrayList<Long> contactNumberList = new ArrayList<>();
		contactNumberList.add(9997778468l);
		TreeSet<String> treeSet = new TreeSet();
		treeSet.add("kiran reddy");
		treeSet.add("reddy");
		treeSet.add("123");
		treeSet.add("764");
		treeSet.add("9997778468l");
		TreeSet namesSet = new TreeSet(namesList);
		treeSet.addAll(namesSet);
		System.out.println("tree set : "+treeSet );
	}

}

//genirics is checking the  type of the element when it will adding to collection (compile time)
