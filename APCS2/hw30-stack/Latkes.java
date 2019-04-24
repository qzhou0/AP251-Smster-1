//Qian Zhou
//APCS2 pd01
//HW30 -- Stacks on Stacks on Stacks on Stacks¡­ ¡­  (Do I Smell Recursion?)
//2018-04-09
/*****************************************************
 * skeleton for class Latkes
 * Implements a stack of Strings using an encapsulated array
 *****************************************************/
//uses model with index 0 being top
// I suppose the easier model would be to use _stackSize-1 as the top
//Some musings... is it possible that somehow we overthinked this...?
public class Latkes
{
  private String [] _stack;
  private int _stackSize;

  //constructor
  public Latkes( int size )
  {
      _stackSize = 0;//just realized that _stackSize is not lengthe of stack, from AH's QAF post comment;
      //I thought it meant the size of _stack, which is the input here, from in-class discussion with Victor Lin
      _stack = new String[size];
  }

  //means of insertion
  public void push( String s )
  {
      if(isFull()){//full:self-expanding model
	  String[] sa = new String[_stack.length*2];//based on recollection from add() in ArrayList, or maybe it was *10?
	  sa[0]= s;
	  for (int i = 0; i < _stackSize; i++){
	      sa[i+1] =_stack[i];
	  }
	  _stack = sa;
	  _stackSize+=1;
	  //perhaps the ignoring model would throw a stackoverflow error here?
      }
      else{//not yet full
	  for (int i = _stackSize; i>0; i--){
	      _stack[i] = _stack[i-1];
	  }
	  _stack[0] = s;
	  _stackSize+=1;
      }
  }

  //means of removal
  public String pop( )
  {
      if (!isEmpty()){//can only pop something if it's not empty;
	  String s = _stack[0];
	  for (int i = 0; i < _stackSize ; i++){
	      _stack[i] = _stack[i+1];
	      if (i == _stackSize-1){//makes sure the last one is empty if it is removed.
		  _stack[i+1]= null;
	      }
	  }
	  _stackSize-=1;
	  return s;
      }
      return null;
  }

  //chk for emptiness
  public boolean isEmpty()
  {
      return _stack[0] == null;//or could be _stack.length==stackSize;
  }

  //chk for fullness
  public boolean isFull()
  {
      return _stack[_stack.length - 1]!= null;//or could be _stackSize==0;
  }


  //main method for testing
  public static void main( String[] args )
  {
    
      Latkes tastyStack = new Latkes(10);

      tastyStack.push("aoo");
      tastyStack.push("boo");
      tastyStack.push("coo");
      tastyStack.push("doo");
      tastyStack.push("eoo");
      tastyStack.push("foo");
      tastyStack.push("goo");
      tastyStack.push("hoo");
      tastyStack.push("ioo");
      tastyStack.push("joo");
      tastyStack.push("coocoo");
      tastyStack.push("cachoo");

      //cachoo
      System.out.println( tastyStack.pop() );
      //coocoo
      System.out.println( tastyStack.pop() );
      //joo
      System.out.println( tastyStack.pop() );
      //ioo
      System.out.println( tastyStack.pop() );
      //hoo
      System.out.println( tastyStack.pop() );
      //goo
      System.out.println( tastyStack.pop() );
      //foo
      System.out.println( tastyStack.pop() );
      //eoo
      System.out.println( tastyStack.pop() );
      //doo
      System.out.println( tastyStack.pop() );
      //coo
      System.out.println( tastyStack.pop() );
      //boo
      System.out.println( tastyStack.pop() );
      //aoo
      System.out.println( tastyStack.pop() );

      //stack empty by now; SOP(null)
      System.out.println( tastyStack.pop() );
/*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main()

}//end class Latkes
