//Qian Zhou
//APCS2 pd01
//HW32 -- Leon Leonwood Stack
//2018-04-11

import java.util.LinkedList;
class LLStack<P> implements Stack<P>{
    LinkedList<P> _stack;
    int _stackSize;
    
    LLStack(){
	_stack = new LinkedList();
	_stackSize = 0;
    }

    //Return true if this stack is empty, otherwise false.
    public boolean isEmpty(){
	return _stackSize == 0;
    }
    //Return top element of stack without popping it.
    public P peek(){
	if (_stackSize==0) return null;
	return _stack.get(_stackSize-1);
    }
    
    //Pop and return top element of stack.
    public P pop(){
	if (_stackSize==0) return null;	
	return _stack.remove(--_stackSize);
    }

    //Push an element onto top of this stack.
    public void	push( P x ){
	_stack.add(x);
	_stackSize++;
    }
}
