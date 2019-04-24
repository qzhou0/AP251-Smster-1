// Bang Bang Celery (Taaseen Ali, Qian Zhou, Kayli Matsuyoshi)
// APCS1 pd1
// HW31 --  Ye Olde Role Playing Game, Expanded .
// 2017-11-13


public  class Character
{

  //this feels like a bad idea... but the compiler made me do it!
  protected int _hitPts;
  protected int _strength;
  protected int _defense;
  protected double _attack;




  // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
  public int getDefense() { return _defense; }
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  /*=============================================
    boolean isAlive() -- tell whether I am alive
    post: returns boolean indicated alive or dead
    =============================================*/
  public boolean isAlive()
  {
    return _hitPts > 0;
  }


  /*=============================================
    void lowerHP(int) -- lowers life by input value
    pre:  Input >= 0
    post: Life instance var is lowered by input ammount.
    =============================================*/
  public void lowerHP( int damageInflicted )
  {
    _hitPts = _hitPts - damageInflicted;
  }


  /*=============================================
    int attack(Protagonist) -- simulates attack on a Protagonist
    pre:  Input not null
    post: Calculates damage to be inflicted, flooring at 0.
    Calls opponent's lowerHP() method to inflict damage.
    Returns damage dealt.
    =============================================*/
  public int attack( Character opponent )
  {
    int damage = (int)( (_strength * _attack) - opponent.getDefense() );
    //System.out.println( "\t\t**DIAG** damage: " + damage );

    if ( damage < 0 )
      damage = 0;

    opponent.lowerHP( damage );

    return damage;
  }//end attack


    

}//end class Character
