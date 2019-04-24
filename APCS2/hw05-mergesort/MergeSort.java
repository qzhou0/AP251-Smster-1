
/*======================================
Qian Zhou
APCS2 pd01
HW05 -- Step 1: Split, Step 2: ?, Step 3: Sorted!. . .
2018-02-06

  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm:
  Merge algorithm:
      1. Create two counters for the two input arrays (ac, bc) and one for the return array, which will be of the sum of the lengths of the input arrays, all starting from end
      2. if bc is smaller than the first position of that array, or if ac is bigger or equal to the first position and the value of ac in a is greater than the value of bc in b, then make the corresponding return array index be equal to a[ac]
      3. else do the same but set it equal to b[bc]
      4.  increment i by one until it is smaller than the first position of the returning array
  
  Sort algorithm:
      1. if recieved only an array of length one, return that value
      2. else
          a. make two arrays, one's length being the ceiling of half the length of the input array, the other the floor.
          b. fill the corresponding slots in each array with a value in the input array so that none is repeated
	  c. return the merge result of the result of the sort algorithm applied to these two arrays

  ======================================*/

public class MergeSort
{
  /******************************************************
   * int[] merge(int[],int[])
   * Merges two input arrays
   * Precond:  Input arrays are sorted in ascending order
   * Postcond: Input arrays unchanged, and
   * output array sorted in ascending order.
   ******************************************************/
  private static int[] merge( int[] a, int[] b )
  {
      int[] ar= new int[a.length+b.length];
      int ac = a.length-1;
      int bc = b.length-1;
      
      for (int i = ar.length-1; i>=0; i--){//O(n)
	  if (bc<0 || (ac >= 0 && a[ac] > b[bc])){
	      ar[i]=a[ac];
	      ac--;
	  }
	  else{
	      ar[i] = b[bc];
	      bc--;
	  }
      }
      return ar;
  }//end merge()


  /******************************************************
   * int[] sort(int[])
   * Sorts input array using mergesort algorithm
   * Returns sorted version of input array (ascending)
   ******************************************************/
  public static int[] sort( int[] arr )
  {
      if (arr.length ==1){
	  return arr;
      }
      else{
	  int[] a = new int[(int)(arr.length/2.0 + 0.5)];
	  int[] b = new int[arr.length/2];
	  for (int i = 0; i < arr.length; i++){//divides; O(n)
	      if (i < (int)(arr.length/2.0 + 0.5)){
		  a[i] = arr[i];
	      }
	      else{
		  b[i-a.length]= arr[i];
	      }
	  }
	  return merge(sort(a), sort(b));
	  //n +  2n + 2 [n/2 +   n +   2(n/4...
	  //divide  two sorts   and so on... 
	  //    merge   divide merge    
      }
	  
  }//end sort()



  //-------------------HELPERS-------------------------
  //tester function for exploring how arrays are passed
  //usage: print array, mess(array), print array. Whaddayasee?
  public static void mess( int[] a ) {
    for( int i = 0 ; i<a.length; i++ )
      a[i] = 0;
  }

  //helper method for displaying an array
  public static void printArray( int[] a ) {
    System.out.print("[");
    for( int i : a )
      System.out.print( i + ",");
    System.out.println("]");
  }
  //---------------------------------------------------


  //main method for testing
  public static void main( String [] args ) {

   
      int[] arr0 = {0};
      int[] arr1 = {1};
      int[] arr2 = {1,2};
      int[] arr3 = {3,4};
      int[] arr4 = {1,2,3,4};
      int[] arr5 = {4,3,2,1};
      int[] arr6 = {9,42,17,63,0,512,23};
      int[] arr7 = {9,42,17,63,0,9,512,23,9};

      System.out.println("\nTesting mess-with-array method...");
      printArray( arr3 );
      mess(arr3);
      printArray( arr3 );

      System.out.println("\nMerging arr1 and arr0: ");
      printArray( merge(arr1,arr0) );

      System.out.println("\nMerging arr4 and arr6: ");
      printArray( merge(arr4,arr6) );

      System.out.println("\nSorting arr4-7...");
      printArray( sort( arr4 ) );
      printArray( sort( arr5 ) );
      printArray( sort( arr6 ) );
      printArray( sort( arr7 ) );
 /*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class MergeSort
