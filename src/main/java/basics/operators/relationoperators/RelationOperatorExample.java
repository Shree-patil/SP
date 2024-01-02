/**
 * 
 */
package basics.operators.relationoperators;

/**
 * 
 */
public class RelationOperatorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstElement = 10;   //assignment operator
		int secondElement =10;
		
		if(firstElement == secondElement) {
			System.out.println("both the elements are equal.");
		}else {
			System.out.println("both the elements are not equal.");
		}
		if(firstElement != secondElement) {
			System.out.println("both the elements are not equal.");
		}else {
			System.out.println("both the elements are equal.");
		}
		if(firstElement > secondElement) {
			System.out.println("first Element have maximum value.");
		}else {
			System.out.println("second Element have maximum value.");
		}
		if(firstElement < secondElement) {
			System.out.println("second Element have maximum value.");
		}else {
			System.out.println("first Element have maximum value.");
		}
		if(firstElement >= secondElement) {
			System.out.println("first Element have maximum value or same.");
		}else {
			System.out.println("second Element have maximum value.");
		}
		if(firstElement <= secondElement) {
			System.out.println("second Element have maximum value or same.");
		}else {
			System.out.println("first Element have maximum value.");
		}
		

	}

}

/*
 * 1.  == 
 * 2.  >  
 * 3.  <  
 * 4.  >=  
 * 5.  <=  
 * 6.  != 
 * 7. relation operators are using in conditional statements (if family, for family, while family).
 * 8. return type of relation operators is boolean (true/false)
 * 9. called condition operator/relation operator

 */
