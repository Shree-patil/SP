/**
 * 
 */
package basics.java.exceptionhandling.userdefined;

/**
 * 
 */
public class UserDefinedExceptionExample {
	

	/**
	 * @param args
	 * @throws UserDefinedException
	 */
	public static void main(String[] args) throws UserDefinedException, NullPointerException,IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		UserDefinedExceptionExample userDefinedExceptionExample = new UserDefinedExceptionExample();
		String value = "kiran reddy";
		userDefinedExceptionExample.dataHandling(value);
		userDefinedExceptionExample.dataChecking(null);
	}

	public void dataHandling(String value) throws IndexOutOfBoundsException,UserDefinedException {
		try {
			System.out.println("we are in try block");
			System.out.println(value.charAt(100));

		} catch (IndexOutOfBoundsException indexOutOfBoundsException) {
			System.out.println("we are in catch block");
			// predefined
			System.out.println(indexOutOfBoundsException.getMessage());
			indexOutOfBoundsException.printStackTrace();

			// user defined
			throw new UserDefinedException("index out of bound, length of the value is :" + value.length()
					+ " your checking value more than :" + value.length());

		}
	}

	public void dataChecking(String value) throws IndexOutOfBoundsException,NullPointerException {
		try {
			System.out.println("we are in try block");
			System.out.println(value.charAt(100));

		} catch (IndexOutOfBoundsException indexOutOfBoundsException) {
			System.out.println("we are in catch block");
			System.out.println(indexOutOfBoundsException.getMessage());
			indexOutOfBoundsException.printStackTrace();
		}

		catch (NullPointerException nullPointerException) {
			System.out.println("we are in catch block");
			System.out.println(nullPointerException.getMessage());
			nullPointerException.printStackTrace();
		}

	}
}

/*
 * 1. throws is -- classes 2. throw is -- new userdefinedException class and
 * send arguments 3. throw --- throws also come 4. only throws posiiable
 */
