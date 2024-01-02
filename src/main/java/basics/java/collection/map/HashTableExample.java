/**
 * 
 */
package basics.java.collection.map;

import java.util.Hashtable;
import java.util.Map;

/**
 * 
 */
public class HashTableExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Long, String> contactDetailsTable = new Hashtable<>();
		contactDetailsTable.put(9997778468l,"kiran reddy airtel nellore andhra pradesh 524003");
		contactDetailsTable.put(9999999998l,"reddy jio bangalore  karnataka  560076");
		contactDetailsTable.put(8787857828l,"aswin  jio bangalore  karnataka  560024");
		contactDetailsTable.put(9874557828l,"nagappa  vodafone bangalore  karnataka  560024");
		contactDetailsTable.put(9667857828l,"srikanth tatadocomo bangalore  karnataka  560024");
		contactDetailsTable.put(8887857828l,"soundarya  bsnl bangalore  karnataka  560024");
		contactDetailsTable.put(9999999999l,"reddy jio bangalore  karnataka  560076");
		System.out.println("key check : " + contactDetailsTable.containsKey(9997778468l));
		System.out.println("value check : " + contactDetailsTable.containsValue("kiran reddy"));
		System.out.println("value check : " + contactDetailsTable.containsValue("reddy jio bangalore  karnataka  560076"));
		System.out.println("map size : " +contactDetailsTable.size());
		
		System.out.println("value : " + contactDetailsTable.get(9997778468l));
		
		System.out.println("keys : " +contactDetailsTable.keySet());
		System.out.println("key, values : " +contactDetailsTable.entrySet());
		
		
		
		for(Map.Entry<Long, String> data : contactDetailsTable.entrySet()) {
			System.out.println("-----------");
			System.out.println("key : " + data.getKey());
			System.out.println("value : " + data.getValue());
			System.out.println("data :"+data);
			
		}
		

	}

}
