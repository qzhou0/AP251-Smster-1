//Qian Zhou
//APCS2 pd01
//HW16 -- About Face
//2018-03-07

public class Mysterion{

    /***
     * the parameter start(a) indicates the start of the region of array one wants to segregate, and end(b) indicates the last index of the region to be worked with. The parameter middle(c) represents the index of the value of the array, such that the function will make the array segregated in indeces [start, end] with all values smaller than the initial arr[c] left of it, and all values larger than arr[c] right of it.
     I claim this function is linear length.
     ***/
    
    public int segregator(int[] arr, int start, int end, int middle){
	int midVal = arr[middle];
	swap(arr, middle, end);
	int swaps = start;
        for (int i = 0; i < end-start; i++){
	    if (arr[start+i] <midVal){
		swap(arr, swaps, start+i);
		swaps++;
	    }
	}
	swap(arr, end, swaps);
	return swaps;
	
    }
    public int[] swap(int[] arr, int a, int b){
	int a1 = arr[a];
	arr[a] = arr[b];
	arr[b] = a1;
	return arr;
    }
    public void printArr(int[] arr){
	String s = "";
	for (int i : arr){
	    s += i +", ";
	}
	System.out.println(s);
    }
    public static void main(String[] args){
        Mysterion mu = new Mysterion();
	int[] ascens = {1,2,3,4,5};
	int[] descens = {5,4,3,2,1};
	int[] ran1 = {1,3,5,4,2};
	int[] ran2 = {3,5,2,1,4};
	int[] ascens6 = {1,2,3,4,5,6};
	int[] descens6 = {6,5,4,3,2,1};

	mu.printArr(ascens);
	System.out.println(mu.segregator(ascens, 0, 4, 2) );
	mu.printArr(ascens);

	System.out.println("------------------");

	mu.printArr(descens);
	System.out.println(mu.segregator(descens, 0, 4, 2) );
	mu.printArr(descens);

	System.out.println("------------------");

	mu.printArr(ran1);
	System.out.println(mu.segregator(ran1, 0, 4, 2) );
	mu.printArr(ran1);
	
	System.out.println("------------------");
	
	mu.printArr(ran2);
	System.out.println(mu.segregator(ran2, 0, 4, 2) );
	mu.printArr(ran2);
	
	System.out.println("------------------");
	
	mu.printArr(ascens6);
	System.out.println(mu.segregator(ascens6, 0, 5, 2) );
	mu.printArr(ascens6);
	
	//	System.out.println(mu.segregator(ascens6, 0, 5, 3) );

	System.out.println("------------------");
	
	mu.printArr(descens6);
	System.out.println(mu.segregator(descens6, 0, 5, 3) );
	mu.printArr(descens6);

	int [] descens7 ={7,6,5,4,3,2,1};
	System.out.println("------------------");
	
	mu.printArr(descens7);
	System.out.println(mu.segregator(descens7, 0, 6, 3) );
	mu.printArr(descens7);
    }

}
