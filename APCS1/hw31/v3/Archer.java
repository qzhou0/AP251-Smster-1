// Bang Bang Celery (Taaseen Ali, Qian Zhou, Kayli Matsuyoshi)
// APCS1 pd1
// HW31 --  Ye Olde Role Playing Game, Expanded .
// 2017-11-13

public class Archer extends Protagonist{
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    
    public Archer() {
	
	_hitPts = 90;
	_strength = 80;
	_defense = 30;
	_attack = .7;

    }
    
    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    
    public Archer( String name ) {
	this();
	_name = name;
    }
    public static String about(){
	return "The Archeris weak in defense but her hitpoints are higher";}
    //prepare an Archer for a special attack
    public void specialize()
    {
	_attack = .9;
	_defense = 10;
    }

    //revert to normal mode
    public void normalize()
    {
	_attack = .7;
	_defense = 30;
    }
}
