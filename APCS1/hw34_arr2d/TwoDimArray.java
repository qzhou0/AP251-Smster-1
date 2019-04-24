/******************************
 * class TwoDimArray
 * (skeleton)
 * practice working with 2D arrays
 ******************************/

// Qian Zhou
// APCS1 pd01
// HW34 -- 2D arrays
// 2017-11-17

public class TwoDimArray
{
  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOR loop
  public static void print1( int[][] a )
    {String s ;
    // *** YOUR IMPLEMENTATION HERE ***
	for (int i1 = 0; i1 < a.length; i1++){//row
	  s ="";
	  for (int i2 = 0; i2 < a[i1].length; i2 ++){//column of each row
	      s += a[i1][i2] + " ";}
	  System.out.println(s);}//print finished row
    }



  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOREACH loop
  public static void print2( int[][] a )
    {String s;
    // *** YOUR IMPLEMENTATION HERE ***
	for(int[] a1:a){//row
	    s="";
	    for (int n : a1){//column of each row
		s += n + " ";}
	    System.out.println(s);}//finshed row
    }


  //postcond: returns sum of all items in 2D int array a
  public static int sum1( int[][] a )
    { int retInt = 0;
    // *** YOUR IMPLEMENTATION HERE ***
	for(int[]a1:a){//row
	    for (int i2 = 0; i2 < a1.length; i2++){//column of each row
		retInt += a1[i2];
	    }
	}
	return retInt;
	    
  }


  //postcond: returns sum of all items in 2D int array a
  //          * uses helper fxn sumRow
  public static int sum2( int [][] m )
    {int retInt=0;
    // *** YOUR IMPLEMENTATION HERE ***
	for (int i =0; i<m.length; i++){//each row
	    retInt += sumRow(i, m);
	}
	return retInt;
	  
  }


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOR loop
  public static int sumRow( int r, int[][] a )
    {int retInt=0;
    // *** YOUR IMPLEMENTATION HERE ***
	for (int i = 0; i <  a[r].length; i++){//each int in column
	  retInt += a[r][i];
      }
      return retInt;
  }


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOREACH loop
  public static int sumRow2(int r, int[][] m)
  {
    // *** YOUR IMPLEMENTATION HERE ***
      int retInt =0;
      for (int n : m[r]){//each integer of row r
	  retInt +=n;}
      return retInt;
  }


  public static void main( String [] args )
  {
   
      int [][] m1 = new int[4][2];
      int [][] m2 = { {2,4,6}, {3,5,7} };
      int [][] m3 = { {2}, {4,6}, {1,3,5} };
      print1(m1);
      print1(m2);
      print1(m3);
      print2(m1);
      print2(m2);
      print2(m3);
      System.out.print("testing sum1...\n");
      System.out.println("sum m1 : " + sum1(m1));
      System.out.println("sum m2 : " + sum1(m2));//27
      System.out.println("sum m3 : " + sum1(m3));//21
      System.out.print("testing sum2...\n");
      System.out.println("sum m1 : " + sum2(m1));
      System.out.println("sum m2 : " + sum2(m2));
      System.out.println("sum m3 : " + sum2(m3));
 /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }

}//end class TwoDimArray
