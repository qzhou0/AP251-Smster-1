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

public class DLLNode<T>{
    private T _cargo;    //cargo may only be of type String
    private DLLNode<T> _nextNode, _prevNode; //pointers to next, prev DLLNodes
    
    DLLNode(DLLNode<T> prev, T carg, DLLNode<T> next){
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
    
    public T getCargo(){
	return _cargo;
    }
    public DLLNode<T> getNext(){
	return _nextNode;
    }
    public DLLNode<T> getPrev(){
	return _prevNode;
    }

    public T setCargo(T cargo){
	T old = _cargo;
	_cargo = cargo;
	return old;
    }
    public DLLNode<T> setNext(DLLNode<T> n){
	DLLNode<T> old = _nextNode;
	_nextNode = n;
	return old;
    }
    public DLLNode<T> setPrev(DLLNode<T> n){
	DLLNode<T> old = _prevNode;
	_prevNode = n;
	return old;
    }
    public String toString(){
	return (String)_cargo;
    }
	
    
}//end class DLLNode
