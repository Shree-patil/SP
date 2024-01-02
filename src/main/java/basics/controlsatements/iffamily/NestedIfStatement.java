/**
 * 
 */
package basics.controlsatements.iffamily;

/**
 * 
 */
public class NestedIfStatement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int studyYears = 16;
		int percentage = 60;
		String gender = "female";
		
		if(studyYears > 16) {
			if(percentage>60) {
				if(gender == "female") {
					System.out.println("eligiable to apply job");
				}
			}
			
		}

	}

}

/* filter based condtions */
