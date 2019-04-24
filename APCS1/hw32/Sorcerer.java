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
    public int magicPwr;    
    public Sorcerer() {
	
	_hitPts = 60;
	_strength = 70;
	_defense = 60;
	_attack = .6;
	magicPwr=0;

	
    }
    public  String  about(){
	String s="";
	s += "HP: " + _hitPts;
	s += "\tStrength: " + _strength;
	s+= "\tattack: " + _attack;
	s+="\tdefense: "+_defense;
	s+= "\tThe Sorcerer has a high defense and attack while sacrificing hit-points to achieve such magic";
	return s;}
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
	_strength = 100;
	_defense -= 30;
    }

    //revert to normal mode
    public void normalize()
    {
	if (_strength <70){
	    _strength += 10 ;}
	else{_strength = 70;}
	_defense = 60 + magicPwr *3 ;

    }
    public void magic(){
	magicPwr+=1;
	_attack += .1;
        _strength /=10;}
}
   
