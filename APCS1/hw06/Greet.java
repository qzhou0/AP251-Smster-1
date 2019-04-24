// Qian Zhou
// APCS1 pd01
//HW06--
//2017-09-25
public class Greet {
    public static void main (String [] args){
	String greeting;
	BigSib richard = new BigSib();
	richard.setHelloMsg("Word up ");
	greeting = richard.greet("freshman");
	System.out.println(greeting);
    }
}
