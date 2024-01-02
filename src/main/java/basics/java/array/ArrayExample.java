/**
 * 
 */
package basics.java.array;

/**
 * 
 */
public class ArrayExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] names = {"aswin","nagappa","soundarya","srikanth","kiran","reddy","chakri"};
		int  rollnumbers [] = new int[10];
		rollnumbers[0] = 12014;
		rollnumbers[1] = 14524;
		rollnumbers[2] = 14548;
		rollnumbers[3] = 15781;
		rollnumbers[4] = 74854;
		rollnumbers[5] = 24857;
		rollnumbers[6] = 78575;
	
		for(int i=0; i < names.length; i++) {
				System.out.println("names ["+i+"] : "+names[i]);
		}

		for(int i=0; i < rollnumbers.length; i++) {
				System.out.println("rollnumbers ["+i+"] : "+rollnumbers[i]);
		}
		
		for(int i=0; i < names.length; i++) {
			System.out.println(rollnumbers[i] +" : " + names[i]);
		}
		for(int i=0; i < rollnumbers.length; i++) {
			System.out.println("loop iteration : " +i);
			System.out.println(rollnumbers[i] +" : " + names[i]);
		}

	}

}
