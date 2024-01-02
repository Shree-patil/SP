/**
 * 
 */
package basics.java.exceptionhandling.userdefined;

/**
 * 
 */
public class UserDefinedException extends Exception{
	
	public UserDefinedException() {
		
	}
	public UserDefinedException (String message) {
		System.out.println("user defined exception message : " +message);
	}
	

}

/*
 * 1. constructor syntex acessmodifier nameofConstructor arguments 
 * 2. name of the constuructor is class name 
 * 3. if you not write any constructor java compiler will automatically create defult constructor
 */
