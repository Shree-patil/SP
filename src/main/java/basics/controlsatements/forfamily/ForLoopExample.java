/**
 * 
 */
package basics.controlsatements.forfamily;

/**
 * 
 */
public class ForLoopExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// good practice
		int incrementValue = 10;
		for (int numberOfTimes = 50; numberOfTimes < 75; numberOfTimes++/* numberOfTimes = numberOfTimes+1 */) {
			System.out.println("currently running time :" + numberOfTimes);
		}
		// not recomanded
		/*
		 * int numberOfTimes = 10; for(; numberOfTimes > 0; ) {
		 * System.out.println("currently running time similar while :" + numberOfTimes);
		 * numberOfTimes = numberOfTimes - 1; } int check = 10; for(; check > 0; check =
		 * check - 1 ) {
		 * System.out.println("currently running time similar  increment while :" +
		 * check);
		 * 
		 * } for(int numbers = 10; numbers > 0;) {
		 * System.out.println("currently running time :" + numbers); numbers = numbers -
		 * 1; }
		 */
	}
}

/* 1. intilization, 
 * 2. condition , 
 * 3. increment or decrement 
 * 4 . in for loop 3 statements(1,2,3) is required*/
