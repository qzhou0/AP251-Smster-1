//Team Eh We Haven't-- Aidan Griffin, Qian Zhou
//APCS1 pd01
//HW55 --  Never Fear, Big Oh Is Here!
//2017-12-14

import java.util.ArrayList;

public class MySorts{
    //add(Comparable) is O(n)
    //public void add(Comparable)

    //addBin(Comparable) is on the order of log2(n).
    //public void addBin(Comparable)

    //Insertion sort is O(n) in its best case scenario, and O(n^2) for its worst case scenario.
    //Best case scenario would be an array already sorted  in ascending order so only n passes would be needed,for the traversion from right to left would be broken as soon as it got in.
x    //but in a worst case scenario the array would be sorted in descending order so every pass would set the loop within the loop in motion back to index 0 which would need n(n+1)/2 swaps, as the partition increases the distance to index 0 increases as well.
    public static void insertionSort( ArrayList<Comparable> data )
    {
	for( int partition = 1; partition < data.size(); partition++ ) {
	    //partition marks first item in unsorted region

	    //diag:
	    System.out.println( "\npartition: " + partition + "\tdataset:");
	    System.out.println( data ); 

	    //traverse sorted region from right to left
	    for( int i = partition; i > 0; i-- ) {

		// "walk" the current item to where it belongs
		// by swapping adjacent items
		if ( data.get(i).compareTo( data.get(i-1) ) < 0 ) {
		    //diag:
		    System.out.println( "swap indices "+(i-1)+" & "+i+"..." );
		    data.set( i, data.set( i-1, data.get(i) ) ); 
		}
		else 
		    break; 
	    }
	}
    }//ENd insertionSortV

    //Selection Sort is O(n^2) no matter best or worst case scenario, if there be such difference, because the outside loop will run through the array of size n n-1 times and and the inner loop will run through the array from index 1 to index pass every pass, so it will have a total of (n-1)(n-1)/2 times, which simplifies to n^2. 
    public static void selectionSort( ArrayList<Comparable> data ) 
    {
	//note: this version places greatest value at rightmost end,
	
	//maxPos will point to position of SELECTION (greatest value)
	int maxPos;
	
	for( int pass = data.size()-1; pass > 0; pass-- ) {
	    System.out.println( "\nbegin pass " + (data.size()-pass) );//diag
	    maxPos = 0;
	    for( int i = 1; i <= pass; i++ ) {
		System.out.println( "maxPos: " + maxPos );//diag
		//System.out.println( data );//diag
		if ( data.get(i).compareTo( data.get(maxPos) ) > 0 )
		    maxPos = i;
	    }
	    data.set( maxPos, ( data.set( pass, data.get(maxPos) ) ) );
	    System.out.println( "after swap: " +  data );//diag
	}
    }//end selectionSortV

    //bubbleSort is O(n^2) because it makes n-1 passes across the collection each time to make another iteration from the first to the next-to-last element, resulting in (n-1)(n-2) times which simplifies to n^2.
    public static void bubbleSort( ArrayList<Comparable> data )
	{
	    //make n-1 passes across collection
	    for( int passCtr = 1; passCtr < data.size(); passCtr++ ) {
		System.out.println( "commencing pass #" + passCtr + "..." );

		//iterate from first to next-to-last element
		for( int i = 0; i < data.size()-1; i++ ) {
		    //if element at i > element at i+1, swap
		    if ( data.get(i).compareTo(data.get(i+1) ) > 0 ) 
			data.set( i, data.set(i+1,data.get(i)) );	
		    //System.out.println(data); //diag: show current state of list
		}
	    }
	}//End bubbleSOrtV

    }
