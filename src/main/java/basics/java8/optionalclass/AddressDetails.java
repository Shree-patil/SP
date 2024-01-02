/**
 * 
 */
package basics.java8.optionalclass;

import java.util.Optional;

/**
 * 
 */
public class AddressDetails {
	private Optional<String> doorNumber;
	private Optional <String> streetName;
	private String post;
	private String state;
	/**
	 * @return the doorNumber
	 */
	public Optional<String> getDoorNumber() {
		return doorNumber;
	}
	/**
	 * @param doorNumber the doorNumber to set
	 */
	public void setDoorNumber(Optional<String> doorNumber) {
		this.doorNumber = doorNumber;
	}
	/**
	 * @return the streetName
	 */
	public Optional<String> getStreetName() {
		return streetName;
	}
	/**
	 * @param streetName the streetName to set
	 */
	public void setStreetName(Optional<String> streetName) {
		this.streetName = streetName;
	}
	/**
	 * @return the post
	 */
	public String getPost() {
		return post;
	}
	/**
	 * @param post the post to set
	 */
	public void setPost(String post) {
		this.post = post;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	
}
