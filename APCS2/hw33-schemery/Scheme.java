//Qian Zhou
//APCS2 pd01
//HW33 -- What a Racket   or: How I Learned to Stop Worrying and Love the Stack
//2018-04-12


/*****************************************************
 * class Scheme
 * Simulates a rudimentary Scheme interpreter
 * 
 * ALGORITHM for EVALUATING A SCHEME EXPRESSION:
 *   1. Steal underpants.
 *   2. split empty spaces into list e
 *   3. look at operator following this and assign its value
 *   4. for each element in the list e from its index 2:
 *     a) if it is equal to (, if counter q is zero, evaluate the whole from  * that index*2 part of the input expression and push the result into stack num. q+=1
 *     b) else if it is equal to )
 *        i)if q is zero, return unload result
 *        ii) q-=1
 *     c) else if q is zero and ths element is a number, push it to stack num
 *     
 *   5. Profit!
 *
 * STACK OF CHOICE: stack  by reverse order
 * b/c this can help make the subtract method much easier to execute
 ******************************************************/

public class Scheme
{
  /****************************************************** 
   * precond:  Assumes expr is a valid Scheme (prefix) expression,
   *           with whitespace separating all operators, parens, and 
   *           integer operands.
   * postcond: Returns the simplified value of the expression, as a String
   * eg,
   *           evaluate( "( + 4 3 )" ) -> 7
   *	         evaluate( "( + 4 ( * 2 5 ) 3 )" ) -> 17
   ******************************************************/
  public static String evaluate( String expr ) 
  {
      String[] e = expr.split("\\s+");
      Stack<String> num=new ALStack();
      
      int o=0;
      //check for operators, since can be done earlier and one pair of parenthesis has only one operator
      if (e[1].equals("+")){o=1;}
      else if(e[1].equals("-")){o=2;}
      else if(e[1].equals("*")){o=3;}

      int q=0;
      //use to count, making sure nothing inside parenthesis are used for this outside layer
      for (int i = 2; i<e.length; i++){//assume first is (
	  //base case
	  if (e[i].equals(")")){
	      
	      if (q==0)return unload(o, num);
	      q -=1;
	  }

	  //recursion,
	  //I think is necessary or would need who-knows-how-much variables to hold data in the parenthesis
	  else if(e[i].equals("(")){
   	      if (q==0) num.push(evaluate(expr.substring(i*2)));
	      
	      q += 1;
	  }
	  else if(q==0&&isNumber(e[i])){
	      num.push(e[i]);
	  }
      }
      return unload(o, num);
	      
      
      
  }//end evaluate()


  /****************************************************** 
   * precond:  Assumes top of input stack is a number.
   * postcond: Performs op on nums until closing paren is seen thru peek().
   *           Returns the result of operating on sequence of operands.
   *           Ops: + is 1, - is 2, * is 3
   ******************************************************/
  public static String unload( int op, Stack<String> numbers ) 
  {
      int n=-1;
      
      if (op == 1){
	  n=0;
	  while (!numbers.isEmpty()){
	      n+=Integer.parseInt(numbers.pop());
	  }
      }
      else if (op==2){//last number must be added,
	  //and I was confused over the part above so I did not reverse this order above
	  Stack<Integer> m = new ALStack();
	  while (!numbers.isEmpty()){//reverse order
	      m.push(Integer.parseInt(numbers.pop()));
	      
	  }
	  n = m.pop();//first value is positive
	  while (!m.isEmpty()){
	      n-=m.pop();
	  }
      }
      else if(op == 3){
	  n=1;
	  while (!numbers.isEmpty()){
	      n*=Integer.parseInt(numbers.pop());
	  }
      }
      
      return n+"";
  }//end unload()


  
  //optional check-to-see-if-its-a-number helper fxn:
  public static boolean isNumber( String s ) {
  try {
  Integer.parseInt(s);
  return true;
	}
  catch( NumberFormatException e ) {
  return false;
	}
  }
  


  //main method for testing
  public static void main( String[] args )
  {

    
      String zoo1 = "( + 4 3 )";
      System.out.println(zoo1);
      System.out.println("zoo1 eval'd: " + evaluate(zoo1) );
      //...7
      String zoo11 = "( * 2 5 )";
      System.out.println("zoo11 eval'd: " + evaluate(zoo11) );
      String zoo2 = "( + 4 ( * 2 5 ) 3 )";
      System.out.println(zoo2);
      System.out.println("zoo2 eval'd: " + evaluate(zoo2) );
      //...17

      String zoo3 = "( + 4 ( * 2 5 ) 6 3 ( - 56 50 ) )";
      System.out.println(zoo3);
      System.out.println("zoo3 eval'd: " + evaluate(zoo3) );
      //...29

      String zoo4 = "( - 1 2 3 )";
      System.out.println(zoo4);
      System.out.println("zoo4 eval'd: " + evaluate(zoo4) );
      //...-4
/*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }//main

}//end class Scheme
