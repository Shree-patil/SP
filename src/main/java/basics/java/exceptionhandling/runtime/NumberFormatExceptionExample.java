/**
 * 
 */
package basics.java.exceptionhandling.runtime;

import java.util.ArrayList;

/**
 * 
 */
public class NumberFormatExceptionExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "10.111";
		System.out.println("start");
		try {
			float number = Float.parseFloat(name);
			System.out.println("number : "+number);
			int num = (int) number;
			System.out.println("num :" +num);
		}catch (NumberFormatException numberFormatException) {
			// TODO: handle exception
			numberFormatException.printStackTrace();
		}
		System.out.println("end");
	}

}
