//Qian Zhou
//APCS1 pd01
//HW41 -- Array of Steel
//2017-11-27
/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 ***************************/

public class SuperArray
{

  private int[] _data;  //underlying container
  private int _size;    //number of elements in this SuperArray


  //default constructor - initializes 10-item array
  public SuperArray()
  {
      _size = 10;//size could be changed easily
      _data = new int[_size];
   
  }


  //output SuperArray in [a,b,c] format
  public String toString()
    {
	String retStr="[";
	for (int i =0;i<_data.length;i++){
	    retStr += _data[i] + ",";}
	retStr = retStr.substring(0,retStr.length()-1);// to get rid of final ","
	retStr += "]";
	return retStr;
    }


  //double capacity of SuperArray
  private void expand()
  {
      _size *=2;
      int[] a1 = new int[_size/2];
      for (int i =0;i<a1.length;i++){// store stuff in new array
	  a1[i] = _data[i];
      }
      _data = new int[_size];//make new array twice the capacity
      for (int i =0;i<a1.length;i++){//repopulate the new array
	  _data[i] = a1[i];
      }
  }


  //accessor -- return value at specified index
  public int get( int index )
  {
      int retInt = _data[index];
      
      return retInt;
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
      int n=_data[index];
      _data[index]=newVal;
    
      return n;
  }


  //main method for testing
  public static void main( String[] args )
  {
    
      SuperArray curtis = new SuperArray();
      System.out.println( "Printing empty SuperArray curtis..." );
      System.out.println( curtis );

      for( int i = 0; i < curtis._data.length; i++ ) {
      curtis.set( i, i * 2 );
      }

      System.out.println("Printing populated SuperArray curtis...");
      System.out.println(curtis);

      for( int i = 0; i < 3; i++ ) {
      curtis.expand();
      System.out.println("Printing expanded SuperArray curtis...");
      System.out.println(curtis);
      }
/*~~~~~~~~move~me~down~~~~~~~~~~~~~~V~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~*/
  }//end main()


}//end class
