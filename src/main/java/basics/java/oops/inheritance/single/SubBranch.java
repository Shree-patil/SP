/**
 * 
 */
package basics.java.oops.inheritance.single;

/**
 * 
 */
public class SubBranch extends MainBranch {
	public double amount;
	public String request;
	public double accountBalace ;
	
	public double accoutBalane(long accountNumber) {
		double accountBalace = 100000.00;
		return accountBalace;
	}
	
	public void DepostAmout(double amount, long accountNumber) {
		accountBalace = accountBalace + amount;
		System.out.println("accountBalace is deposit: "+accountBalace);
	}
	
	public void WithdrawAmout(double amount,long accountNumber) {
		accountBalace = accountBalace - amount;
		System.out.println("accountBalace is  withdraw : "+accountBalace);
	}
	

}
