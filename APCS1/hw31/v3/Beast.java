// Bang Bang Celery (Taaseen Ali, Qian Zhou, Kayli Matsuyoshi)
// APCS1 pd1
// HW31 --  Ye Olde Role Playing Game, Expanded .
// 2017-11-13

public class Beast extends Monster{
    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    /*=============================================
      default constructor
      pre:  instance vars are declared
      post: initializes instance vars.
      =============================================*/

    public Beast() {
	
	_hitPts = 120;
	_strength =  70 + (int)( Math.random() * 25 ); // [70,95);
	_defense = 40;
	_attack = .5;

    }
    public static String about(){
	return " Beasts are strong and fat but lack in spirit of attack";}
    /*=============================================
      overloaded constructor
      pre:  instance vars are declared
      post: initializes instance vars. _name is set to input String.
      =============================================*/
    

    
}
