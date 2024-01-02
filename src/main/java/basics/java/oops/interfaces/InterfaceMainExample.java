/**
 * 
 */
package basics.java.oops.interfaces;

/**
 * 
 */
public class InterfaceMainExample extends ChildClass implements MainInterface,SecondInterface {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceMainExample interfaceMainExample = new InterfaceMainExample();
		interfaceMainExample.bankDetails();
		interfaceMainExample.display();
		System.out.println("name is : "+ MainInterface.name);
		System.out.println("name is : "+ SecondInterface.name);
		System.out.println("age is : "+ age);
		ChildClass childClass = new ChildClass();
		childClass.userInfo();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("we are in display");
		
	}

	@Override
	public void bankDetails() {
		// TODO Auto-generated method stub
		System.out.println("we are in bankDetails");
	}

	@Override
	public void data() {
		// TODO Auto-generated method stub
		System.out.println("we are in data");
	}

}
