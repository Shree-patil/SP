/**
 * 
 */
package basics.java.oops.polymormphism.overloading;

/**
 * 
 */
public class OverLoadingExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadingExample overLoadingExample = new OverLoadingExample();
		overLoadingExample.addition(15,12);
		overLoadingExample.addition(15.4f,12.3f);
		overLoadingExample.addition(15,12.3f);
		overLoadingExample.addition(15.4f,12);

	}
	private void addition(int firstElement,int secondElemnt) {
		int total = firstElement + secondElemnt;
		System.out.println("addition of two numbers is : " +total);
		
	}
	private void addition(float firstElement,float secondElemnt) {
		float total = firstElement + secondElemnt;
		System.out.println("addition of two numbers is : " +total);
		
	}
	private void addition(float firstElement,int secondElemnt) {
		float total = firstElement + secondElemnt;
		System.out.println("addition of two numbers is : " +total);
		
	}
	private void addition(int firstElement,float secondElemnt) {
		float total = firstElement + secondElemnt;
		System.out.println("addition of two numbers is : " +total);
		
	}
	
	

}
