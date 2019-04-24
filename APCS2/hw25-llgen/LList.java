/*Qian Zhou
APCS2 pd01
HW24a -- On the DLL
2018-03-23
*/

public class LList<T> implements List<T>{
    private int _size;
    private DLLNode<T> _head,_tail;


    LList(){
	_tail = null;
	_head = null;
	_size = 0;
    }

    public boolean add(T newVal){
	if (_size==0){
	    _head = new DLLNode<T>(null, newVal, null);
	    _tail=_head;
	}

	else{
	    _tail=new DLLNode<T>(_tail, newVal, null);	   
	}
	_size++;
	return true;
    }
    public T get(int index){
	DLLNode<T> tmp = _head;
	for(int i = index; i>0;i--){
	    tmp = tmp.getPrev();
	}
	return tmp.getCargo();
    }
    public T set(int index, T newVal){
	DLLNode<T> tmp = _head;
	for (int i = index; i>0;i--){
	    tmp.getPrev();
	}
	T old = tmp.getCargo();
	tmp.setCargo(newVal);
	return old;
	    
    }
    public int size(){
	return _size;
    }

    public T remove(int index){
	if(index<0||index>_size-1){
	    throw new IndexOutOfBoundsException();
	}
	if(index==0){
	    T old = _head.getCargo();
	    _head = _head.getNext();
	    _head.setPrev(null);
	    _size--;
	    return old;
	}
	else{
	    DLLNode<T> tmp = _head;
	    for(int i = index; i>0;i--){
		tmp=tmp.getNext();
	    }
	    T old = tmp.getCargo();
	    tmp.getPrev().setNext(tmp.getNext());
	    tmp.setPrev(tmp.getPrev());
	    
	    _size--;
	    return old;
	}
    }

    public void add(int index, T newVal){
	if(index<0||index>_size-1){
	    throw new IndexOutOfBoundsException();
	}
	if(index ==0){
	    _head = new DLLNode<T>(null, newVal, _head);
	    _size++;
	}
	else{
	    DLLNode<T> tmp = _head;
	    for(int i = index;i>0;i--){
		tmp=tmp.getNext();
	    }
	    new DLLNode<T>(tmp.getPrev(),newVal,tmp);
	    _size++;
	}
    }

    public String toString(){
	DLLNode<T> tmp = _head;
	String s = "NULL->";
	for (int i = 1;i<=_size;i++){
	    s+=tmp+"->";
	    //if(tmp!=null){
		
		tmp=tmp.getNext();}
	//}
	s+="NULL";
	return s;
    }
    
    
}
