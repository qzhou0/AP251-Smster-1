//Spooky -- Eddie Zhu, Qian Zhou
//APCS2 pd01
//HW35 -- ...Nor Do Aussies
//2018-04-16

import java.util.ArrayList;

public class ALQueue<E> implements Queue<E>{
    private ArrayList<E> _queue;
    private int _head,_tail,_initCap;//use of pointers informed by QAF post
    //initCap keep track of length so enqueue can clear useless memory space
    ALQueue(){
	_initCap = 10;
	_queue= new ArrayList(10);
	_head =0;
	_tail = -1;
    }

    public void enqueue(E x){
	if (_tail>=_initCap-1){//take chance of copying queue to get rid of wasted space, O(n) in situation triggered
	    _initCap*=2;
	    ArrayList<E> q = new ArrayList(_initCap);
	    
	    for (int i=_head; i<=_tail; i++){
		q.add(_queue.get(i));
	    }
	    q.add(x);
	    _head = 0;
	    _tail = q.size()-1;
	    _queue = q;
	}
	else {//O(1)
	    _queue.add(x);
	    _tail++;
	}
	    
    }
    public E dequeue(){//O(1)
	if (isEmpty()){return null;}
	return _queue.get(_head++);	
    }
    public E peekFront(){//O(1)
	if (isEmpty()){return null;}
	return _queue.get(_head);
    }
    
    public boolean isEmpty(){//O(1)
	return _head > _tail;
	
    }
    public String toString(){
	String s = "";
	for (int i = _head; i<=_tail; i++){
	    s+=_queue.get(i)+" , ";
	}
	return s;
    }
    public static void main(String[] args){
	ALQueue<String> q = new ALQueue();
	q.enqueue("trial 1");
	System.out.println(q.dequeue());
	System.out.println(q.dequeue());

	q.enqueue("trial 2");q.enqueue("Tuesday");
	System.out.println(q.dequeue());
	System.out.println(q.dequeue());
	System.out.println(q.dequeue());

	q.enqueue("trial 3");q.enqueue("Wednesday");q.enqueue("counting contest");
	for (int i =0; i<10; i++){
	    q.enqueue(i+"");
	}
	while (!q.isEmpty()){
	    System.out.println(q.dequeue());
	}
	System.out.println(q.dequeue());
	System.out.println(q);
	
	
    }
    
}
