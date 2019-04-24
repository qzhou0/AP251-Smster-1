// Bang Bang Celery (Taaseen Ali, Qian Zhou, Kayli Matsuyoshi)
// APCS1 pd1
// HW28 -- Ye Olde Role Playing Game
// 2017-11-08

public class Monster extends Character
{

  // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  /*=============================================
    default constructor
    pre:  instance vars are declared
    post: initializes instance vars.
    =============================================*/
  public Monster()
  {
    _hitPts = 150;
    _strength = 20 + (int)( Math.random() * 45 ); // [20,65)
    _defense = 20;
    _attack = 1;
  }


  /*=============================================
    int attack(Protagonist) -- simulates attack on a Protagonist
    pre:  Input not null
    post: Calculates damage to be inflicted, flooring at 0. 
    Calls opponent's lowerHP() method to inflict damage. 
    Returns damage dealt.
    =============================================*/



}//end class Monster
