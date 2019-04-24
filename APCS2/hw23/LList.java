/* 
banana--Qian Zhou, Victor Lin
APCS2 pd01
HW23 -- Give and Take
2018-03-22
 */
/*****************************************************
 * class LList
 * Implements a linked list of LLNodes, each containing String data
 *****************************************************/

public class LList implements List //your List interface must be in same dir
{ 

    //instance vars
    private LLNode _head;
    private int _size;

    // constructor -- initializes instance vars
    public LList()
    {
		_head = null; //at birth, a list has no elements
		_size = 0;
    }


    //--------------v  List interface methods  v--------------
    
    public boolean add( String newVal )
    {
		LLNode tmp = new LLNode( newVal, _head );
		_head = tmp;
		_size++;
		return true;
    }

    
    public String get( int index )
    {
		if ( index < 0 || index >= size() )
		    throw new IndexOutOfBoundsException();

		String retVal;
		LLNode tmp = _head; //create alias to head

		//walk to desired node
		for( int i=0; i < index; i++ )
		    tmp = tmp.getNext();

		//check target node's cargo hold
		retVal = tmp.getCargo();
		return retVal;
    }


    public String set( int index, String newVal )
    {

		if ( index < 0 || index >= size() )
		    throw new IndexOutOfBoundsException();

		LLNode tmp = _head; //create alias to head

		//walk to desired node
		for( int i=0; i < index; i++ )
		    tmp = tmp.getNext();

		//store target node's cargo
		String oldVal = tmp.getCargo();

		//modify target node's cargo
		tmp.setCargo( newVal );

		return oldVal;
    }


    //return number of nodes in list
    public int size() { return _size; }
    
    //--------------^  List interface methods  ^--------------


    // override inherited toString
    public String toString()
    {
		String retStr = "HEAD->";
		LLNode tmp = _head; //init tr
		while( tmp != null ) {
		    retStr += tmp.getCargo() + "->";
		    tmp = tmp.getNext();
		}
		retStr += "NULL";
		return retStr;
    }


        //insert a node containing newVal at position index

    public void add( int index, String newVal ){
    	if(index < 0 || index >= size())
	    throw new IndexOutOfBoundsException();
	if (index ==0)
	    add(newVal);
	else{
	    LLNode temp = _head;
	    for(int i=index;i>1;i--)
		temp = temp.getNext();
	    temp.setNext(new LLNode(newVal, temp.getNext()));
	}
	_size++;
    }


    //remove node at pos index, return its cargo

    public String remove( int index ){
    	if(index < 0 || index >= size())
	    throw new IndexOutOfBoundsException();
	LLNode temp = _head;
	for(int i=index;i>0;i--){
	    temp = temp.getNext();
	}
	String retStr = temp.getCargo();
	temp.setCargo(temp.getNext().getCargo());
	temp.setNext(temp.getNext().getNext());
	_size--;
	return retStr;
    }
    
    //main method for testing
    public static void main( String[] args )
    {
		LList james = new LList();
		james.add("one");james.add("two");james.add("three");james.add("four");
		james.add("five");james.add("six");james.add("seven");james.add("eight");
		System.out.println(james);
		james.add(5,"quartus");
		System.out.println(james);
		james.remove(0);
		System.out.println(james);
		james.add(0,"octo");
		System.out.println(james);
		james.remove(0);
		System.out.println(james);

    }

}//end class LList


