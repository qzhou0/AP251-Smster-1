//Qian Zhou
//APCS2 pd01
//HW34 --  The English Do Not Wait In Line for Soup or Anything Else; They ¡°Queue Up¡±
//2018-04-13



public class NodeQueue <Q> implements  Queue<Q> {

    LLNode<Q> _head;
    LLNode<Q> _tail;

    NodeQueue(){
	_head = new LLNode(null, null);
    }
    //~~~~~~~~~~~~~~~~~~begin AP subset~~~~~~~~~~~~~~~~~~
    //means of removing an element from collection:
    //Dequeues and returns the first element of the queue.
    public Q dequeue(){
	if (isEmpty()){
	    return null;
	}
	else if (_head.getNext()==null){//if next is null, don't want _head to cease being a LLNode
	    Q v = _head.getValue();
	    _head.setValue(null);
	    return v;
	}
	else{
	    Q v = _head.getValue();
	    _head=_head.getNext();
	    return v;
	}

    }
    //means of adding an element to collection:
    //Enqueue an element onto the back of this queue.
    public void enqueue( Q x ){
	if (isEmpty()){
	    _head.setValue(x);
	    _tail = _head;
	}
	else{
	    _tail.setNext(new LLNode(x,null));
	    _tail = _tail.getNext();
	}
    }
    //Returns true if this queue is empty, otherwise returns false.
    public boolean isEmpty(){
	return _head.getValue()==null;
	}

    //Returns the first element of the queue without dequeuing it.
    public Q peekFront(){
	return _head.getValue();
    }
    //~~~~~~~~~~~~~~~~~~~end AP subset~~~~~~~~~~~~~~~~~~~
    public static void main(String[] args){
	NodeQueue<String> n = new NodeQueue();

	n.enqueue("start");
	
	System.out.println(n.dequeue());
	n.enqueue("novo");
	n.enqueue("duo");
	n.enqueue("trio");
	n.dequeue();
	n.enqueue("quarto");
	while (!n.isEmpty()){
    	    System.out.println(n.dequeue());
	}
	
	
    }

}//                                                              
