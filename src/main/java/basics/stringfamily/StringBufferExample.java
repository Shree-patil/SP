/**
 * 
 */
package basics.stringfamily;

/**
 * 
 */
public class StringBufferExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer name = new StringBuffer("Kiran reddy");
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
 * 1. value is changing best approach is StringBuffer 2. value nor modify then
 * String is best approach 3. to add end of content in String use concat method,
 * in String Buffer Append method
 */
