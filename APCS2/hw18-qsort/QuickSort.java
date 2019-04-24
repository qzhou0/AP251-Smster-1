//Qian Zhou
//APCS2 pd0
//HW18 -- QuickSort
//2018-03-13t
  
/*****************************************************
 * class QuickSort
 * Implements quicksort algo to sort an array of ints in place
 *
 * 1. Summary of QuickSort algorithm:
 * QSort(arr): 
 *    i) call helper function with input array, left, and right
 *   ii) helper function determines if left is smaller than right
 *  iii) if is smaller than right, then array is partitioned at with pivot    *         value at right, then helper function called again for both halves  *         of the array on either side of the storPos of partition
 *
 *
 * 2a. Worst pivot choice and associated runtime: 
 * 
 * 2b. Best pivot choice and associated runtime:
 *
 * There is no best or worst pivot choice since either way every value must 
 * be touched by the helper function, and the initial input is random. O(n^2) * runtime since every two calls would stimulate a partition of n-1. n+(n-1)+ * ...+0 = n/2; n/2* n = (n^2)/2 = O(n^2)
 * 3. Approach to handling duplicate values in array:
 * Duplicate values are seen as greater than each other as in the partition f * unction the division is made by <=
 *****************************************************/

public class QuickSort
{
  //--------------v  HELPER METHODS  v--------------
  //swap values at indices x, y in array o
  public static void swap( int x, int y, int[] o ) {
    int tmp = o[x];
    o[x] = o[y];
    o[y] = tmp;
  }

  //print input array 
  public static void printArr( int[] a ) {
    for ( int o : a )
	    System.out.print( o + " " );
    System.out.println();
  }

  //shuffle elements of input array
  public static void shuffle( int[] d ) {
    int tmp;
    int swapPos;
    for( int i = 0; i < d.length; i++ ) {
	    tmp = d[i];
	    swapPos = i + (int)( (d.length - i) * Math.random() );
	    swap( i, swapPos, d );
    }
  }

  //return int array of size s, with each element fr range [0,maxVal)
  public static int[] buildArray( int s, int maxVal ) {
    int[] retArr = new int[s];
    for( int i = 0; i < retArr.length; i++ )
	    retArr[i] = (int)( maxVal * Math.random() );
    return retArr;
  }
  //--------------^  HELPER METHODS  ^--------------


  // partition
    public static int partition(int[]arr, int left, int right, int pvtPos){
	int pvtVal = arr[pvtPos];
	swap(pvtPos, right, arr);
	int storPos = left;
	for (int i = left; i < right; i++){
	    if (arr[i]<=pvtVal){
		swap(i, storPos, arr);
		storPos++;
	    }
	}
	swap(right, storPos, arr);
	return storPos;
    }
	
  /*****************************************************
   * void qsort(int[])
   * @param d -- array of ints to be sorted in place
   *****************************************************/
  public static void qsort( int[] d )
  { 
      qsortH(d, 0, d.length-1);
  }
  public static void qsortH(int[] arr, int left, int right){
      if (left < right){
	  
	 int  pvtPos = partition(arr, left, right,right);
printArr(arr);
	 qsortH(arr, left, pvtPos -1);
	  qsortH(arr, pvtPos+1, right);
	  
      }
  }
  //you may need a helper method...


  //main method for testing
  public static void main( String[] args )
  {
   

    //get-it-up-and-running, static test case:
    int [] arr1 = {7,1,5,12,3};
    System.out.println("\narr1 init'd to: " );
    printArr(arr1);

    qsort( arr1 );	
    System.out.println("arr1 after qsort: " );
    printArr(arr1);

    // randomly-generated arrays of n distinct vals
    int[] arrN = new int[10];
    for( int i = 0; i < arrN.length; i++ )
    arrN[i] = i;
       
    System.out.println("\narrN init'd to: " );
    printArr(arrN);

    shuffle(arrN);
    System.out.println("arrN post-shuffle: " );
    printArr(arrN);

    qsort( arrN );
    System.out.println("arrN after sort: " );
    printArr(arrN);
 /*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y) 
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/


    

    //get-it-up-and-running, static test case w/ dupes:
    int [] arr2 = {7,1,5,12,3,7};
    System.out.println("\narr2 init'd to: " );
    printArr(arr2);

    qsort( arr2 );	
    System.out.println("arr2 after qsort: " );
    printArr(arr2);


    // arrays of randomly generated ints
    int[] arrMatey = new int[20];
    for( int i = 0; i < arrMatey.length; i++ )
    arrMatey[i] = (int)( 48 * Math.random() );
       
    System.out.println("\narrMatey init'd to: " );
    printArr(arrMatey);

    shuffle(arrMatey);
    System.out.println("arrMatey post-shuffle: " );
    printArr(arrMatey);

    qsort( arrMatey );
    System.out.println("arrMatey after sort: " );
    printArr(arrMatey);
    /*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y) 
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

  }//end main

}//end class QuickSort
