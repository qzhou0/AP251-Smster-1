/*====================================
  class Matrix -- models a square matrix

  TASK: Implement methods below, categorize runtime of each. 
  Test in your main method.
  ====================================*/ 
//Qian Zhou
//APCS1 pd01
//HW57 -- How Deep Does the Rabbit Hole Go? ¡­bc you know, the red pill actually leads to leads to truth, not further delusion
//2017-12-19


public class Matrix 
{
  //constant for default matrix size
  private final static int DEFAULT_SIZE = 2;

  private Object[][] matrix;

  //default constructor intializes a DEFAULT_SIZE*DEFAULT_SIZE matrix
  public Matrix( ) 
	{
       matrix = new Object[DEFAULT_SIZE][DEFAULT_SIZE];
  }


  //constructor intializes an a*a matrix
  public Matrix( int a )
        {
       matrix = new Object[a][a];
	}


  //return size of this matrix, where size is 1 dimension
  private int size() 
  {
      return matrix.length * matrix.length;
  }


  //return the item at the specified row & column   
  private Object get( int r, int c ) 
  {
      return matrix[r][c];
  }


  //return true if this matrix is empty, false otherwise
  private boolean isEmpty() 
  {
      for (Object[] or:matrix){
	  for(Object o :or){
	      if (!(o==null))
		  {return false;}
	  }
      }
      return true;
  }


  //overwrite item at specified row and column with newVal
  //return old value
  private Object set( int r, int c, Object newVal ) 
  {
      Object oldVal = matrix[r-1][c-1];
      matrix[r-1][c-1] = newVal;
      return oldVal;
  }


  //return String representation of this matrix
  // (make it look like a matrix)
  public String toString()
  {
      String retStr="----------------------------------------------------------|\n";
      for (Object[] ao :matrix){
	  retStr += "\n|---------------------------------------|\n|";
	  for (Object o:ao){
	      retStr +=" [ "+o+ " ] ";
	  }
	  
      }
      return retStr;
      
  }


  //override inherited equals method
  //criteria for equality: matrices have identical dimensions,
  // and identical values in each slot
  public boolean equals( Object rightSide ) 
  {
      if(this.size() != ((Matrix)rightSide).size()){return false;}
      for (int j = 0; j< Math.sqrt(this.size()); j++){
	  for (int i = 0; i < Math.sqrt(this.size()); i++){
	      if (!this.get(j,i).equals(((Matrix)rightSide).get(j,i))){
		  return false;}
	  }
      }
      return true;

  }


  //swap two columns of this matrix 
  //(1,1) is top left corner of matrix
  //row values increase going down
  //column value increase L-to-R
  public void swapColumns( int c1, int c2  ) 
  {
      Object oc;
      for (Object[] r : matrix){
	  oc = r[c1-1] ;
	  r[c1-1]=r[c2-1];
	  r[c2-1]=oc;
      }
      
  }


  //swap two rows of this matrix 
  //(1,1) is top left corner of matrix
  //row values increase going down
  //column value increase L-to-R
  public void swapRows( int r1, int r2  ) 
  {
      Object[] or1= matrix[r1-1];
      matrix[r1-1]=matrix[r2-1];
      matrix[r2-1]=or1;
      
  }


  //main method for testing
  public static void main( String[] args ) 
  {
      Matrix m = new Matrix();
      System.out.println("m isempty? yes?" + m.isEmpty());
      Matrix n = new Matrix(3);
      Matrix v = new Matrix(2);
      for (int i = 1; i<3;i++){
	  for(int j = 1; j<3; j++){
	      double r = Math.random();
	      m.set(j,i,(Object)r);
	      v.set(j,i,(Object) r);
	      n.set(j,i,j*3+i);
	  }
      }
      System.out.println("n isempty? yes?" + n.isEmpty());
      System.out.println("n=m?...no?   "+n.equals(m));
      System.out.println("v=m?...yes?   "+v.equals(m));
      System.out.println("n:\n" +n);
      n.swapColumns(1,3);
      System.out.println("n post swap columns:\n"+n);
      n.swapRows(2,1);
      System.out.println("n post swap rows:\n"+n);
      
  }

}//end class Matrix
