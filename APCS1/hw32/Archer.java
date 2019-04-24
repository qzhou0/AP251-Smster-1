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
	_attack = .9;

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
    public String about(){
	String s="";
	s += "HP: " + _hitPts;
	s += "\tStrength: " + _strength;
	s += "\tThe Archeris weak in defense but her hitpoints and attack are higher";
	return s;}
    //prepare an Archer for a special attack
    public void specialize()
    {
	_attack = 1.6;
	_defense = 10;
    }

    //revert to normal mode
    public void normalize()
    {
	_attack = .9;
	_defense = 30;
    }
    public void magic(){
	int m = (int)(Math.random() *20);
	_hitPts -=m;
	_strength +=m;}
}
