//Qian Zhou
//APCS pd01
//HW38 -- Put It Together
//2017-11-21
/* ----------------------------------
**an overloaded that takes two parameters for the two dimensions
**strGen() generate 3-4 character strings 
**populate() populates the 2D array
**swap() swaps two locations
**display() displays the 2D array
**play() launches the display of the arrays and enables someone to swap two strings from two locatiions
   ------------------------------*/
import cs1.Keyboard;

public class Swapper{
    // the array to be displayed
    String[][] arr;
    // Constructor specifying dimensions
    public Swapper(int a1, int s){
	arr = new String[a1][s];
    }
    
    //generates String of 3-4 characters
    public String strGen(){
	String retStr = "";
	String character = "abcdefghijklmnopqrstuvwyxyzABCDEFGHIJKLMNOPQRSTUVWXYZ,./;'[]\\=-0987654321`~!@#$%^&*()_+|}{:\"?><";
	int max = (int)(Math.random() * 2) + 3;
	while (retStr.length() < max){
	    int i = (int)(Math.random() * character.length());
	    
	    retStr += character.substring(i, i+1);
	}
	return retStr;
    }
    
    //populates existing array
    public void populate(){
	for (String[] a1 : arr){
	    for (int i = 0; i < a1.length; i++){
		  a1[i] = strGen();
	    }
	}
    }
    
    // displays array
    public String display(){
	String retStr = "";
	int row = 0;
	for (String[] a1 : arr){
	    retStr += "\n row "+ row + ":";
	    int column = 0;
	    for (String s : a1){
		
		retStr += "column "+ column+":" +" [ " + s + " ] ";
		column +=1;
	    }
	    row +=1;
	}
	return retStr;
    }
    public void swap(int r1, int c1, int r2, int c2){
	String l1, l2;
	l1 = arr[r1][c1];
	l2 = arr[r2][c2];
	arr[r1][c1] = l2;
	arr[r2][c2]= l1;
    }
	
    public void play(){
	System.out.println(this.display());
	int r1=0,r2=0,c1=0,c2 = 0;
	System.out.println("Please enter the row number of the first location, between 0 and" + ((this.arr.length)-1));
	int k;
	try{
	    k = Keyboard.readInt();
	    if (k < this.arr.length){ 
		r1 = k;}}
	catch(Exception e){}
	

	System.out.println("Please enter the column  number of the first location, between 0 and" + ((this.arr[0].length)-1));
	try{
	    k = Keyboard.readInt();	
	    if (k < this.arr[0].length){
		c1 = k;}}
	catch(Exception e){}
	System.out.println("Please enter the row number of the second location, between 0 and" + ((this.arr.length)-1));
	try{k = Keyboard.readInt();
	    if (k< this.arr.length){
		r2 = k;}}
	catch(Exception e){}

	System.out.println("Please enter the column  number of the second location, between 0 and" + ((this.arr[0].length)-1));
	try{k = Keyboard.readInt();
	    if (k< this.arr[0].length){
		c2 = k;}}
	catch(Exception e){}
	
	System.out.println("Please wait");
	this.swap(r1,c1,r2,c2);
	System.out.println(this.display());
    }
    public static void main(String[] args){
	Swapper w = new Swapper(3,4);
	w.populate();
	w.play();
	/*
	System.out.println(w.display());
	int r1=0,r2=0,c1=0,c2 = 0;
	System.out.println("Please enter the row number of the first location, between 0 and" + ((w.arr.length)-1));
	int k;
	try{
	    k = Keyboard.readInt();
	    if (k < w.arr.length){ 
		r1 = k;}}
	catch(Exception e){}
	

	System.out.println("Please enter the column  number of the first location, between 0 and" + ((w.arr[0].length)-1));
	try{
	    k = Keyboard.readInt();	
	    if (k < w.arr[0].length){
		c1 = k;}}
	catch(Exception e){}
	System.out.println("Please enter the row number of the second location, between 0 and" + ((w.arr.length)-1));
	try{k = Keyboard.readInt();
	    if (k< w.arr.length){
		r2 = k;}}
	catch(Exception e){}

	System.out.println("Please enter the column  number of the second location, between 0 and" + ((w.arr[0].length)-1));
	try{k = Keyboard.readInt();
	    if (k< w.arr[0].length){
		c2 = k;}}
	catch(Exception e){}
	
	System.out.println("Please wait");
	w.swap(r1,c1,r2,c2);
	System.out.println(w.display());
	*/
    }
}
