/**
 * 
 */
package basics.controlsatements.forfamily;

/**
 * 
 */
public class NestedForLoopExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("normal");
		System.out.println("2 * 1 = 2");
		System.out.println("2 * 2 = 4");
		System.out.println("2 * 3 = 6");
		System.out.println("2 * 4 = 8");
		System.out.println("2 * 5 = 10");
		System.out.println("2 * 6 = 12");
		System.out.println("2 * 7 = 14");
		System.out.println("2 * 8 = 16");
		System.out.println("2 * 9 = 18");
		System.out.println("2 * 10 = 20");
		System.out.println( "with for loop");
		for(int start = 1; start <= 10; start++ ) {
			System.out.println("2 * " + start +" = " + 2 * start);
		}
		System.out.println("nested loop");
		for(int table = 1; table <= 10; table++ ) {
			System.out.println("table is :" + table);
			for(int start = 1; start <= 10; start++ ) {
				System.out.println(table + " * " + start +" = " + table * start);
			}
		}
		
		for(int number =0; number<100;number ++) {
			if(number%2 == 0) {
				System.out.println( "even number" + number);
			}
			else {
				System.out.println("odd number" + number);
			}
			
		}
		for(int number =0; number<10;number ++) {
			System.out.println("cube number : "+ number +" is : "+ number * number  * number);
		}
	}
}
