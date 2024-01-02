/**
 * 
 */
package basics.java8.optionalclass;

import java.util.Optional;

/**
 * 
 */
public class OptionalClassExmple {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "kiran reddy";
		Optional<String> addressOptional = Optional.of("kiran reddy address");
		String address = null;
		System.out.println("start");
		try {
			if (null != address) {
				System.out.println(address.toUpperCase());
			} else {
				System.out.println("address doesnot contain any data");
			}
		} catch (NullPointerException nullPointerException) {
			nullPointerException.printStackTrace();
		}

		System.out.println(name.toUpperCase());

		if (addressOptional.isPresent()) {
			System.out.println(addressOptional.get().toUpperCase());
		} else {
			System.out.println("address doesnot contain any data");
		}
		OptionalClassExmple optionalClassExmple = new OptionalClassExmple();
		AddressDetails addressInfo = optionalClassExmple.setAddressDetails();
		optionalClassExmple.displyAddress(addressInfo);
		

		System.out.println("end");

	}

	private void displyAddress(AddressDetails addressInfo) {
		if(addressInfo.getDoorNumber().isPresent()) {
			
			System.out.println("door number ===== : " +addressInfo.getDoorNumber());
			System.out.println("door number ----- : " +addressInfo.getDoorNumber().get());
			System.out.println("door number : " +addressInfo.getDoorNumber().get().toUpperCase());
		}
		if(addressInfo.getStreetName().isPresent()) {
			System.out.println("street name : " +addressInfo.getStreetName().get().toUpperCase());
		}
		System.out.println("post : "+addressInfo.getPost().toUpperCase());
		System.out.println("state : "+addressInfo.getState().toUpperCase());
		
	}
	
	
	private AddressDetails setAddressDetails() {
		AddressDetails addressDetails = new AddressDetails();
		addressDetails.setDoorNumber(Optional.of("1-99/504 5th floor"));
		addressDetails.setStreetName(Optional.of("6th cross"));
		addressDetails.setPost("bengalore");
		addressDetails.setState("karnataka");
		return addressDetails;
	}

}
