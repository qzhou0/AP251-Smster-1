// Bang Bang Celery (Taaseen Ali, Qian Zhou, Kayli Matsuyoshi)
// APCS1 pd1
// HW31 --  Ye Olde Role Playing Game, Expanded .
// 2017-11-13

public class Warrior extends Protagonist{

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    
    public Warrior() {
	
	_hitPts = 60;
	_strength = 100;
	_defense = 50;
	_attack = .8;

    }
    
    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    
    public Warrior( String name ) {
	this();
	_name = name;
    }
    public static String about(){
	return "The Warrior has uncomparable strength and attack but his life weak as the magician's";}

    //prepare a Warrior for a special attack
    public void specialize()
    {
	_attack = .9;
	_defense = 30;
    }

    //revert to normal mode
    public void normalize()
    {
	_attack = .8;
	_defense = 50;
    }
}
   
