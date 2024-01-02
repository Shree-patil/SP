/**
 * 
 */
package basics.stringfamily;

/**
 * 
 */
public class AssignmentString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nameOfApplication = "MS application";
		String countryApply = "US";
		String firstName = "kiran ";
		String middleName = "";
		String lastName = "reddy";
		
		
		System.out.println("                     "+nameOfApplication+"              ");
		System.out.println("---------------------------------------------------------");
		System.out.println("eligiable country : " + countryApply);
		StringBuffer fullName = new StringBuffer();
		fullName.append(firstName);
		if(!middleName.isEmpty()) {
			fullName.append(middleName);
		}
		fullName.append(lastName);
		System.out.println("applicant Name    : " + fullName);
		

	}

}
