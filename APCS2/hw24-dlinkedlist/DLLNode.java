/*Qian Zhou
APCS2 pd01
HW24a -- On the DLL
2018-03-23
*/
/*****************************************************
 * class DLLNode
 * Implements a doubly-linked node,
 * for use in lists and other collection classes.
 * Stores data of type String
 *****************************************************/

public class DLLNode{
    private String _cargo;    //cargo may only be of type String
    private DLLNode _nextNode, _prevNode; //pointers to next, prev DLLNodes
    
    DLLNode(DLLNode prev, String carg, DLLNode next){
	_cargo = carg;
	_prevNode=prev;
	
	_nextNode=next;
	if(next!=null)
	next.setPrev(this);
	if(prev!=null)
	prev.setNext(this);
	//if(next!=null)
	//next.setPrev(this);
    }
    
    public String getCargo(){
	return _cargo;
    }
    public DLLNode getNext(){
	return _nextNode;
    }
    public DLLNode getPrev(){
	return _prevNode;
    }

    public String setCargo(String cargo){
	String old = _cargo;
	_cargo = cargo;
	return old;
    }
    public DLLNode setNext(DLLNode n){
	DLLNode old = _nextNode;
	_nextNode = n;
	return old;
    }
    public DLLNode setPrev(DLLNode n){
	DLLNode old = _prevNode;
	_prevNode = n;
	return old;
    }
    public String toString(){
	return _cargo;
    }
	
    
}//end class DLLNode
