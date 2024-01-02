/**
 * 
 */
package basics.controlsatements.uncoditional;

/**
 * 
 */
public class ContinueExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int numberOfTimes = 10; numberOfTimes > 0; numberOfTimes = numberOfTimes - 1) {
			System.out.println("currently running time :" + numberOfTimes);
			if(numberOfTimes > 5) {
				continue;
			}
			System.out.println("loop executed time :" + numberOfTimes);
		}
	}
}

/*
 * 1. once continue is executed repeat the loop from current place(below
 * statement never executed) 
 * 2. continue can use only looping statements
 */
