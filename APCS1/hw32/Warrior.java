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
	_strength = 125;
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
    public  String about(){
	String s="";
	s += "HP: " + _hitPts;
	s += "\tStrength: " + _strength;
	s+= "\tThe Warrior has uncomparable strength but his life weak as the magician's";
	return s;}

    //prepare a Warrior for a special attack
    public void specialize()
    {
	_attack = 1;
	_defense = 30;
    }

    //revert to normal mode
    public void normalize()
    {
	_attack = .8;
	_defense = 50;
    }
    public void magic(){
	int m = ((int)(Math.random()*7))- 3;
	_hitPts +=m;
	_strength -= m;}
}
   
