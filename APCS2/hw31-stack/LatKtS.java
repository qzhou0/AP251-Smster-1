//Qian Zhou
//APCS2 pd01
//HW31 -- Stack: What Is It Good For?               well, this.
//2018-04-10
/*****************************************************
 * skeleton for class LatKtS
 * Driver class for Latkes.
 * Uses a stack to reverse a text string, check for sets of matching parens.
 *****************************************************/


public class LatKtS
{

  /**********************************************************
   * precondition:  input string has length > 0
   * postcondition: returns reversed string s
   *                flip("desserts") -> "stressed"
   **********************************************************/
  public static String flip( String s )
  {
      Latkes stack = new Latkes(s.length());
      while (!s.equals("")){
	  stack.push(s.substring(0,1));
	  s=s.substring(1);
      }
      while (!stack.isEmpty()){
	  s+=stack.pop();
      }
      return s;
  }//end flip()


  /**********************************************************
   * precondition:  s contains only the characters {,},(,),[,]
   * postcondition: allMatched( "({}[()])" )    -> true
   *                allMatched( "([)]" )        -> false
   *                allMatched( "" )            -> true
   **********************************************************/
  public static boolean allMatched( String s )
  {
      Latkes stack = new Latkes(s.length()/2);
      for (int i = 0; i <s.length(); i++){
	  if (s.substring(i,i+1).equals(")")){
	      if (stack.isEmpty()||!stack.pop().equals("(")){
		  return false;}
	  }
	  else if(s.substring(i,i+1).equals("}")){
	      if (stack.isEmpty()||!stack.pop().equals("{")){return false;}
	  }
	  else if(s.substring(i,i+1).equals("]")){
	      if(stack.isEmpty()||!stack.pop().equals("[")){return false;}
	  }
	  else{
	      stack.push(s.substring(i,i+1));
	  }
      }
      return stack.isEmpty();
  }//end allMatched()


  //main method to test
  public static void main( String[] args )
  {
    
    System.out.println(flip("stressed"));

    System.out.println(allMatched( "({}[()])" )); //true
    System.out.println(allMatched( "([)]" ) ); //false
    System.out.println(allMatched( "(){([])}" ) ); //true
    System.out.println(allMatched( "](){([])}" ) ); //false
    System.out.println(allMatched( "(){([])}(" ) ); //false
    System.out.println(allMatched( "()[[]]{{{{((([])))}}}}" ) ); //true
    System.out.println(allMatched( "()}" ) );//f
    System.out.println(allMatched( "(){" ) );//f
/*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
    ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }

}//end class LatKtS
