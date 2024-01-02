/**
 * 
 */
package basics.java.oops.inheritance.multilevel;

/**
 * 
 */
public class MainBranch {
	public long accountNumber;
	public String branchName;
	public String delivaryPlace;
	public String cardStatus;
	public String panCard;
	
	public void issueCheckBook(long accountNumber,String delivaryPlace) {
		String accountNum = accountNumber + "";
		if( accountNum.length()== 12) {
			System.out.println("eligiable for issue check book");
			System.out.println("Check book will delivar to : " + delivaryPlace);
		}
		
	}
	public void issueCards(long accountNumber,String delivaryPlace,String cardStatus) {
		
		String accountNum = String.valueOf(accountNumber);
		if(accountNum.length() == 12) {
			if(cardStatus.equalsIgnoreCase("Expired") || cardStatus.equalsIgnoreCase("Loss")) {
				System.out.println("eligiable for issue card");
				System.out.println("card will delivar to : " + delivaryPlace);
			}
			
		}
	}
	public void loanApproval(String panCard) {
		if( panCard.length() == 10) {
			if(panCard.charAt(3)== 'P') {
			
				System.out.println("valid pancard");
				System.out.println("please submit loan application");
			}
			else {
				System.out.println("invalid pancard");
			}
			
		}
		
	}

}
