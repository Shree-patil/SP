/**
 * 
 */
package basics.java.oops.polymormphism.overriding;

/**
 * 
 */
public class OverRidingTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass parentClass = new ParentClass();
		parentClass.farming();
		parentClass.farmingPath();
		
		ChildClass childClass = new ChildClass();
		childClass.farming();
		childClass.farmingPath();
		childClass.display();
 }

}
