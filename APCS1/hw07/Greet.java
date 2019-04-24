// Qian Zhou
// APCS1 pd01
//HW07--On the Origins of a BigSib
//2017-09-26
public class Greet {
    public static void main (String [] args){
	String greeting;
	BigSib richard = new BigSib("Word up");
	BigSib grizz = new BigSib("Sup");
	BigSib dotCom = new BigSib("Salutations");
	BigSib tracy  = new BigSib("Bonjour");
	BigSib original = new BigSib();
	//greeting = BigSib.greet("nothing");
	//System.out.println(greeting);
	
	//richard.setHelloMsg("Word up ");
	
	
        //System.out.println(richard.helloMsg);
	greeting = richard.greet("freshman");
	System.out.println(greeting);
	greeting = grizz.greet("Dr. Spaceman");
	System.out.println(greeting);
	greeting = dotCom.greet("young man");
	System.out.println(greeting);
	greeting = tracy.greet("mon amie");
	System.out.println(greeting);
        greeting = original.greet("freshman");
        System.out.println(greeting);

    }
}
