/**
 * 
 */
package basics.controlsatements.whilefamily;

/**
 * 
 */
public class DoWhileExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numberOfTimes = 10;
		do {
			System.out.println("currently running time :" + numberOfTimes);
			numberOfTimes = numberOfTimes - 1;
		} while (numberOfTimes < 10);
	}
}

/*
 * 1. loop will execute minimum 1 time even though condition fails 
 * 2. it execute first then check the condition
 */