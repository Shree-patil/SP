/**
 * 
 */
package basics.java.collection.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class ArrayListExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList arrayList = new ArrayList();
		//List arrayList = new ArrayList();
		
		arrayList.add("aswin");
		arrayList.add("nagappa");
		arrayList.add("soundarya");
		arrayList.add("srikanth");
		arrayList.add("kiran");
		arrayList.add("reddy");
		arrayList.add("chakri");
		arrayList.add("aswin");
		arrayList.add("srikanth");
		arrayList.add("kiran");
		arrayList.add("reddy");
		arrayList.add("chakri");
		System.out.println("arrayList size : "+arrayList.size());
		
		ArrayList names = new ArrayList();
		names.add("reddy");
		names.add("chakri");
		names.add("aswin");
		names.add("srikanth");
		System.out.println("names size : "+names.size());
		
		/*
		 * Object [] namesarray = names.toArray(); for (int i =0; i <
		 * namesarray.length;i++) { arrayList.add(namesarray[i]); }
		 * 
		 * System.out.println("arrayList size  post added names list: by using for "
		 * +arrayList.size());
		 */
		arrayList.addAll(names);
		Object [] namesarray = names.toArray(); 
		boolean flag = names.contains("reddy");
		System.out.println("reddy is avaialable inn names list : " + flag);
		System.out.println("names size  after romove : "+names.size());
		boolean flagList = arrayList.containsAll(names);
		System.out.println("names is avaialable inn array list : " + flagList);
		System.out.println("arrayList size  post added names list: "+arrayList.size());
		ArrayList subList = (ArrayList) arrayList.subList(6, 10);
		arrayList.remove("aswin");
		System.out.println("arrayList size  post deleted names list: "+arrayList.size());
		arrayList.removeAll(names);
		System.out.println("arrayList size  post deleted names list: "+arrayList.size());
		names.clear();
		
		
	}

}




/*
 * mostly methods are used
 * 
 * 1. add 
 * 2. addall
 * 3. size 
 * 4. contains
 */
