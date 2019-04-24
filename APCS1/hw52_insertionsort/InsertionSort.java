/***************************************
 *  class InsertionSort -- implements InsertionSort algorithm
 ***************************************/
//Qian Zhou
//APCS1 pd01
//HW52 -- Poker Face
//2017-12-12
import java.util.ArrayList;

public class InsertionSort
{
  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond: lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
	    //     offset + rand int on interval [lo,hi]
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al ) {
    int randomIndex;
    for( int i = al.size()-1; i > 0; i-- ) {
	    //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
	    //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of InsertionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void insertionSortV( ArrayList<Comparable> data )
  { 
    if (data.size()<=1){
	return;}
    int lo,hi,guess,diff;
    Comparable target;
    for (int size=1;size<data.size(); size++){
	hi = size;
	lo = 0;
	guess = 0;
	target = data.get(size);
        System.out.println("\n"+data+ "\t size:"+size);
	while (lo<=hi){
	    guess = (hi+lo)/2;
	    //System.out.println("Target:"+target+"\t bounds: ["+lo+" , "+hi+"]"+"\tguess: "+guess);
	    
	    
	    diff = target.compareTo(data.get(guess));	    
	    if (diff ==0){
		lo=guess;
		break;}
	    else if (diff <0){//target should placed right
		hi = guess-1;}
	    else if(diff>0){//target should be placed left
		lo = guess+1;}
	}
	//System.out.println("final guess: "+guess);
        data.add(lo, data.remove(size));
	
    }
    
		
	
	    
      
  }//end insertionSortV


  // ArrayList-returning insertionSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable>
    insertionSort( ArrayList<Comparable> input )
  {
      ArrayList<Comparable> a=new ArrayList<Comparable>();
    for (Comparable c : input){
	a.add(c);
    }
    insertionSortV(a);
    return a;
  }//end insertionSort


  public static void main( String [] args )
  {
   
      System.out.println("\n*** Testing sort-in-place (void) version... *** ");
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "\nArrayList glen before sorting:\n" + glen );
      insertionSortV(glen);
      System.out.println( "\nArrayList glen after sorting:\n" + glen );

      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "\nArrayList coco before sorting:\n" + coco );
      insertionSortV(coco);
      System.out.println( "\nArrayList coco after sorting:\n" + coco );
      

   
      System.out.println( "*** Testing non-void version... *** " );
    	ArrayList gleanus = new ArrayList<Integer>();
      gleanus.add(7);
      gleanus.add(1);
      gleanus.add(5);
      gleanus.add(12);
      gleanus.add(3);
      System.out.println( "\nArrayList gleanus before sorting:\n" + gleanus );
      ArrayList gleanusSorted = insertionSort( gleanus );
      System.out.println( "\nsorted version of ArrayList gleanus:\n" 
      + gleanusSorted );
      System.out.println( "\nArrayList gleanus after sorting:\n" + gleanus );

      ArrayList cocou = populate( 10, 1, 1000 );
      System.out.println( "\nArrayList cocou before sorting:\n" + cocou );
      ArrayList cocouSorted = insertionSort( cocou );
      System.out.println( "\nsorted version of ArrayList cocou:\n" 
      + cocouSorted );
      System.out.println( "\nArrayList cocou after sorting:\n" + cocou );
      System.out.println( cocou );
      

  }//end main

}//end class InsertionSort
