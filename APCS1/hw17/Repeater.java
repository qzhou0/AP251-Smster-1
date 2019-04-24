/*Qian Zhou 
APCS1 pd01
HW17 -- Do I repeat myself?
2017-10-16*/

public class Repeater{
    public static void main (String[] args){
	System.out.println("=======While loop test====");
        System.out.println(fenceW(1));
	System.out.println(fenceW(2));
	System.out.println(fenceW(3));
	System.out.println(fenceW(4));
	System.out.println("=======recursion test====");
	System.out.println(fenceR(1));
	System.out.println(fenceR(2));
	System.out.println(fenceR(3));
	System.out.println(fenceR(4)); 
	
       
	    
    }
    public static String fenceW(int numPosts){
	String retStr="";
	while (numPosts != 1){
		retStr+="|--";
		numPosts-=1;
	    }
	retStr += "|";
        return retStr;}

	    
    public static String fenceR(int numPosts){
	/*An alternative way
	String retStr="|";
	if (numPosts != 1){
	    retStr+= "--"+ fenceR(numPosts-1) ;
	    return retStr;
	    //return "|";
	}
	else {
	return retStr;}*/
	String retStr = "";
	if (numPosts == 1){
	    return "|";
	}
	else{
	    retStr+= fenceR(numPosts -1 )+"--|";
	}
	return retStr;

    }
}
