/* Qian Zhou
APCS1 pd01
HW25 -- All Hallow's Eve
2017-10-31*/
//import java.util.Arrays;// Ahnaf Hasan's answer to George Liang's QAF post was very helpful.
public class Loopier{
    
    public static void populate(int[] tp){//A static method to populate an existing array with randomly generated ints.
	for (int i = 0;i<tp.length;i++){
	    tp[i]=(int)(Math.random()*10);//generate 0-1
	}
    }
    public static String retString(int[] array){// A static method to return a String version of an array of ints.
	String retStr ="";
	for (int i = 0; i<array.length;i++){
	    retStr+= array[i];
	}
	return retStr;
	    
    }
    // Two public, static implementations of a linear search function that will return the index of the first occurrence of a target in an existing array, or -1 if not found. (First version iterates, second recurses.
    public static int linSearch( int[] a, int target ){
	for (int i = 0; i<a.length;i++){
	    if (a[i]==target){
		return i;}
	}
	return -1;
    }
    
    public static int linSearchR( int[] a, int target ){

	if (a.length==0){
	    return -1;}
	int[] arr = new int[a.length-1];
	for (int i=0; i<arr.length;i++){
	    arr[i]=a[i];}
	if (a[a.length-1]== target){
	    if (linSearchR(arr/*Arrays.copyOfRange(a,0,a.length-1)*/,target) == -1)
		{return a.length-1;}
	    else {
		return Math.min(linSearchR(/*(Arrays.copyOfRange(a,0,a.length-1)*/arr,target),a.length-1);}}
	else
	    {return linSearchR(/*Arrays.copyOfRange(a,0,a.length-1)*/arr,target);}

	    
	}
    //Two public, static implementations of a frequency function that will return the number of occurrences of a target in an existing array. (First version iterates, second recurses.)
    public static int freq( int[] a, int target ){
	int retInt=0;
	for (int i = 0; i<a.length;i++){
	    if (a[i]==target){
		retInt+=1;}
	}
	return retInt;
    }

    public static int freqRec( int[] a, int target ){
	if (a.length==0){
	    return 0;}
	int[] arr=new int[a.length-1];
	for (int i=0; i<arr.length;i++){
	    arr[i]=a[i];}
	if (a[a.length-1] == target){
	    return 1+freqRec(/*Arrays.copyOfRange(a,0,a.length-1)*/arr,target);}
	return freqRec(/*Arrays.copyOfRange(a,0,a.length-1)*/arr,target);
    }
    public static void main(String[] args){
	int[] arr = new int[10];
	populate(arr);
	System.out.println(retString(arr));
	System.out.println(linSearchR(arr,1));
	System.out.println(linSearch(arr,5));
	System.out.println(freq(arr,1));
	System.out.println(freqRec(arr,5));
	
	
	
	
    }
}
