//Qian Zhou
//APCS2 pd01
//HW17 -- So So Fast
//2018-03-09

/***
 * class FastSelect
 * code for mysterion taken from library
 * algorithm: repeat partition sort until the element at position y-1 before the * sort is equal to that after the sort
 * O(nlogn) worst, that is array is in random order, O(n) best with yth smallest number being in position y in the start.  
 **/

public class FastSelect
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



  public static int partition( int[] arr, int left, int right, int pvtPos)
  {
    int pvtVal = arr[pvtPos];

    swap( pvtPos, right, arr);
    int storPos = left;

    for( int i = left; i < right; i++ ) {
	    if ( arr[i] <= pvtVal) {
        swap( i, storPos, arr );
        storPos++;}
    }
    swap(storPos,right,arr);

    return storPos;
  }//variables copied from pseudo-code in QAF by OF
    
  public static int selection(int y, int[] arr){
      int s = arr[y-1];
      partition(arr, 0, arr.length-1, y-1);
      if (arr[y-1]==s){
	  return s;}
      System.out.println(s + " and " + arr[y-1]);
      return selection(y, arr);
  }


    public static int selectionCount(int y, int[] arr, int count){
      int s = arr[y-1];
      partition(arr, 0, arr.length-1, y-1);
      if (arr[y-1]==s){
	  return s;}
      System.out.print(count+" ");
      return selectionCount(y, arr, count+1);
  }
     public static int selectionCountNum(int y, int[] arr){
      int s = arr[y-1];
      partition(arr, 0, arr.length-1, y-1);
      if (arr[y-1]==s){
	  return 1;}
      return selectionCountNum(y, arr)+1;
  }
    
  //main method for testing
  public static void main( String[] args )
  {
    //init test arrays of magic numbers
    int[] arr1 = {8,21,17,69,343};
    int[] arr2 = buildArray(100, 1000);
    
    
    /*for (int i = 1; i<6; i++){
	printArr(arr1);
	System.out.println(selection(i, arr1));
	printArr(arr1);
	shuffle(arr1);
	}*/
    /*for(int i = 1; i < 101; i++){
	System.out.println("---  "+ i +" ---");
	System.out.println(selectionCount(i, arr2, 1));
	
	shuffle(arr2);
	}*/
    int[] arr3 = buildArray(1000, 10000);
    /*for(int i = 1; i < 1001; i++){
	System.out.print(i + " : "+selectionCountNum(i, arr3) + "\t" );
	//System.out.println(selectionCount(i, arr2, 1));
	
	shuffle(arr3);
	}*/
    for(int i = 1; i < 1001; i++){
	System.out.println(i + " : "+selectionCount(i, arr3, 1) + "\t" );
	//System.out.println(selectionCount(i, arr2, 1));
	
	shuffle(arr3);
    }
  }//end main

}//end class Mysterion
