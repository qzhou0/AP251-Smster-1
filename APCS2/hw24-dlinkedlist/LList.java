/*Qian Zhou
APCS2 pd01
HW24a -- On the DLL
2018-03-23
*/

public class LList implements List{
    private int _size;
    private DLLNode _head,_tail;


    LList(){
	_tail = null;
	_head = null;
	_size = 0;
    }

    public boolean add(String newVal){
	if (_size==0){
	    _head = new DLLNode(null, newVal, null);
	    _tail=_head;
	}

	else{
	    _tail=new DLLNode(_tail, newVal, null);	   
	}
	_size++;
	return true;
    }
    public String get(int index){
	DLLNode tmp = _head;
	for(int i = index; i>0;i--){
	    tmp = tmp.getPrev();
	}
	return tmp.getCargo();
    }
    public String set(int index, String newVal){
	DLLNode tmp = _head;
	for (int i = index; i>0;i--){
	    tmp.getPrev();
	}
	String old = tmp.getCargo();
	tmp.setCargo(newVal);
	return old;
	    
    }
    public int size(){
	return _size;
    }

    public String remove(int index){
	if(index<0||index>_size-1){
	    throw new IndexOutOfBoundsException();
	}
	if(index==0){
	    String old = _head.getCargo();
	    _head = _head.getNext();
	    _head.setPrev(null);
	    _size--;
	    return old;
	}
	else{
	    DLLNode tmp = _head;
	    for(int i = index; i>0;i--){
		tmp=tmp.getNext();
	    }
	    String old = tmp.getCargo();
	    tmp.getPrev().setNext(tmp.getNext());
	    tmp.setPrev(tmp.getPrev());
	    
	    _size--;
	    return old;
	}
    }

    public void add(int index, String newVal){
	if(index<0||index>_size-1){
	    throw new IndexOutOfBoundsException();
	}
	if(index ==0){
	    _head = new DLLNode(null, newVal, _head);
	    _size++;
	}
	else{
	    DLLNode tmp = _head;
	    for(int i = index;i>0;i--){
		tmp=tmp.getNext();
	    }
	    new DLLNode(tmp.getPrev(),newVal,tmp);
	    _size++;
	}
    }

    public String toString(){
	DLLNode tmp = _head;
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
