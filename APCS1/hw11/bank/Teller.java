// team greatness  (James Huang, Raymond Wu, Qian Zhou)
// HW11 -- Breaking the Bank
// Auditing Team Bob's (Jerry, Zane, Ahnaf) code with Teller.java
// APCS pd1
// 2017-10-04

public class Teller {

    public static void main( String[] args) {
		BankAccount list = new BankAccount();
		
		// testing each method individually

		//  first constructor
		System.out.print( list.toString() );
		System.out.print( "\n\t^^^ END OF TEST ^^^\n\n" );
		

		// various mutators
		list.setName( "james" );
		System.out.print( list.toString() );
		System.out.print( "\n\t^^^ END OF TEST ^^^\n\n" );
		
		list.setPasswd( "12345678" );
		System.out.print( list.toString() );
		System.out.print( "\n\t^^^ END OF TEST ^^^\n\n" );
		
		list.setPin( 1234 );
		System.out.print( list.toString() );
		System.out.print( "\n\t^^^ END OF TEST ^^^\n\n" );
		
		list.setAcctNum( 102222222 );
		System.out.print( list.toString() );
		System.out.print( "\n\t^^^ END OF TEST ^^^\n\n" );
		
		list.setBalance( 310.0 );
		System.out.print( list.toString() );
		System.out.print( "\n\t^^^ END OF TEST ^^^\n\n" );
		
		list.deposit( 10 );
		System.out.print( list.toString() );
		System.out.print( "\n\t^^^ END OF TEST ^^^\n\n" );
		
		list.withdraw( 200 );
		System.out.print(list.toString());
		System.out.print( "\n\t^^^ END OF TEST ^^^\n\n" );
		
		// testing authentification method
		System.out.print(list.authenticate(102222222,"12345678"));
		System.out.print( "\n\t^^^ END OF TEST ^^^\n\n" );

		// other two overloaded constructors
		BankAccount list1 = new BankAccount(987654321," homework" );
		System.out.print( list1.toString() );
		System.out.print( "\n\t^^^ END OF TEST ^^^\n\n" );
		
		BankAccount list2 = new BankAccount(546372819,"less homework", 10.78, "no name", 4628);
		System.out.print( list2.toString() );
		System.out.print( "\n\t^^^ END OF TEST ^^^\n\n" );
		
    }

}
