//Qian Zhou, Hongtai Zhu, Selina Zou /Triple Tooters

//APCS1 pd<1>

//HW<09> -- <CMYM>

//<2017>-<10>-<02> 


public class BankAccount{
    //sets up all the initial values
    private static String acctHolderName;

    private static String acctPassword;

    private static int fourPIN;

    private static int ninePIN;

    private static float acctBalance;

    //private static String printInfo;
    
 // main method for testing
     public static void main(String[] args){
	 
	acctHolderName = "Triple Tooters";
	acctPassword = "spaghetti";
	fourPIN = 1234;
	ninePIN = 123456789;
	acctBalance = 199199;
        System.out.println(BankAccount.printAllInfo());
        deposit(11112.45f);
        System.out.println(BankAccount.printAllInfo());
	withdraw(11112.41f);
        System.out.println(BankAccount.printAllInfo());
        // for some reason returns 199199.05 instead of 199199.04; aother trials had a .000001 and .000004 difference.
	
    }
  
    private static void setName(String newName){
	acctHolderName = newName;
    }

    private void setPassword(String password){
	acctPassword = password;
    }

    private void set4PIN(int newfourPIN){
	fourPIN = newfourPIN;
    }

    private void set9PIN(int newninePIN){
	ninePIN = newninePIN;
    }

    private void setBalance(float balance){
	acctBalance = balance;
	
    }
    // adding or subtracting money from account balance
    public static void deposit(Float amount){
	acctBalance += amount;
    }

    public static void withdraw(Float amount){
	acctBalance -= amount;
    }
    //printing all the info
    private static String printAllInfo(){
        String printInfo;
        printInfo ="";
        printInfo += "Account Holder Name: " + acctHolderName + "\n";
        printInfo += "Account 9 Digit PIN: " + ninePIN + "\n";
        printInfo += "Balance: " + acctBalance + "\n";
        return printInfo;
	    }
       
}
