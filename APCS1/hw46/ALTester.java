//Qian Zhou
//APCS pd01
//hw46 --Al<B> Sorted!. 
//2017-12-04
import java.util.ArrayList;
public class ALTester {
    public static boolean isSorted(ArrayList<Comparable> r){
	boolean retBoo=true;
	Comparable nextVal;
	for(int i = 0; i<r.size() -2; i++){
	    nextVal = r.get(i+1);
	    retBoo = retBoo && r.get(i).compareTo(nextVal) <=0;
	}
	if (retBoo){
	    return retBoo;}
	else {
	    retBoo = true;
	    for(int i = r.size()-1; i>1; i--){
		nextVal = r.get(i-1);
		retBoo = retBoo && r.get(i).compareTo(nextVal)<=0;}
	}
	return retBoo;
    }
   public static void main(String[] args) {
      ArrayList<Comparable> a = new ArrayList<Comparable>();
      for (int i =  0; i < 23; i++){
	  a.add(i,(int)(Math.random()*10));}
      System.out.println(a);
      System.out.println(isSorted(a));
      ArrayList<Comparable> b = new  ArrayList<Comparable>();
      for (int i =  0; i < 23; i++){
	  b.add(i,23-i);}
      System.out.println(b);
      System.out.println(isSorted(b));
      ArrayList<Comparable> c  = new  ArrayList<Comparable>();
      for (int i =  0; i < 23; i++){
	  c.add(i,0);}
      System.out.println(c);
      System.out.println(isSorted(c));
      System.out.println("hi");
   }
}
