/**
 * 
 */
package basics.java8.functionalinterface;

/**
 * 
 */
@FunctionalInterface
public interface FunctionalInterfaceExample {
	// void display();
	void bankDetails();

	default void accountDetails() {
		System.out.println("basic requirement");
	}

	default void data() {

	}

	default void display() {

	}

	static void dataDisplay() {

	}

	String name = "kiran reddy";
}
