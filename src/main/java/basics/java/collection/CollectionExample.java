/**
 * 
 */
package basics.java.collection;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 */
public class CollectionExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<AccountHolderDetails> accountHolderList = new ArrayList<>();
		CollectionExample collectionExample = new CollectionExample();
		
		accountHolderList.add(collectionExample.setAccountHolderDetails("myself"));
		accountHolderList.add(collectionExample.setAccountHolderDetails("sibling"));
		accountHolderList.add(collectionExample.setAccountHolderDetails("parent"));
		System.out.println("+++++++++++++++++++++++++++++++++");
		collectionExample.displayListData(accountHolderList);
		System.out.println("myself account holder name contains with kiran reddy :" + accountHolderList.contains("kiran reddy"));
		System.out.println("accountHolderList size : "+accountHolderList.size());
		
		HashMap<Long,AccountHolderDetails> accountHolderMap = new HashMap<>();
		accountHolderMap.put(665171438359l, collectionExample.setAccountHolderDetails("myself"));
		accountHolderMap.put(456789451234l, collectionExample.setAccountHolderDetails("sibling"));
		accountHolderMap.put(665171438659l, collectionExample.setAccountHolderDetails("parent"));
		System.out.println("+++++++++++++++++++++++++++++++++");
		collectionExample.displayMapData(accountHolderMap);
		System.out.println("aadhara number  key checking : " +accountHolderMap.containsKey(456789451234l));
		

	}
	private void displayMapData(HashMap<Long, AccountHolderDetails> accountHolderMap) {
		for(Map.Entry<Long, AccountHolderDetails> data : accountHolderMap.entrySet()) {
			System.out.println(" key  : " + data.getKey());
			System.out.println("AadharNumber : " + data.getValue().getAadharNumber());
			System.out.println("AccountHolderName : " + data.getValue().getAccountHolderName());
			System.out.println("AccountNumber : " + data.getValue().getAccountNumber());
			System.out.println("MobileNumber : " + data.getValue().getMobileNumber());
			
			System.out.println("AppartmentName : " + data.getValue().getAddress().getAppartmentName());
			System.out.println("District : " + data.getValue().getAddress().getDistrict());
			System.out.println("DoorNumber : " + data.getValue().getAddress().getDoorNumber());
			System.out.println("Mandal : " + data.getValue().getAddress().getMandal());
			System.out.println("PinCode : " + data.getValue().getAddress().getPinCode());
			System.out.println("Post : " + data.getValue().getAddress().getPost());
			System.out.println("State : " + data.getValue().getAddress().getState());
			System.out.println("========================================");
		}
		
	}
	private void displayListData(ArrayList<AccountHolderDetails> accountHolderList) {
		for(AccountHolderDetails data : accountHolderList) {
			System.out.println("AadharNumber : " + data.getAadharNumber());
			System.out.println("AccountHolderName : " + data.getAccountHolderName());
			System.out.println("AccountNumber : " + data.getAccountNumber());
			System.out.println("MobileNumber : " + data.getMobileNumber());
			
			System.out.println("AppartmentName : " + data.getAddress().getAppartmentName());
			System.out.println("District : " + data.getAddress().getDistrict());
			System.out.println("DoorNumber : " + data.getAddress().getDoorNumber());
			System.out.println("Mandal : " + data.getAddress().getMandal());
			System.out.println("PinCode : " + data.getAddress().getPinCode());
			System.out.println("Post : " + data.getAddress().getPost());
			System.out.println("State : " + data.getAddress().getState());
			System.out.println("------------------------------------");
			
			
			
			if(data.getAadharNumber() == 9997778466l) {
				System.out.println("myself account holder name contains with kiran reddy ");
			}
			
		}
	}

	private  AccountHolderDetails setAccountHolderDetails(String type) {
		// TODO Auto-generated method stub
		AccountHolderDetails accountHolderDetails = new AccountHolderDetails();
		if(type.equalsIgnoreCase("myself")) {
			accountHolderDetails.setAadharNumber(665171438359l);
			accountHolderDetails.setAccountHolderName("kiran reddy");
			accountHolderDetails.setAccountNumber(5700200118l);
			accountHolderDetails.setMobileNumber(9997778468l);
		}
		else if(type.equalsIgnoreCase("sibling")) {
			accountHolderDetails.setAadharNumber(456789451234l);
			accountHolderDetails.setAccountHolderName("Chakri reddy");
			accountHolderDetails.setAccountNumber(5700201818l);
			accountHolderDetails.setMobileNumber(9997778457l);
		}
		else if(type.equalsIgnoreCase("parent")) {
			accountHolderDetails.setAadharNumber(665171438659l);
			accountHolderDetails.setAccountHolderName("venkateswara reddy");
			accountHolderDetails.setAccountNumber(57002001616l);
			accountHolderDetails.setMobileNumber(9997778466l);
		}
		
		accountHolderDetails.setAddress(setAddress());
		return accountHolderDetails;
	}

	private AddressDetails setAddress() {
		// TODO Auto-generated method stub
		AddressDetails addressDetails = new AddressDetails();
		addressDetails.setAppartmentName("montree");
		addressDetails.setDistrict("Karnataka");
		addressDetails.setDoorNumber(76);
		addressDetails.setMandal("Bangalore");
		addressDetails.setPinCode(560076);
		addressDetails.setPost("whitefield");
		addressDetails.setState("karnataka");
		return addressDetails;
	}

}
