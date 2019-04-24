// team#07 greatness (James Huang, Raymond Wu, Qian Zhou)
// APCS1 pd01
// HW10 -- building a more meaningful class
// 2017-10-04 

public class BankAccount
{
  //instance variables
  private  String name;
  private  String passwd;
  private  int pin;
  private  int acctNum;
  private  double balance;


  //mutators
  public  String setName( String newName )
  {
    String oldName = name;
    name = newName;
    return oldName;
  }

  public  String setPasswd( String newPasswd )
  {
    String oldPasswd = passwd;
    passwd = newPasswd;
    return oldPasswd;
  }

  public  int setPin( int newPin )
  {
    int oldPin = pin;
    if (1000<=newPin && newPin<=9998) {
	pin = newPin; }
    else {
	pin = 9999 ;
	System.out.println("you must make your account number 1000-9998, your new pin was invalid");
    }
    return oldPin;
  }

  public  int setAcctNum( int newAcctNum )
  {
    int oldAcctNum = acctNum;
    if (100000000<=newAcctNum && newAcctNum<=999999998) {
    acctNum = newAcctNum; 
}
    else {
    acctNum = 999999999;
    System.out.println("you must make your account number between 100000000-999999998, your new number was invalid.");
}
    
    return oldAcctNum;
  }

  public  double setBalance( double newBalance )
  {
    double oldBalance = balance;
    balance = newBalance;
    return oldBalance;
  }

  public  void deposit( double depositAmount ) {
    balance = balance + depositAmount;
  }
  public  boolean withdraw(double output){
	if (output <= balance){
	    balance -= output;
	    return true;
	}
	else{
	    System.out.println( "You're too broke for that.");
	    return false;
        }
    }

  //overwritten toString()
  public  String toString() {
    String retStr = "\nAccount info:\n=======================";
    retStr = retStr + "\nName: " + name;
    retStr = retStr + "\nPassword: " + passwd;
    retStr = retStr + "\nPIN: " + pin;
    retStr = retStr + "\nAccount Number: " + acctNum;
    retStr = retStr + "\nBalance: " + balance;
    retStr = retStr + "\n=======================";
    //System.out.println(toString());
      return retStr;
  }

    public  boolean authenticate (int isAcctNum, String isName){
	return isAcctNum == acctNum && isName== name;
    }
		
  //main method for testing
  public static void main( String[] args )
  {
      BankAccount f=new BankAccount();
      f.setAcctNum(123456789);
      f.setName("name");
      System.out.println(f.authenticate(123456789, "name"));
      f.setPin(1234);
      f.setPasswd("helloworld");
      f.setBalance(100);
      f.withdraw(45.12);
      System.out.println(f.balance);
      f.deposit(72.89);
      System.out.println(f.balance);
     

      System.out.println(f.toString());
  }//end main()

}//end class BankAccount
