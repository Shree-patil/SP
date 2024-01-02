/**
 * 
 */
package basics.wrapperclasses;

/**
 * 
 */
public class WrapperClassExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 10;
		float percentageData = 67.93f;
		
		Integer ageWrapper = 10;
		Float percentage = 67.93f;
		Long longvalue = 14905903l;
		Double doubleValue = 348957.4753489;
		Character sex = 'M';
		Boolean flag = true;
		
		String name = "kiran reddy";
		
		Integer ageWrapperNew = new Integer(10);
		Float percentageNew =  new Float(67.93f);
		Long longvalueNew = new Long(14905903l);
		Double doubleValueNew = new Double(348957.4753489);
		Character sexNew = new Character('M');
		Boolean flagNew = new Boolean(true);
		
		String nameNew = new String("kiran reddy");
		
		System.out.println(ageWrapper.floatValue());
		System.out.println("display : " + percentage.intValue());
		
		Float percentageWrapper = new Float(percentageData);
		System.out.println("conversion and display : " + percentageWrapper.intValue());

	}

}

//striked out meaning is it is existed in older released, plean to delete ( don't use it)