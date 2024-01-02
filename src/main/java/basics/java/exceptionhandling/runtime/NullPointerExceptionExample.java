/**
 * 
 */
package basics.java.exceptionhandling.runtime;

/**
 * 
 */
public class NullPointerExceptionExample {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = null;
		System.out.println("started");
		
		try {
			if(name.equalsIgnoreCase("kiran reddy")) {
				System.out.println("value is kiran reddy");
			}
			else {
				System.out.println("value is  not in kiran reddy");
			}
		}catch (NullPointerException nullPointerException) {
			System.out.println(nullPointerException.getMessage());
			nullPointerException.printStackTrace();
		}
		System.out.println("ended");

	}
	

}
