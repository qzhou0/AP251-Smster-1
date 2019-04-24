/***
Qian Zhou
APCS2 pd01
HW10 - [Freddie Mercury, Brian May, Roger Taylor, John Deacon] x n
2018-02-27
 * class QueenBoard
 * Generates solutions for N-Queens problem.
 */

public class QueenBoard
{
  private int[][] _board;
    
  public QueenBoard( int size ) 
  {
    _board = new int[size][size];
  }

  
  /***
   * precondition: board is filled with 0's only.
   * postcondition: 
   * If a solution is found, board shows position of N queens, 
   * returns true.
   * If no solution, board is filled with 0's, 
   * returns false.
   */
  public boolean solve()
  {
      if (solveH(0)){
	  return true;}
    return false;
  }

  
  /**
   *Helper method for solve. 
   */
  private boolean solveH( int col ) 
  {
      if (col >= _board[0].length){
	  return true;}
      for (int i = 0; i<_board.length; i++){

	  if (_board[i][col] == 0){
	      addQueen(i, col);
	      if (solveH(col+1)){
		  return true;}
	      removeQueen(i, col);}
      } 
      return false;
  }


  public void printSolution()
  {
      String s="";
      for (int r = 0; r<_board.length; r++){
	  for (int c = 0; c<_board.length; c++){
	      if (_board[r][c] <= 0){
		  s += "_";
	      }
	      else if (_board[r][c] == 1){
		  s += "Q";}
	      s += "  ";//"\t";
	  }
	  s+= "\n";
      }
      System.out.println(s);
    /** Print board, a la toString...
        Except:
        all negs and 0's replaced with underscore
        all 1's replaced with 'Q'
    */
  }



  //================= YE OLDE SEPARATOR =================

  /***
   * <General description>
   * precondition: a queen is not in in (row, col), and that coordinate is occupiable
   * postcondition: a queen is added to (row, col), and its diagonal and horizontal right state space is rendered inoccupiable
   */
  private boolean addQueen(int row, int col){
    if(_board[row][col] != 0){
	    return false;
    }
    _board[row][col] = 1;
    int offset = 1;
    while(col+offset < _board[row].length){
	    _board[row][col+offset]--;
	    if(row - offset >= 0){
        _board[row-offset][col+offset]--;
	    }
	    if(row + offset < _board.length){
        _board[row+offset][col+offset]--;
	    }
	    offset++;
    }
    return true;
  }


  /***
   * <General description>
   * precondition: a queen is in (row, col)
   * postcondition:remove a queen and make its state space occupiable 
   */
  private boolean removeQueen(int row, int col){
    if ( _board[row][col] != 1 ) {
	    return false;
    }
    _board[row][col] = 0;
    int offset = 1;

    while( col+offset < _board[row].length ) {
	    _board[row][col+offset]++;
	    if( row - offset >= 0 ) {
        _board[row-offset][col+offset]++;
	    }
	    if( row + offset < _board.length ) {
        _board[row+offset][col+offset]++;
	    }
	    offset++;
    }
    return true;
  }


  /***
   * <General description>
   * precondition: 
   * postcondition: print out the board with queens represented as 1s, their range of attack to the right horizontally and diagonally by negative values, and empty free squares as 0s
   */
  public String  toString() 
  {
    String ans = "";
    for( int r = 0; r < _board.length; r++ ) {
	    for( int c = 0; c < _board[0].length; c++ ) {
        ans += _board[r][c]+"\t";
	    }
	    ans += "\n";
    }
    return ans;
  }


  //main method for testing...
  public static void main( String[] args )
  {
    QueenBoard I = new QueenBoard(1);
    QueenBoard II = new QueenBoard(2);
    QueenBoard III = new QueenBoard(3);
    QueenBoard IV = new QueenBoard(4);
    QueenBoard V = new QueenBoard(5);
    QueenBoard VI = new QueenBoard(6);
    QueenBoard VII = new QueenBoard(7);
    QueenBoard VIII = new QueenBoard(8);
    QueenBoard IX = new QueenBoard(9);
    QueenBoard X = new QueenBoard(10);
    QueenBoard XI = new QueenBoard(11);
    I.solve();II.solve();III.solve();IV.solve();
    V.solve();VI.solve();VII.solve();VIII.solve();
    IX.solve();X.solve();XI.solve();

    I.printSolution();II.printSolution();
    III.printSolution();IV.printSolution();V.printSolution();
    VI.printSolution();VII.printSolution();
    VIII.printSolution();IX.printSolution();
    X.printSolution();
    XI.printSolution();


   
    /*System.out.println(b);
    b.addQueen(3,0);
    b.addQueen(0,1);
    System.out.println(b);
    b.removeQueen(3,0);
    System.out.println(b);*/
    
  }
    
}//end class
