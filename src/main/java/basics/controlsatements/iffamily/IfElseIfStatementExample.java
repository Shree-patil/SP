/**
 * 
 */
package basics.controlsatements.iffamily;

/**
 * 
 */
public class IfElseIfStatementExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int marks = 65;
		// TODO Auto-generated method stub
		if(marks >= 60) {
			System.out.println("first class");
		}
		
		else if (marks >= 50) {
			System.out.println("second class");
		}
		else if(marks >= 35) {
			System.out.println("pass the exam");
		}
		else {
			System.out.println("fail the exam");
		}
		
		/* 1.  multiple scenario is available ( alternative is applicable) based on condition but only one scenario 
		 *
		 * 2. if(condition) {
		 * 
		 *  }
		 *  else if(condition){
		 *  {
		 *  
		 *  }
		 *  else{
		 *  
		 *  }
		 * 3. condition is always return true or false
		 * 4. else if we can write any number of times in between if , else
		 * 5. if we not written else if in between if , else --- if else statement
		 */
	}

}
