/**
 * 
 */
package basics.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 
 */
public class StreamExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrayList = new ArrayList();
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
		long total = arrayList.stream().count();
		System.out.println("total elements : "+ total);
		System.out.println(arrayList.stream().findAny());
		System.out.println(arrayList.stream().findFirst());
		
		Set<String> sNameSet = arrayList.stream().filter(name -> name.startsWith("s")).map(name-> name.concat(" * ")).collect(Collectors.toSet());
		System.out.println("---------filter-----set-------------");
		sNameSet.stream().forEach(name -> System.out.println(name));
		List<String> names = arrayList.stream().map(name -> name.concat(" reddy")).collect(Collectors.toList());
		Set<String> nameSet = arrayList.stream().map(name -> name.concat(" reddy")).collect(Collectors.toSet());
		System.out.println("--------------set-------------");
		nameSet.stream().forEach(name -> System.out.println(name));
		System.out.println("-------------list--------------");
		names.stream().forEach(name -> System.out.println(name));
		List<String> sNamesList = new ArrayList<>();
		for(String name : arrayList) {
			String nameVal= name.concat( " reddy");
			//sNamesList.add(nameVal);
		}
		System.out.println("---------------------------");
		sNamesList.stream().forEach(name -> System.out.println(name));

	}

}
