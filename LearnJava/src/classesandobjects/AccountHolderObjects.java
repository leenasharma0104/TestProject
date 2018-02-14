package classesandobjects;

public class AccountHolderObjects {
	public static void main (String[] args) {
		
		AccountHolder tom = new AccountHolder();
		AccountHolder henry = new AccountHolder();
		AccountHolder sarah = new AccountHolder();
		
		tom.firstName = "Tom";
		tom.lastName = "Smith";
		tom.age = 21;
		tom.accountbalance = 10000;
		
		tom.testeligibilityForCreditCard();
		
		System.out.println("Is Tom eligible for CC : "+tom.eligibleForCC);
		
		henry.firstName = "Henry";
		henry.lastName = "Hill";
		henry.age = 31;
		henry.accountbalance = 20000;
		
		henry.testeligibilityForCreditCard();
		
		System.out.println("Is Henry eligible for CC : "+henry.eligibleForCC);
	} 
}
