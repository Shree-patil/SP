/**
 * 
 */
package basics.operators.logicaloperators;

/**
 * 
 */
public class LogicalOpratorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int studyYears = 18;
		int percentage = 54;
		String gender = "female";
		if(studyYears > 16) {
			if(percentage > 60) {
				if(gender == "female") {
					System.out.println("eligiable to apply job");
				}
			}
		}
		if(studyYears > 16 && percentage > 60 && gender == "female") {
			System.out.println("eligiable to apply job by using logical and");
		}
		if(studyYears > 16 || percentage > 60 || gender == "female") {
			System.out.println("eligiable to apply job by using logical or");
		}
		if(!(studyYears > 16)) {
			System.out.println("eligiable to apply job by using logical not");
		}
		
	}

}

/*
 * 1. && - > works on 2 or more conditions 
 * 2. || - > works on 2 or more conditions 
 * 3. ! - > works on 1 conditions
 * 
 * 4. 1,2 points are used for to avoid nested statements 5. 3 points oposite of
 * return type
 */



