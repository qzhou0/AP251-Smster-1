// Bang Bang Celery (Taaseen Ali, Qian Zhou, Kayli Matsuyoshi)
// APCS1 pd1
// HW31 --  Ye Olde Role Playing Game, Expanded .
// 2017-11-13

public class Bandit extends Monster{
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    
    public Bandit() {
	
	_hitPts = 90;
	_strength =  10 + (int)( Math.random() * 45 ); // [10,55);
	_defense = 20;
	_attack = 1;

    }
    
    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
        public static String about(){
	return "Bandits have weak hit-points, high attack rating";}
    //prepare an Archer for a special attack
    public void specialize()
    {
	_attack = 1.5;
	_defense = 10;
    }

    //revert to normal mode
    public void normalize()
    {
	_attack = 1;
	_defense = 20;
    }
    
}
