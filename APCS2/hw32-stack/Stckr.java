//Qian Zhou
//APCS2 pd01
//HW32 -- Leon Leonwood Stack
//2018-04-11
/*****************************************************
 * class Stckr
* driver/tester for Stack implementations (Linked-list-based, ArrayList-based)
 *****************************************************/

public class Stckr 
{
public static void main( String[] args )
{
    Stack<String/*Integer*/> a = new ALStack();
    Stack<String/*Integer*/> l = new LLStack();
    for (int i =0;i<26; i++){
	a.push(i+1+"");
	l.push(i+50+"");
    }
    System.out.println(a.peek());//26
    System.out.println(l.peek());//76
    for(int i = 0; i<12; i++){
	System.out.print(a.pop()+" ");
    }//26-15
    for(int i = 0; i<12; i++){
	a.push(""+l.pop());//will flip amount added to
    }
    while(!l.isEmpty()){
	System.out.print(l.pop()+" ");
    }//63-50
    while (!a.isEmpty()){
	System.out.print(a.pop()+" ");
    }//64-76+14-1
    System.out.print(a.pop()+" "+a.peek());//null null
    l.push(881+"");
    System.out.println(l.pop()+" "+l.pop());
    
    
    
}

}//end class

