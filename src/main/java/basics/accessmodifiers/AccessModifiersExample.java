/**
 * 
 */
package basics.accessmodifiers;

import basics.datatypes.DataTypeExample;

/**
 * 
 */
public class AccessModifiersExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifiersExample accessModifiersExample = new AccessModifiersExample();
		accessModifiersExample.basicInfo();
		accessModifiersExample.qualificationDetails();
		accessModifiersExample.accountDetails();
		

	}

	
	public void basicInfo() {
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
	public void qualificationDetails() {
		String qualificatin = "Qualification Details";
		String eligibleQualification = " UG / PG ";
		int numberOfStudyYears = 16;
		System.out.println("                     "+qualificatin+"              ");
		System.out.println("---------------------------------------------------------");
		System.out.println("eligiable years of Study : " + numberOfStudyYears);
		System.out.println("eligiable Qualification : " + eligibleQualification);
	}
	private void accountDetails() {
		String accountInfo = "Account Details";
		double balance = 111223.00;
		long accountNumber = 16346346436346l;
		System.out.println("                     "+accountInfo+"              ");
		System.out.println("---------------------------------------------------------");
		System.out.println("AccountNumber : " + accountNumber);
		System.out.println("Balance : " + balance);
	}
	private long eligibiltyCheck(int age, String name, String eligibility) {
		long returnMessage = 5789346l;
		return returnMessage;
	}

}

/*
 * 1. access modifiers are divede into 4 parts 
 * 1.1. public -- we are using in mostly in class , method 
 * 		--> we can use any whare in the project 
 * 1.2. protected // less usage 
 * 		--> we can use with in the project outside package with permission 
 * 1.3. default -- mostly used in variables (method rarely) 
 * 		--> we can use with in the project with in the package 
 * 1.4. private -- mostly in method, varables
 * 		--> we can use where we declare
 */