//Qian Zhou, Hongtai Zhu, Selina Zou /Triple Tooters

//APCS1 pd<1>

//HW<09> -- <CMYM>

//<2017>-<09>-<29> 

public class BankAccount{
    public static void main(String[] args){

	setName("name");
	setPassword("password");
	set4PIN(1234);
        set9PIN(123456789);
	setBalance(100f);
	System.out.println(withdraw(45.12f));
	System.out.println(deposit(72.89f));
	AcctInfo();
	
	
    }
    // vars
    private static String acctHolderName;

    private static String acctPassword;

    private static int fourPIN;

    private static int ninePIN;

    private static float acctBalance;

    
    // methods
    private static void  setName(String name){
	acctHolderName = name;
	    }
    private static  void setPassword(String password){
	acctPassword = password;
    }

    private static void set4PIN(int fourdPIN){
	fourPIN = fourdPIN;
    }

   private static void set9PIN(int ninedPIN){
	ninePIN = ninedPIN;
    }

    private static void setBalance(float balance){
	acctBalance = balance;
	
    }
    private static void AcctInfo(){
	System.out.println("Account Holder: " + acctHolderName);
	System.out.println(" password: " + acctPassword);
	System.out.println(" Four-digit PIN: " +fourPIN);
	System.out.println( " Nine-digit PIN: " +ninePIN);
	System.out.println(" Account Balance: "  +acctBalance) ;
	    }
    private static boolean deposit(float depValue){
	float oldBalance;
	
	oldBalance = acctBalance;

	acctBalance-= -1*depValue;
	return acctBalance  == 127 ;
    }
    private static boolean withdraw(float takeValue){
	float oldBalance;
	oldBalance = acctBalance;

	acctBalance -= takeValue;

	return oldBalance == acctBalance +  takeValue ;
    }
    
	    
}
