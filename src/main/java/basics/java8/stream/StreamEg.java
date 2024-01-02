/**
 * 
 */
package basics.java8.stream;

import java.util.ArrayList;

/**
 * 
 */
public class StreamEg {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numbers = new ArrayList<>();

		numbers.add(78);
		numbers.add(87);
		numbers.add(67);
		numbers.add(45);
		numbers.add(98);
		numbers.add(39);

		int total = 0;
		for (Integer num : numbers) {
			total = total + num;
		}
		int size = numbers.size();
		double avg;
		if (size > 0) {
			avg = total / size;
		} else {
			avg = 0.0;
		}
		System.out.println("avg : " + avg);
		int max =0;
		for (Integer num : numbers) {
			if(max > num) {
				max = max;
			}else {
				max = num;
			}
		}
		System.out.println("max : " + max);
        long count = numbers.stream().filter(n -> n.intValue() > 75).count();
		double avgStream = numbers.stream().mapToDouble(Integer::doubleValue).average().orElse(0.0);
		double maxStream = numbers.stream().mapToDouble(Integer::doubleValue).max().orElse(0.0);
		double minStream = numbers.stream().mapToDouble(Integer::doubleValue).min().orElse(0.0);
		System.out.println("avgStream : " + avgStream);
		System.out.println("maxStream : " + maxStream);
		System.out.println("minStream : " + minStream);
		System.out.println("count : " + count);

	}

}
