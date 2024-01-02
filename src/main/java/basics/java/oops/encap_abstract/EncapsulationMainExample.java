/**
 * 
 */
package basics.java.oops.encap_abstract;

/**
 * 
 */
public class EncapsulationMainExample {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		EncapsulationMainExample encapsulationMainExample = new EncapsulationMainExample();
		
		EncapusulationExample encapusulationExample = encapsulationMainExample.setDisplaydetails();
		EncapusulationExample encapusulationData = encapsulationMainExample.setDisplaydata();
		encapsulationMainExample.diplayDetails(encapusulationExample);
		encapsulationMainExample.diplayDetails(encapusulationData);
		
	}
	
	private EncapusulationExample setDisplaydata() {
		EncapusulationExample encapusulationExample = new EncapusulationExample();
		encapusulationExample.setFinacierName("AXIS");
		encapusulationExample.setPrincipal(500000.00);
		encapusulationExample.setTenure(40);
		encapusulationExample.setPancard("ADDPM8804E");
		
		return encapusulationExample;
	}
	private EncapusulationExample setDisplaydetails() {
		EncapusulationExample encapusulationExample = new EncapusulationExample();
		encapusulationExample.setFinacierName("ICICI");
		encapusulationExample.setPrincipal(1000000.00);
		encapusulationExample.setTenure(60);
		encapusulationExample.setPancard("BMSPR2333E");
		
		return encapusulationExample;
	}
	private void diplayDetails(EncapusulationExample encapusulationExample) {
		System.out.println(encapusulationExample.getFinacierName());
		System.out.println(encapusulationExample.getPrincipal());
		System.out.println(encapusulationExample.getTenure());
		System.out.println(encapusulationExample.getPancard());
	}

}
