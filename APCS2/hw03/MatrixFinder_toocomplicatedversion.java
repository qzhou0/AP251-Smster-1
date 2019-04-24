/*
Team (Lonely Island)/2 - Taaseen Ali, Calvin Aw, Qian Zhou
APCS2 pd01
HW 03 -- I Am Still Searching
2018-02-01

1) Start at the indeces R(Rr, Rc) and C(Cr, Cc) of the array being searched where Rr and Cc are the length-1 and Rc and Cr are 0 
the array and y is 0
2) if either Rr and Cc should reach below zero, then the item is not found
3) if R is the target, then return that value; 
else if R is lower than the target and Rc is lower than Cc, increase Rc by 1
else decrease Rr by 1
4)if C is the target then return the value
else if C is lower than the target and Cr is lower than Rr, increase Cr by 1 
else decrease Cc by 1
5) repeat 2-4 until end
*/

public class MatrixFinder{
  
  public String searcher(int[][] arr, int target){
      int Rr=arr.length-1; int Cc=arr[0].length-1;//counters
      int Rc=0; int Cr = 0;//move inwards
    String retStr="";

    int n = 0; //counter
    while (true){
	if (Rr <0 || Cc <0){//check if all hope is lost
	    retStr+= "(-1,-1)";
	    break;
	}
	/*else{
	    if (Rc > Cc){
	    Rc = 0;
	    Rr -=1;
	    }
	    if(Cr>Rr){
	    Cr = 0;
	    Cr -=1;
	    }
	    }*/
	// update counter starting from lower-left corner
	System.out.println("row driver:"+ Rr + ","+Rc);
	System.out.println("col driver:"+ Cr + ","+Cc);
	if (arr[Rr][Rc] == target){
	    retStr+="(" + Rr + "," + Rc+ ")";
	    break;
	}
	else if (arr[Rr][Rc] < target&& Rc < Cc){
	    Rc +=1;
	}
	else { Rr-=1;Rc=0;}
	System.out.println("row driver:"+ Rr + ","+Rc);
	System.out.println("col driver:"+ Cr + ","+Cc);
	if (arr[Cr][Cc]== target){// update from upper-right corner
	    retStr+="("+Cr+","+Cc+")";
	    break;
	}
	else if(arr[Cr][Cc] < target && Cr < Rr){
	    Cr+=1;
	}
	else{Cr=0;Cc-=1;}
	n++;
	System.out.println(n);
    }
    return retStr;
  }

  public String search(int[][] ar, int target){
    int x = ar.length-1;
    int y = 0;
    int n = 0;
    while(x>=0 && y<ar.length){
	n++;
	System.out.println(n);
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
    
  public static void main(String[] args){
      int[][]a1={{1,2,3},
		 {4,5,7},
		 {6,8,10}};
      int[][]a2={{1,4,7},
		 {2,5,10},
		 {4,8,12}};
      int[][]a3={{1,5,12,31},
		 {2,6,13,32},
		 {4,25,26,42},
		 {26,31,42,83}
      };
      MatrixFinder hic= new MatrixFinder();

      System.out.println(hic.searcher(a1,6));
      System.out.println(hic.searcher(a2,10));
      System.out.println(hic.searcher(a2,5));
      System.out.println(hic.searcher(a2,7));
      
      System.out.println(hic.searcher(a3,42));
      System.out.println(hic.searcher(a3,83));
      System.out.println(hic.searcher(a3,31));
      System.out.println(hic.searcher(a3,26));
      System.out.println(hic.searcher(a3,1));
      System.out.println(hic.searcher(a3,54));
    int[][] test =
    {{1, 2, 5,12,15},
    {3, 7, 9,17,20},
    {4,12,13,18,21},
    {5,14,15,19,25},
    {16,17,19,21,26}};

    
    System.out.println("Trying to find the number 13");   
    System.out.println("13: " + hic.searcher(test, 13));
    System.out.println("Trying to find the number 18");   
    System.out.println("18: " + hic.searcher(test, 18));
    System.out.println("Trying to find the number 7");   
    System.out.println(" 7: " + hic.searcher(test, 7));

    int[][] n = {{1}};
    System.out.println(" happy new year!");
    System.out.println(hic.searcher(n, 7));
    System.out.println(hic.searcher(n, 1));


    System.out.println("English class!?");
    
    System.out.println(hic.search(a1,6));
      System.out.println(hic.search(a2,10));
      System.out.println(hic.search(a2,5));
      System.out.println(hic.search(a2,7));
      
      System.out.println(hic.search(test,16));
      System.out.println(hic.searcher(test,16));

      System.out.println(hic.search(test,2));
      System.out.println(hic.searcher(test,2));

  }
  
  
}
