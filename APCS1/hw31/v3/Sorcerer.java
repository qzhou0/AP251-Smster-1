// Bang Bang Celery (Taaseen Ali, Qian Zhou, Kayli Matsuyoshi)
// APCS1 pd1
// HW31 --  Ye Olde Role Playing Game, Expanded .
// 2017-11-13

public class Sorcerer extends Protagonist{

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    
    public Sorcerer() {
	
	_hitPts = 60;
	_strength = 90;
	_defense = 60;
	_attack = .6;

	
    }
    public static String  about(){
	return "The Sorcerer has a high defense while sacrificing hit-points to achieve such magic";}
    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    
    public Sorcerer( String name ) {
	this();
	_name = name;
    }

    //prepare a Sorcerer for a special attack
    public void specialize()
    {
	_attack = .6;
	_defense = 40;
    }

    //revert to normal mode
    public void normalize()
    {
	_attack = .6;
	_defense = 60;
    }
}
   
