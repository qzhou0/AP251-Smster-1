/*
Team (Lonely Island)/2 - Taaseen Ali, Calvin Aw, Qian Zhou
APCS2 pd01
HW 03 -- I Am Still Searching
2018-02-01

Precondition: All integers in the rows and columns of the matrix are strictly increasing
Postcondition: Returns coordinates of the first occurence of the integer or (-1,-1) if no such integer exists

Algorithm:
1) Start at the index (x, y) of the array being searched where x is the length 
the array and y is 0
2) if the element at (x, y) is larger than the item being searched for, decrement x by 1.
if the element at (x, y) is smaller than the item being searched for, increment y. by 1
if the element at (x, y) is equal to the element being searched for, return (x, y)
*/
public class MatrixFinder{
  public static void printMatrix(int[][] ar){
    System.out.println();
    System.out.println("=======================");
    for(int[] subAr: ar){
      for(int i: subAr){
        System.out.print(i + " ");
      }
      System.out.println();
    }
    System.out.println("-----------------------");
    System.out.println();
  }

  public static String search(int[][] ar, int target){
    int x = ar.length-1;
    int y = 0;
    while(x>=0 && y<ar.length){
      if(ar[y][x]>target){
        x--;
      }
      else if(ar[y][x]<target){
        y++;
      }
      else{
        return "("+y+", "+x+")"; 
      }
    }
    return "(-1,-1)";
  }

  public static void main(String args[]){
    int[][] test;
    test = new int[][]
    {{1,2,3,4},
    {2,3,4,5},
    {3,4,5,6},
    {4,5,6,7}};

    printMatrix(test);
    System.out.println("Trying to find the number 2");   
    System.out.println(" 2: " + search(test, 2));
    
    System.out.println("Trying to find the number 7");   
    System.out.println(" 7: " + search(test, 7));
    
    System.out.println("Trying to find the number 12");   
    System.out.println("12: " + search(test, 12));

    test = new int[][]
    {{1}};

    printMatrix(test);
    System.out.println("Trying to find the number 1");   
    System.out.println("1: " + search(test, 1));
    System.out.println("Trying to find the number 2");   
    System.out.println("2: " + search(test, 2));

    test = new int[][]
    {{1, 2, 5,12,15},
    {3, 7, 9,17,20},
    {4,12,13,18,21},
    {5,15,16,19,25},
    {7,17,19,21,26}};

    printMatrix(test);
    System.out.println("Trying to find the number 13");   
    System.out.println("13: " + search(test, 13));
    System.out.println("Trying to find the number 18");   
    System.out.println("18: " + search(test, 18));
    System.out.println("Trying to find the number 7");   
    System.out.println(" 7: " + search(test, 7));

  }
}
