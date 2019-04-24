//Qian Zhou
//APCS2 pd01
//HW51 -- Heaping Piles of Sordidness
//2018-05-19

public class HeapSort{

    //want a maxheap for right to left
    public void heapify(int[] arr){
	for (int part = 1;part<arr.length;part++){//part for partition, O(n)
	    for (int i = part;i>=0&&arr[i]>arr[(i-1)/2];i=(i-1)/2){//bubbling up algo, O(logn)
		swap(arr, i, (i-1)/2);
	    }
	}
    }
    public void swap(int[] arr, int in1, int in2){
	int val1 = arr[in1];
	arr[in1]=arr[in2];
	arr[in2]=val1;
    }
    public void sort(int[]a){
	heapify(a);//O(nlogn)
	for (int part = a.length-1;part>=0;part--){//sorted region, O(n)
	    //removal algo O(logn)
	    int i = 0;
	    int next = maxChildof(a,i,part);
	    while (next!=-1){//bubbling algo O(n)
		swap(a,i,next);
		i = next;
		next = maxChildof(a, next, part);
	    }
	    swap(a,i,part);
	    
	}//O(nlogn)
	//O(nlogn)+O(nlogn)=O(nlogn)
	
	
    }

    public int maxChildof(int[] arr, int index, int limit){
	if (index *2+1>limit) return -1;
	if (index*2+2>limit || arr[index*2+1]>arr[index*2+2]){
	    return index*2+1;
	}
	return index*2+2;
    }

    public void print(int[]arr){
	String s ="";
	for (int n :arr){
	    s+=n +" ";
	}
	System.out.println(s);
    }
    public static void main(String[] args){
	HeapSort t = new HeapSort();
	int[] a = {15,1,3,5,2,6,8,10,7};
	t.sort(a);t.print(a);
	int[]b={10,1};
	t.sort(b);t.print(b);
	int[] c={100,99,98,97,96,5,4,3,2,1,0,-1};
	t.sort(c);t.print(c);
	int[] d={1};
	t.sort(d);t.print(d);
	
    }
}
