/*==================================================
  class GuessNumber -- fun fun fun!

  eg, sample interaction with end user:
  Guess a # fr 1-100: 50
  Too high
  Guess a # fr 1-49: 25
  Too low
  Guess a # fr 26-49: 38
  Correct! It took 3 guesses
  ==================================================*/
//Qian Zhou
//APCS1 pd01
//HW48 -- Keep Guessing (...but hopefully, you won¡¯t have to make too many guesses)
//2017-12-06

import cs1.Keyboard;

public class GuessNumber 
{
    //instance vars
    private int _lo, _hi, _guessCtr, _target;


    /*==================================================
      constructor -- initializes a guess-a-number game
      pre:  
      post: _lo is lower bound, _hi is upper bound,
      _guessCtr is 1, _target is random int on range [_lo,_hi]
      ==================================================*/
    public GuessNumber( int a, int b ) 
    {
	_lo = a; _hi = b;
	_guessCtr = 1;
	_target = (int)(Math.random()*(_hi-_lo+1)+_lo+1);
    }


    /*==================================================
      void playRec() -- Prompts a user to guess until guess is correct.
      Uses recursion.
      pre:  
      post: 
      ==================================================*/
    public void playRec() 
    {
	System.out.println("Guess a # fr "+_lo+" - "+_hi+" :");

	int g=1;
	try {
	    g = Keyboard.readInt();
	}
	catch (Exception e){}
	if (g != _target && g<=_hi && g>=_lo){
	    _guessCtr +=1;
	    if (g < _target ){
		System.out.println("Too low");
		_lo = g+1;
	    }
	    else if (g>_target){
		System.out.println("Too high");
		_hi = g-1;}
	    playRec();}
	else if (g> _hi || g <_lo){
	    System.out.println("Please follow Directions");
	    playRec();}
		    
	else if (g==_target){
	    _guessCtr+=1;
	    System.out.println("Correct! It took " + _guessCtr+" guesses");
	}
    }


    /*==================================================
      void playIter() -- Prompts a user to guess until guess is correct.
      Uses iteration.
      pre:  
      post: 
      ==================================================*/
    public void playIter() 
    {
	boolean isCorrect=false;
	while (!isCorrect){
	    System.out.println("Guess a # fr "+_lo+" - "+_hi+" :");
	    int g=1;
	    try {
		g = Keyboard.readInt();
		_guessCtr+=1;
	    }
	    catch (Exception e){}
	    if ( g<=_hi && g>=_lo){
		if (g < _target ){
		    System.out.println("Too low");
		    _lo = g+1;
		}
		else if (g > _target){
		    System.out.println("Too high");
		    _hi = g-1;}
		else{
		    isCorrect = true;
		    System.out.println("Correct! It took " + _guessCtr+" guesses");}
	    }
	    else if (g<_lo|| g >_hi){
		System.out.println("Please follow Directions");
	    }
	}
    }


    //wrapper for playRec/playIter to simplify calling
    public void play() 
    { 
	//use one or the other below:
	//playRec();
	playIter();
    }


    //main method to run it all
    public static void main( String[] args ) 
    {
	
	//instantiate a new game
	GuessNumber g = new GuessNumber(1,100);

	//start the game
	g.play();
	
    }//end main

}//end class
