/**
 * 
 */
package basics.java.collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 */
public class HashMapExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Long, String> contactDetailsMap = new HashMap<>();
		contactDetailsMap.put(9997778468l,"kiran reddy airtel nellore andhra pradesh 524003");
		contactDetailsMap.put(9999999998l,"reddy jio bangalore  karnataka  560076");
		contactDetailsMap.put(8787857828l,"aswin  jio bangalore  karnataka  560024");
		contactDetailsMap.put(9874557828l,"nagappa  vodafone bangalore  karnataka  560024");
		contactDetailsMap.put(9667857828l,"srikanth tatadocomo bangalore  karnataka  560024");
		contactDetailsMap.put(8887857828l,"soundarya  bsnl bangalore  karnataka  560024");
		contactDetailsMap.put(9999999999l,"reddy jio bangalore  karnataka  560076");
		System.out.println("key check : " + contactDetailsMap.containsKey(9997778468l));
		System.out.println("value check : " + contactDetailsMap.containsValue("kiran reddy"));
		System.out.println("value check : " + contactDetailsMap.containsValue("reddy jio bangalore  karnataka  560076"));
		System.out.println("map size : " +contactDetailsMap.size());
		
		System.out.println("value : " + contactDetailsMap.get(9997778468l));
		
		System.out.println("keys : " +contactDetailsMap.keySet());
		System.out.println("key, values : " +contactDetailsMap.entrySet());
		
		
		
		for(Map.Entry<Long, String> data : contactDetailsMap.entrySet()) {
			System.out.println("-----------");
			System.out.println("key : " + data.getKey());
			System.out.println("value : " + data.getValue());
			System.out.println("data :"+data);
			
		}
		

	}

}
