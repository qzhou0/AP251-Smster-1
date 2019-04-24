// Bang Bang Celery (Taaseen Ali, Qian Zhou, Kayli Matsuyoshi)
// APCS1 pd1
// HW31 --  Ye Olde Role Playing Game, Expanded .
// 2017-11-13
public class Demon extends Monster{
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/
    
    public Demon() {
	
	_hitPts = 80;
	_strength =  20 + (int)( Math.random() * 15 ); // [20,35);
	_defense = 70;
	_attack = 1;
	
    }
    public static String about(){
	return "Demons are weak but enduring creatures, with strong intelligence"; }
    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
        public void specialize()
    {
	_attack = 2.5;
	_defense = 30;
    }

    //revert to normal mode
    public void normalize()
    {
	_attack = 1;
	_defense = 70;
    }   

    
}
