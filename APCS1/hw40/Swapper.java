//Qian Zhou
//APCS pd01
//HW40 -- Make it better
//2017-11-25
/* ----------------------------------
**an overloaded that takes two parameters for the two dimensions
**strGen() generate 3-4 character strings 
**populate() populates the 2D array
**swap() swaps two locations
**display() displays the 2D array
**play() launches the display of the arrays and enables someone to swap two strings from two locatiions
   ------------------------------*/
/*---------------------------------------------------
 Improvements:
** instructions more rigorous
** instance variable array made private
** newArr method made if want to make a new array
** looping structure for switching
** allows user to make a new string if bored with old one, and exit the game
----------------------------------------------------*/
import cs1.Keyboard;

public class Swapper{
    // the array to be displayed
    private String[][] arr;

    
    // overloadedConstructor specifying dimensions
    public Swapper(int a1, int s){
	arr = new String[a1][s];
    }
    // if want to make new array
    public void newArr(int a1, int s){
	arr = new String[a1][s];
	this.populate();
    }
    
    
    //generates String of 3-4 characters
    public String strGen(){
	String retStr = "";
	String character = "abcdefghijklmnopqrstuvwyxyzABCDEFGHIJKLMNOPQRSTUVWXYZ,./;'[]\\=-0987654321`~!@#$%^&*()_+|}{:\"?><";
	int max = (int)(Math.random() * 2) + 3;// random int 3 or 4
	while (retStr.length() < max){
	    int i = (int)(Math.random() * character.length());//random char
	    
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
	    retStr += "\n row "+ row + " :";
	    int column = 0;
	    for (String s : a1){
		
		retStr += "column "+ column+":" +" [ " + s + " ] ";
		column +=1;
	    }
	    row +=1;
	}
	return retStr;
    }
    
    // swaps string in location row r1 column c1 and row r2 and column c2
    public void swap(int r1, int c1, int r2, int c2){
	String l1, l2;
	l1 = arr[r1][c1];
	l2 = arr[r2][c2];
	arr[r1][c1] = l2;
	arr[r2][c2]= l1;
    }
    
    public boolean play(){
	System.out.println(this.display());
	System.out.println("Do you want a new array or do you want to stop? (y/n/s)");
	String ans="";
	try {
	    ans = Keyboard.readWord();
	}
	catch (Exception e){}
	if (ans.equals("y")){
	    
 	    System.out.println("Please enter an integer number of rows greater than 0 you want your new array to have");
	    int r=1;
	    try{
		r = Keyboard.readInt();}
	    catch(Exception e){}
	    
	    System.out.println("Please enter an integer number of columns greater than 0 you want your new array to have");
	    int c = 1;
	    try{
		c = Keyboard.readInt();}
	    catch(Exception e){}
	    if (r>0 && c >0){
		this.newArr(r,c);
	    }
	    return true;
	}
	else if(ans.equals("s")){return false;}
	else{
		
	int r1=0,r2=0,c1=0,c2 = 0;
	System.out.println("Please enter the row number of the first location, between 0 and " + ((this.arr.length)-1)+", else default to 0");
	int k;
	try{
	    k = Keyboard.readInt();
	    if (k < this.arr.length){ 
		r1 = k;}}
	catch(Exception e){}
	

	System.out.println("Please enter the column  number of the first location, between 0 and " + ((this.arr[0].length)-1)+", else default to 0");
	try{
	    k = Keyboard.readInt();	
	    if (k < this.arr[0].length){
		c1 = k;}}
	catch(Exception e){}
	System.out.println("Please enter the row number of the second location, between 0 and" + ((this.arr.length)-1)+", else default to 0");
	try{k = Keyboard.readInt();
	    if (k< this.arr.length){
		r2 = k;}}
	catch(Exception e){}

	System.out.println("Please enter the column  number of the second location, between 0 and" + ((this.arr[0].length)-1)+", else default to 0");
	try{k = Keyboard.readInt();
	    if (k< this.arr[0].length){
		c2 = k;}}
	catch(Exception e){}
	
	
	this.swap(r1,c1,r2,c2);
	/*	System.out.println(this.display());*/
	}
	return true;
    }
    
    public static void main(String[] args){
	
	int in;
	int r=1;
	int c=1;
	System.out.println("Please enter an integer greater than zero of rows you would like, else default to 1");
	try{in = Keyboard.readInt();
	    if (in> 0){
		r = in;}}
	catch(Exception e){}
	System.out.println("Please enter an integer greater than zero of columns you would like, else default to 1");
	try{in = Keyboard.readInt();
	    if (in> 0){
		c = in;}}
	catch(Exception e){}
	Swapper w = new Swapper(r,c);
	w.populate();
	boolean con= true;
	while (con){
	    con =  w.play();}

    }
}
