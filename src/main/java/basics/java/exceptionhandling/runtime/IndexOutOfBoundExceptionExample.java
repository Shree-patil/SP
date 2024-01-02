/**
 * 
 */
package basics.java.exceptionhandling.runtime;

/**
 * 
 */
public class IndexOutOfBoundExceptionExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] names = new String [3];
		String name ="kiran reddy";
		System.out.println("start");
		try {
			System.out.println(name.charAt(16));
		}
		catch (IndexOutOfBoundsException indexOutOfBoundsException) {
			indexOutOfBoundsException.printStackTrace();
		}
		try {
			System.out.println(names[-1]);
		}
		catch (IndexOutOfBoundsException indexOutOfBoundsException) {
			indexOutOfBoundsException.printStackTrace();
		}
		System.out.println("end");
	}
}
