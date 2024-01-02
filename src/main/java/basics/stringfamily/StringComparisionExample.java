/**
 * 
 */
package basics.stringfamily;

/**
 * 
 */
public class StringComparisionExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringComparisionExample comparisionExample = new StringComparisionExample();
		
		String adharName = "Kiran Reddy";
		String panName = new String("kiran reddy");
		
		String equalSymbol = comparisionExample.equalSymbolComparision(adharName, panName);
		String equalMethod = comparisionExample.equalMethodComparision(adharName, panName);
		String equalMethodsaseIgnore = comparisionExample.equalMethodsaseIgnoreComparision(adharName, panName);

		System.out.println("equalSymbol : " + equalSymbol);
		System.out.println("equalMethod : " + equalMethod);
		System.out.println("equalMethodsaseIgnore : " + equalMethodsaseIgnore);
	}
	private String equalSymbolComparision(String adharName, String panName) {
		String returnMesssage = "";
		if (adharName == panName) {
			returnMesssage = "both names are same";
		}
		else {
			returnMesssage = "both names are not same";
		}
		return returnMesssage;
	}
	private String equalMethodComparision(String adharName, String panName) {
		String returnMesssage = "";
		if (adharName.equals(panName)) {
			returnMesssage = "both names are same";
		}
		else {
			returnMesssage = "both names are not same";
		}
		return returnMesssage;
	}
	private String equalMethodsaseIgnoreComparision(String adharName, String panName) {
		String returnMesssage = "";
		if (adharName.equalsIgnoreCase(panName)) {
			returnMesssage = "both names are same";
		}
		else {
			returnMesssage = "both names are not same";
		}
		return returnMesssage;
	}

}
