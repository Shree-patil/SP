/**
 * 
 */
package basics.stringfamily;

/**
 * 
 */
public class StringBuilderExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder name = new StringBuilder("Kiran reddy");
		System.out.println("string buffer : name : " + name.append(" molakala"));
		String nameVal = new String("Kiran reddy");
		System.out.println("nameVal intailly : " + nameVal);
		System.out.println("string : nameVal : " + nameVal.concat(" molakala"));
		System.out.println("string buffer");

		System.out.println("name : " + name);
		System.out.println(name.reverse());

		System.out.println("manually");
		System.out.println("nameVal : " + nameVal);
		for (int size = nameVal.length() - 1; size >= 0; size--) {
			System.out.print(nameVal.charAt(size));
		}

	}

}

/*
 * 1. StringBuffer is synchnized (one process at a time) 
 * 2. StringBuilder is not synchnized (multiple process at a time) it is faster (mostly we are using
 * gaming app)
 */