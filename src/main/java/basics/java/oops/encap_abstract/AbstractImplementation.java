/**
 * 
 */
package basics.java.oops.encap_abstract;

/**
 * 
 */
public class AbstractImplementation extends AbstractExample {
	public String finacierDetails() {
		String finaceDetails = "";
		System.out.println("we are in finacierDetails :");
		return finaceDetails;
	}
	public double emiAmount(float principal,int tenure,String pancard) {
		double emi = 0.0;
		System.out.println("we are in emiAmount :");
		return emi;
	}
	public String modeOfPayment() {
		String paymentType = "";
		System.out.println("we are in modeOfPayment :");
		return paymentType;
	}
}
