//Qian Zhou
//APCS2 pd01
//HW34 --  The English Do Not Wait In Line for Soup or Anything Else; They ¡°Queue Up¡±
//2018-04-13
/*****************************************************
 * interface Queue
 * Includes only methods listed in AP subset of Java
 * (Local version, to override built-in Java implementation.)
 ******************************************************/


public interface Queue<Quasar> {

    //~~~~~~~~~~~~~~~~~~begin AP subset~~~~~~~~~~~~~~~~~~
    //means of removing an element from collection:
    //Dequeues and returns the first element of the queue.
    public Quasar dequeue();

    //means of adding an element to collection:
    //Enqueue an element onto the back of this queue.
    public void enqueue( Quasar x );

    //Returns true if this queue is empty, otherwise returns false.
    public boolean isEmpty();

    //Returns the first element of the queue without dequeuing it.
    public Quasar peekFront();
    //~~~~~~~~~~~~~~~~~~~end AP subset~~~~~~~~~~~~~~~~~~~


}//end interface Queue                                                                                           
