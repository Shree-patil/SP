/**
 * 
 */
package basics.java.oops.inheritance.single;

/**
 * 
 */
public class SingleInheritaceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SubBranch subBranch = new SubBranch();
		System.out.println("-----------------sub Branch-------------------");
		subBranch.accoutBalane(570020011812l);
		subBranch.DepostAmout(12244, 570020011812l);
		subBranch.WithdrawAmout(4234, 570020011812l);
		
		subBranch.issueCards(570020011812l, "office","Expired");
		subBranch.issueCheckBook(570020011812l, "office");
		subBranch.loanApproval("BMSPR2333E");
		
		
		MainBranch mainBranch = new MainBranch();
		System.out.println("-----------------main Branch-------------------");
		mainBranch.issueCards(570020011812l, "branch","Expired");
		mainBranch.issueCheckBook(570020011812l, "branch");
		mainBranch.loanApproval("AYDPM8804E");
		
		MainBranch branch = new SubBranch();
		System.out.println("-----------------sub to main Branch-------------------");
		branch.issueCards(570020011812l, "home","Loss");
		branch.issueCheckBook(570020011812l,  "home");
		branch.loanApproval("AXIEG1234E");
		
		//SubBranch subBranchData = new MainBranch();
		
		
		HomeBranch homeBranch = new HomeBranch();
		System.out.println("-----------------home Branch -------------------");
		homeBranch.issueCards(570020011812l, "HomeBranch","Expired");
		homeBranch.issueCheckBook(570020011812l, "HomeBranch");
		homeBranch.loanApproval("AYDPM8804E");
		homeBranch.address();
	}

}
