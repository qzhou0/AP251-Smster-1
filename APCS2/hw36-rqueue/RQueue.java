//Qian Zhou
//APCS2 pd01
//HW36 -- Now Let¡¯s Consider You Lot at Fake Terry¡¯s
//2018-04-17
/*****************************************************
 * class RQueue
 * A linked-list-based, randomized queue
 * (a collection with FIIDKO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 *
 *  linkages point opposite direction for O(1) en/dequeuing
 *            N <- N <- ... <- N <- N
 *      _end -^                     ^- _front
 *
 ******************************************************/


public class RQueue<T> implements Queue<T>
{
  //instance variables
  private LLNode<T> _front, _end;
  private int _size;


  // default constructor creates an empty queue
  public RQueue() 
	{
	    _front = new LLNode(null, null);
	    _end = _front;
	    _size = 0;
	}//end default constructor


  public void enqueue( T enQVal ) 
  {
      //I think a circular structure described in a QAF post yesterday is needed as in class there's a specification of sample() to walk the _front to a random index, which would lead to loss of data if there's no additional pointer pointing to that node
      if (isEmpty()){//only one value, both front and end
	  _front.setValue(enQVal);
	  _end = _front;
      }
      else if(_end.equals(_front)){
	  //special case as need to set end is now front, and need to set itself pointing to _front, instead as the next Value
	  _end = new LLNode(enQVal, _front);
	  _front.setNext(_end);
	  // end --> front --> end
      }
      else{	 
	  _end.setNext(new LLNode(enQVal, _front));
	  _end=_end.getNext();
      }
      _size++;
  }//end enqueue()


  // remove and return thing at front of queue
  // assume _queue ! empty
  public T dequeue() 
    {//O(n) due to sample()
      if (isEmpty()){//for test case conveniance
	  return null;
      }
      sample();//notice from RC and JW's QAF post
      T r = _front.getValue();
      if (_size==1){//both would be the same value here, with the next pointing to the other
	  
	  _front.setValue(null);
	  _front.setNext(null);
	  
      }
      else{
	  
	  _front = _front.getNext();
	  _end.setNext(_front);
      }
      _size --;
      return r;
  }//end dequeue()


  public T peekFront() 
  {
      return _front.getValue();
  }


  /******************************************
   * void sample() -- a means of "shuffling" the queue
   * Algo:for a random integer value below size, shift front and end to the next   * until done this random value of times
   ******************************************/
  public void sample () 
  {
      
      for (int j = (int)(Math.random() *_size); j >0; j--){//O(n)
	  _front=_front.getNext();
	  _end=_end.getNext();
      }
  }//end sample()


  public boolean isEmpty() 
  {
      return _size==0;
  } //O(1)


    // print each node, separated by spaces
  public String toString() 
  { 
      String s = "";
      LLNode<T> alias = _front;
      while (!alias.equals(_end)){
	  s += alias.getValue();
	  s += " ";
	  alias=alias.getNext();
      }
      return s + alias.getValue();
  
      
     
  }//end toString()



  //main method for testing
  public static void main( String[] args )
  {
    

      Queue<String> PirateQueue = new RQueue<String>();

      System.out.println("\nnow enqueuing..."); 
      PirateQueue.enqueue("Dread");
      PirateQueue.enqueue("Pirate");
      PirateQueue.enqueue("Robert");
      PirateQueue.enqueue("Blackbeard");
      PirateQueue.enqueue("Peter");
      PirateQueue.enqueue("Stuyvesant");

      System.out.println("\nnow testing toString()..."); 
      System.out.println( PirateQueue ); //for testing toString()...

      ((RQueue)PirateQueue).sample();
      System.out.println("\nnow dequeuing..."); 
      System.out.println( PirateQueue.dequeue() );
      System.out.println( PirateQueue.dequeue() );
      System.out.println( PirateQueue.dequeue() );
      System.out.println( PirateQueue.dequeue() );
      System.out.println( PirateQueue.dequeue() );
      System.out.println( PirateQueue.dequeue() );

      System.out.println("\nnow dequeuing fr empty queue..."); 
      System.out.println( PirateQueue.dequeue() );
      PirateQueue.enqueue("Dread");
      PirateQueue.enqueue("Pirate");
      PirateQueue.enqueue("Robert");
         
      System.out.println(PirateQueue.dequeue() );
      System.out.println(PirateQueue.dequeue() );
      PirateQueue.enqueue("Blackbeard");
      System.out.println( PirateQueue );
      ((RQueue)PirateQueue).sample();
      System.out.println( PirateQueue );
      System.out.println(PirateQueue.dequeue() );
      ((RQueue)PirateQueue).sample();
      System.out.println( PirateQueue );
      System.out.println(PirateQueue.dequeue() );
      
      
/*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main

}//end class RQueue
