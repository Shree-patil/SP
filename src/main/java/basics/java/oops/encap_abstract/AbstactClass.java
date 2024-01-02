/**
 * 
 */
package basics.java.oops.encap_abstract;

/**
 * 
 */
public abstract class  AbstactClass {
	abstract String finacierDetails();
	abstract double emiAmount(float principal,int tenure,String pancard);
	abstract String modeOfPayment();
	void display() {
		
	}

}


/*
 * 1. write abstract keyword before class 
 * 2. abstract class methods access modifier other than private,default
 * 3. abstract keyword we can write in class, methods
 * 4. by defalut access modifier for absract is public, allowed access modifier are protected and public
 */
