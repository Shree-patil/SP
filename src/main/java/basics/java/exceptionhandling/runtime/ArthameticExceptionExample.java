/**
 * 
 */
package basics.java.exceptionhandling.runtime;

/**
 * 
 */
public class ArthameticExceptionExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int firstElement = 100;
		int secondElement = 0;
		System.out.println("calculation started");
		try {
			System.out.println(firstElement / secondElement);
		} catch (ArithmeticException arithmeticException) {
			System.out.println(arithmeticException.getMessage());
			arithmeticException.printStackTrace();
		}
		finally {
			System.out.println("we are in finally block");
		}

		System.out.println("calculation ended");
	}
	public void disply() {
		System.out.println("display");
	}
}

/*
 * try { logic here } catch(Exception exception) { error message } finally {
 * final stmts }
 */

/* finally we are using closing files, closing DB connection */