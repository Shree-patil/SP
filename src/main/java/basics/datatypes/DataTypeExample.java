/**
 * 
 */
package basics.datatypes;

/**
 * 
 */
public class DataTypeExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int saleProducts = 981211212;
		long sales = 8264824892374L;
		float salesVolume = 5894.893573545353f;
		double salescredited = 790345034.6893457349;
		String name = "kiran reddy";
		boolean pass = true ;
		
		
		char sex = 'm';
	
		byte age = 31; // mostly byte we are not using
		short marks =23;// mostly short we are not using
		System.out.println("::::Details::::");
		System.out.println("-------------------");
		System.out.println("name is : "+ name);
		System.out.println("Gender : "+sex);
		
	}
	private void displayPrivate() {
		System.out.println("we are in display private method ");
	}
	public void displayPublic() {
		System.out.println("we are in display public method");
	}
	void displayDefault() {
		System.out.println("we are in display default method");
	}

}

/*
 * intregerNumbers decimalNumbers
 * 
 * int -- small numbers (upto 8 digits) float -- small numbers (upto 8 digits)
 * 
 * long -- big numbers (more than 9 digits) double ---big numbers (more than 9
 * digits)
 * long anf float java is case sensitive is not consider we can do l or L, f or F
 * 
 * boolean data type is allowed 2 values only either true or false ( by default value is false);
 * int, long data type default value is 0(Zero)
 * float, double default value is 0.0(zero.zero)
 * String default value is null;
 * 
 * String is we can as class or data type
 * 
 */
