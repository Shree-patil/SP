/**
 * 
 */
package basics.javaStanards;

/**
 * 
 */
public class JavaStandards {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaStandards javaStandards = new JavaStandards();
		int firstNumber = 10;
		int secondNumber =3;
		int addtionValue = javaStandards.addition(firstNumber, secondNumber);
		System.out.println("addtion value : " + addtionValue );
		long multificationValue = javaStandards.multification(firstNumber, secondNumber);
		System.out.println("multification value : " + multificationValue );
		float divisionValue = javaStandards.division(firstNumber, secondNumber);
		System.out.println("division value : " + divisionValue );
	}
	
	private int addition(int firstNumber, int secondNumber) {
		int additionValue = 0;
		additionValue = firstNumber + secondNumber;
		return additionValue;
	}
	private long multification(int firstNumber, int secondNumber) {
		long multificationValue = 0l;
		multificationValue = firstNumber * secondNumber;
		return multificationValue;
	}
	private float division(int firstNumber, int secondNumber) {
		float divisionValue = 0.0f;
		divisionValue = firstNumber / secondNumber;
		return divisionValue;
	}

}
