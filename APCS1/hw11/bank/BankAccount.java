// Team Bob
// Jerry Ye
// APCS1 pd1
// HW10 -- Mo Money Mo Problems
// 2017-10-03 T


public class BankAccount
{/* default constructor: initializes instance vars to default vals
       precondition:  none
       postcondition: instance vars have appropriate default vals
       ````````````````````````````````````````````````````*/
    public BankAccount() {
	
	pin = 9999;
	acctNum= 999999999;
	
    }

    /* overloaded constructor: allows caller to specify account 
                               number and passwd. Assigns defaults
                               to other instance vars.
       precondition:  params are passed in specified order
       postcondition: instance vars have values specified by params
       ````````````````````````````````````````````````````*/
    public BankAccount( int newAcctNum, String newPass ) {
	acctNum=newAcctNum;
	passwd = newPass;
	pin = 9999;}	
	

    /* overloaded constructor: allows caller to specify instance vars
       precondition:  params are passed in specified order
       postcondition: instance vars have values specified by params
       ````````````````````````````````````````````````````*/
    public BankAccount( int newAcctNum, String newPass, 
			double newBal, String newName, int newPin ) {
	acctNum=newAcctNum;
	passwd = newPass;	
	name = newName;
	pin = newPin;
	balance= newBal;
    }
    //instance variables
    private String name;
    private String passwd;
    private int pin;
    private int acctNum;
    private double balance;


    //mutators
    public String setName( String newName )//sets account name when called
    {
	String oldName = name;
	name = newName;
	return oldName;
	//sets name to new name but also returns old name
    }

    public String setPasswd( String newPasswd )//sets password
    {
	String oldPasswd = passwd;
	passwd = newPasswd;//sets passwd to new psswd but also returns old psswd
	return oldPasswd;
    }

    public int setPin( int newPin )
    {
	int oldPin = pin;
	if (newPin >= 1000 && newPin < 9999){//conditional which tests pin limit
	    pin = newPin;
	}
	else{
	    pin = 9999;
	    System.out.println("invalid pin");
	}
	return oldPin;
    }

    public int setAcctNum( int newAcctNum )
    {
	int oldAcctNum = acctNum;
	if (newAcctNum >= 100000000 && newAcctNum < 999999999) {//conditional which tests acctNum limit
	    acctNum = newAcctNum;
	}
	else {
	    acctNum = 999999999;
	    System.out.println("invalid account number");
	}
	return oldAcctNum;
    }

    public double setBalance( double newBalance )
    {
	double oldBalance = balance;
	balance = newBalance;
	return oldBalance;
    }
    
    public void deposit( double depositAmount ) {
	balance = balance + depositAmount;
    }
    public boolean withdraw( double withdrawAmount){
	if (withdrawAmount > balance) {//if there isn't enough cash in ur acct u shouldnt be able to withdraw it
	    System.out.println("Not enough money in your bank account!");
	    return false;
	}
	else {
	    balance = balance - withdrawAmount;
	    return true;//but otherwise u should
	}
    }
    public  boolean authenticate( int accountNumber, String pass){
	if(pass == passwd && accountNumber == acctNum) {//if acct credentials are correct then you are authenticated.
	    return true;
	}
	else {
	    return false;
	}
    }


    //overwritten toString() which makes printing the object print all of this instead
    public String toString() {
	String retStr = "\nAccount info:\n=======================";
	retStr = retStr + "\nName: " + name;
	retStr = retStr + "\nPassword: " + passwd;
	retStr = retStr + "\nPIN: " + pin;
	retStr = retStr + "\nAccount Number: " + acctNum;
	retStr = retStr + "\nBalance: " + balance;
	retStr = retStr + "\n=======================";
	return retStr;
    }


    //main method for testing
    public static void main( String[] args){//didn't know how to test using main method because of static context

    }//end main()

}//end class BankAccount
