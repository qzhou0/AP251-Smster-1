/***************************************
 * class SelectionSort -- implements SelectionSort algorithm
 ***************************************/
//Qian Zhou
//APCS1 pd01
//HW51 -- Selection
//2017-12-11
import java.util.ArrayList;

public class SelectionSort 
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


  // VOID version of SelectionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void selectionSortV( ArrayList<Comparable> data ) 
  {   
      int minIn;
      for(int i = 0; i<data.size()-1; i++){
	  minIn = i;
	  for (int g = i+1; g<data.size(); g++)
	      if (data.get(minIn).compareTo(data.get(g))>0){minIn=g;}
	  data.set(i, data.set(minIn, data.get(i)));
      }
	  
  }//end selectionSortV


  // ArrayList-returning selectionSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable>
    selectionSort( ArrayList<Comparable> input ) 
  {
      ArrayList<Comparable> output=new ArrayList<Comparable>();
      for(Comparable c:input)
	  output.add(c);
      selectionSortV(output);
      return output;
  }//end selectionSort 


  public static void main( String [] args ) 
  {
    ArrayList glen = new ArrayList<Integer>();
    glen.add(7);
    glen.add(1);
    glen.add(5);
    glen.add(12);
    glen.add(3);
    System.out.println( "ArrayList glen before sorting:\n" + glen );
    selectionSortV(glen);
    System.out.println( "ArrayList glen after sorting:\n" + glen );

    
      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      selectionSortV(coco);
      System.out.println( "ArrayList coco after sorting:\n" + coco );
    /*===============for VOID methods=============
  ============================================*/

    
    	ArrayList gleanus = new ArrayList<Integer>();
      gleanus.add(7);
      gleanus.add(1);
      gleanus.add(5);
      gleanus.add(12);
      gleanus.add(3);
      System.out.println( "ArrayList gleanus before sorting:\n" + gleanus );
      ArrayList gleanusSorted = selectionSort( gleanus );
      System.out.println( "sorted version of ArrayList gleanus:\n" 
      + gleanusSorted );
      System.out.println( "ArrayList gleanus after sorting:\n" + gleanus );

      ArrayList Cocau = populate( 10, 1, 1000 );
      System.out.println( "ArrayList Cocau before sorting:\n" + Cocau );
      ArrayList CocauSorted = selectionSort( Cocau );
      System.out.println( "sorted version of ArrayList Cocau:\n" 
      + CocauSorted );
      System.out.println( "ArrayList Cocau after sorting:\n" + Cocau );
      System.out.println( Cocau );
/*==========for AL-returning methods==========
      ============================================*/

  }//end main

}//end class SelectionSort
