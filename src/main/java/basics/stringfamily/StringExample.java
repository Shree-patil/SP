/**
 * 
 */
package basics.stringfamily;

import basics.datatypes.DataTypeExample;
import basics.namingconvetions.NamingConventions;

/**
 * 
 */
public class StringExample {

	/**
	 * @param args
	 */
	int age =10 ;
	DataTypeExample dataTypeExample = new DataTypeExample();
	NamingConventions conventions;
	public StringExample() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="           kirsffn Reddy ABC kirsffnuikuyk        ";
		String panCard = "BMSPR2333E";
		//char type = panCard.charAt(4);  // only for validate in particular position of a charactor.   // 0.00005 %
		if(panCard.charAt(3) == 'P') {
			System.out.println("pancard belongs to person");
		}else if(panCard.charAt(3) == 'C') {
			System.out.println("pancard belongs to company");
		}
		else {
			System.out.println("pancard is invalid");
		}
		System.out.println(panCard.compareTo("bmspr2333e"));  // mostly we are not using
		
		System.out.println(panCard.compareToIgnoreCase("bmspr2333e")); // mostly we are not using
		
		
		
		System.out.println(panCard.concat( " is valid pan card for person")); //mostly we are using
		System.out.println(panCard.equals("bmspr2333e"));
		System.out.println(panCard.equalsIgnoreCase("bmspr2333e")); //prefarable
		System.out.println(panCard.contains("bmspr2333e"));
		System.out.println(panCard.length());
		System.out.println(panCard.isEmpty());
		System.out.println(name.replace("kirsffn", "chakri"));
		System.out.println(name.replaceAll("kirsffn", "chakri")); //prefarable
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.trim()+";");
		

	}

}





//1. class contains methods, variables, objects of another class, references of another class, constructor also