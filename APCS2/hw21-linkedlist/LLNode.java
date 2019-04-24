/*
Qian Zhou
APCS2 pd01
HW21B -- We Got a Little Ol¡¯ Convoy...
2018-03-19
*/
/*****************************************************
 * class LLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a String
 *****************************************************/

public class LLNode
{
    //instance vars
    private LLNode nextNode;
    private String cargoStorage;

    // constructor 
    LLNode(){
	nextNode = null;
	cargoStorage = "";
    }

    //--------------v  ACCESSORS  v--------------
    public String getCargo()
    {
	return cargoStorage;
    }

    public LLNode getNext()
    {
	return nextNode;
    }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public String setCargo(String newCargo)
    {
	String old = cargoStorage;
	cargoStorage = newCargo;
	return old;
    }

    public LLNode setNext(LLNode newNode)
    {
	LLNode old = nextNode;
	nextNode = newNode;
	return old;
    }
    //--------------^  MUTATORS  ^--------------


    // override inherited toString
    public String toString()
    {
	return "| "+cargoStorage+ " |*|-->"+ nextNode;
    }


    //main method for testing
    public static void main( String[] args )
    {
	LLNode n = new LLNode();
	System.out.println(n);
	n.setCargo("hi");
	LLNode m = new LLNode();
	n.setNext(m);
	m.setCargo("no");
	System.out.println(n);
	
    }//end main

}//end class LLNode
