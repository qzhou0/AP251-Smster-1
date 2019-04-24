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
	
	_hitPts = 60;
	_strength =  10 + (int)( Math.random() * 25 ); // [10,35);
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
    

    
}
