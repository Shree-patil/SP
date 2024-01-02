/**
 * 
 */
package basics.java.oops.encap_abstract;

/**
 * 
 */
public class EncapusulationExample {

	private String finacierName;
	private double principal;
	private int tenure;
	private String pancard;
	/**
	 * @return the finacierName
	 */
	public String getFinacierName() {
		return finacierName;
	}
	/**
	 * @param finacierName the finacierName to set
	 */
	public void setFinacierName(String finacierName) {
		this.finacierName = finacierName;
	}
	/**
	 * @return the principal
	 */
	public double getPrincipal() {
		return principal;
	}
	/**
	 * @param principal the principal to set
	 */
	public void setPrincipal(double principal) {
		this.principal = principal;
	}
	/**
	 * @return the tenure
	 */
	public int getTenure() {
		return tenure;
	}
	/**
	 * @param tenure the tenure to set
	 */
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	/**
	 * @return the pancard
	 */
	public String getPancard() {
		return pancard;
	}
	/**
	 * @param pancard the pancard to set
	 */
	public void setPancard(String pancard) {
		this.pancard = pancard;
	}


}

/*
 * 1. declare variables access modifier is private 
 * 2. generate getters and setters
 */
