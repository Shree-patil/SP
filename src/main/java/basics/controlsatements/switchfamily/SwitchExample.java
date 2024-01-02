/**
 * 
 */
package basics.controlsatements.switchfamily;

/**
 * 
 */
public class SwitchExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int caseValue = 10;
		switch (caseValue) {
		case 1: {
			System.out.println("i am in case 1");
			break;
		}
		case 2: {
			System.out.println("i am in case 2");
			break;
		}
		case 3: {
			System.out.println("i am in case 3");
			break;
		}
		default: {
			System.out.println("i am in default");
		}

		}
		System.out.println("if else using");
		if(caseValue == 1) {
			System.out.println("i am in case 1");
		}
		else if(caseValue == 2) {
			System.out.println("i am in case 2");
		}
		else if(caseValue == 3) {
			System.out.println("i am in case 3");
		}
		else {
			System.out.println("i am in default");
		}
	}
}
