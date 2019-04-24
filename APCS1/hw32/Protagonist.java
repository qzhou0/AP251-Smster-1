// Bang Bang Celery (Taaseen Ali, Qian Zhou, Kayli Matsuyoshi)
// APCS1 pd1
// HW31 --  Ye Olde Role Playing Game, Expanded .
// 2017-11-13


public abstract class Protagonist extends Character
{
  // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
  protected String _name = "J. Doe";
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  /*=============================================
    default constructor
    pre:  instance vars are declared
    post: initializes instance vars.
    =============================================*/
  public Protagonist()
  {
    _hitPts = 125;
    _strength = 100;
    _defense = 40;
    _attack = .4;
  }


  /*=============================================
    overloaded constructor
    pre:  instance vars are declared
    post: initializes instance vars. _name is set to input String.
    =============================================*/
  public Protagonist( String name ) {
    this();
    _name = name;
  }


  // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
  public String getName() { return _name; }
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~





  //prepare a Protagonist for a special attack
    public abstract  void normalize();
    public abstract  void specialize();
    public abstract  String about();
    public abstract void magic();

}//end class Protagonist
