/**
 * 
 */
package basics.java.exceptionhandling.runtime;

/**
 * 
 */
public class TryWithMultipleCatchExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String name = "00001";
			String num = "0000";
			
			System.out.println(name.charAt(3));
			System.out.println(name.equalsIgnoreCase("kiran"));
			int number = Integer.parseInt(name);
			int numVal = Integer.parseInt(num);
			System.out.println("number :" + number);
			System.out.println(number/numVal);
			
		}catch (ArithmeticException arithmeticException) {
			arithmeticException.printStackTrace();
		}catch (NullPointerException nullPointerException) {
			nullPointerException.printStackTrace();
		}catch (IndexOutOfBoundsException indexOutOfBoundsException) {
			indexOutOfBoundsException.printStackTrace();
		}catch (NumberFormatException numberFormatException) {
			numberFormatException.printStackTrace();
		}catch (RuntimeException runtimeException) {
			runtimeException.printStackTrace();
		}catch(Exception exception) {
			exception.printStackTrace();
		}catch (Throwable throwable) {
			throwable.printStackTrace();
		}
	}

}
