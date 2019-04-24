/********************************
 * class OrderedArrayList
 * wrapper class for ArrayList.
 * Imposes the restriction that stored items 
 * must remain sorted in ascending order
 ********************************/
//Qian Zhou
//APCS1 pd01
//HW 49 -- Havling the Halves
//2017-12-07
//ArrayList's implementation is in the java.util package
import java.util.ArrayList;

public class OrderedArrayList
{
  // instance of class ArrayList, holding objects of type Comparable 
  // (ie, instances of a class that implements interface Comparable)
  private ArrayList<Comparable> _data;


  // default constructor initializes instance variable _data
  public OrderedArrayList()
  {
    _data = new ArrayList<Comparable>();    
  }


  public String toString()
  {
    return _data.toString(); 
  }


  public Comparable remove( int index )
  {	
    return _data.remove(index); 
  }


  public int size()
  { 
    return _data.size();
  }

    
  public Comparable get( int index )
  { 
    return _data.get(index); 
  }


  /***
   * add takes as input any comparable object 
   * (i.e., any object of a class implementing interface Comparable)
   * inserts newVal at the appropriate index
   * maintains ascending order of elements
   * uses a linear search to find appropriate index
   ***/
  public void add( Comparable newVal )
  { 
    for( int p = 0; p < _data.size(); p++ ) {
	    if ( newVal.compareTo( _data.get(p) ) < 0 ) { 
        //newVal < oal[p]
        _data.add( p, newVal );
        return; //Q:why not break?
	    }
    }
    _data.add( newVal ); //newVal > every item in oal, so add to end 
  }

    public void addBin(Comparable newVal){
	System.out.println(newVal);
	int lo=0;
	int hi=_data.size()-1;
	int i = (int)(hi/2.0 + 0.5);
        double cUp,cDown;
	while (true){
	    System.out.println(i);
	    if (i==  _data.size()-1){
		_data.add(newVal);
		break;
	    }

	    cDown  = _data.get(i).compareTo(newVal);
	    cUp =  _data.get(i+1).compareTo(newVal);

	    if (cDown <=0 && cUp >=0){
		_data.add(i+1, newVal);
		break;
	    }
	    else if (i == 0){
		_data.add(0,newVal);
		break;}
	    else if (cDown<0 && cUp<0){
		lo = i+1;}	        
	    else if (cDown>0 && cUp>0){
		hi = i-1;}

	    i = lo +(int)(((hi - lo)/2.0)+0.5);
	}			     
    }


  // main method solely for testing purposes
  public static void main( String[] args )
  {
    OrderedArrayList Franz = new OrderedArrayList();

    // testing linear search
    for( int i = 0; i < 15; i++ )
	Franz.add( (int)(50 * Math.random() )*2 );//even
    System.out.println( Franz );
    // testing addBin
    for(int i  = 0; i<15; i++)
	Franz.addBin( ( ((int)(49*Math.random())) *2)+1);//odd
    Franz.addBin(0);
    System.out.println(Franz);
  
   
  }//end main()

}//end class OrderedArrayList
