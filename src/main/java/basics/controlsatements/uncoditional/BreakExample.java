/**
 * 
 */
package basics.controlsatements.uncoditional;

/**
 * 
 */
public class BreakExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int numberOfTimes = 10; numberOfTimes > 0; numberOfTimes = numberOfTimes - 1) {
			System.out.println("currently running time :" + numberOfTimes);
			if(numberOfTimes < 5) {
				  break; 
			 }
			System.out.println("loop executed time :" + numberOfTimes);
		}
	}
}
/*
 * 1. once break is executed break the loop from current place(below
 * statement never executed) 
 * 2. break can use only looping statements, switch case
 */
