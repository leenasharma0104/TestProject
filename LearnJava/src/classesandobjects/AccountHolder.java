package classesandobjects;
 	
public class AccountHolder {
	String firstName;
	String lastName;
	int age;
	float accountbalance;
	boolean eligibleForCC; 
	
			public void testeligibilityForCreditCard() {
			if (age>25 && accountbalance>=20000) {
				eligibleForCC=true; 
				} 
		}		 
}
