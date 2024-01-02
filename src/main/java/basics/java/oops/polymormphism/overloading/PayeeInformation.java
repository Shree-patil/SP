/**
 * 
 */
package basics.java.oops.polymormphism.overloading;

/**
 * 
 */
public class PayeeInformation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PayeeInformation payeeInformation = new PayeeInformation();
		payeeInformation.addpayee(12345678901l);
		payeeInformation.addpayee(12345678901l,"HDFC00012","kiran reddy");
		payeeInformation.addpayee(12345678901l,"BARC00012","kiran reddy",true);

	}
	private String addpayee(long accountNumber) {
		String bankName = "ICICI";
		String accountholderName = "Kiran reddy";
		String accountNum = String.valueOf(accountNumber);
		String ifscCode = bankName.substring(0,4) + "000" + accountNum.substring(0, 2);
		System.out.println("ifscCode :: "+ifscCode);
		System.out.println("accountNumber :: "+ accountNumber);
		System.out.println("accountholderName :: " +accountholderName);
		
		return "done";
		
	}
	public void addpayee(long accountNumber, String ifscCode, String accountholderName) {
		System.out.println("ifscCode :: "+ifscCode);
		System.out.println("accountNumber :: "+ accountNumber);
		System.out.println("accountholderName :: "+ accountholderName);
		
	}
	protected void addpayee(long accountNumber, String ifscCode, String accountHolderName, boolean nriAccount) {
		System.out.println("ifscCode :: "+ifscCode);
		System.out.println("accountNumber :: "+ accountNumber);
		System.out.println("accountholderName :: "+ accountHolderName);
		System.out.println("nriAccount :: "+ nriAccount);
	}
	

}
