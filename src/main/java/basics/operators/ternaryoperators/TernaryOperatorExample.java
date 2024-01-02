/**
 * 
 */
package basics.operators.ternaryoperators;

/**
 * 
 */
public class TernaryOperatorExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 45;
		int passMarks = 35;
		if(marks >= passMarks) {
			System.out.println("pass the exam");
		}else {
			System.out.println("fail the exam");
		}
		String result = (marks >= passMarks) ? "pass the exam" : "fail the exam";
		System.out.println("from ternary : "+result);
	}

}

/*
 * 1. ternary operator is divided 3 parts 1.1. before question mark (?) 1.2.
 * question mark (?) to colon (:) 1.3. colon(:) to end(semiclon (;)) 2. if
 * condition is true return second part 3. if condition is fail return third
 * part
 * 
 */