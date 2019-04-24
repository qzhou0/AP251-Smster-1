//Les Trois Mousquetaires--Qian Zhou, Zane Wang, Lynne Wang
//APCS1 pd01
//HW24 --  Imetay Otay Ineshay
//2017-10-25

/*
TO-DO:
Quotation marks issue - how to deal with first "? - "Hi!" returns iH"!"

EXPANSION SUMMARY:
endPunc(String w) - returns a string of the ending punctuation of a word w
rmPunc(String w) - returns a string w without ending punctuation
engToPig - considers y, consonant clusters, capitalization, and ending punctuation of a word

RELEVANT NOTES:
public int indexOf(String str):
- Returns index of the first occurrence of str in calling String (the String preceding ".")
- Returns -1 if str is not found
*/

/***
 * class Pig
 * a Pig Latin translator
 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [__
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
 ***/

import java.util.Scanner;

public class Pig
{
    //Q: How does this initialization make your life easier?
    private static final String VOWELS = "aeiou";
    private static final String PUNC = ".,:;-?!\"\"<>@#*()-+=~";
    //final - not changeable in code
    
    /*=====================================
      boolean hasA(String,String) -- checks for a letter in a String
      pre:  w != null, letter.length() == 1
      post: hasA("cat", "a") -> true
      hasA("cat", "p")       -> false
      =====================================*/
    public static boolean hasA( String w, String letter ) 
    {
	return (w.toLowerCase().indexOf(letter)>=0);
    }//end hasA()
    
    
    /*=====================================
      boolean isAVowel(String) -- tells whether a letter is a vowel
      precondition: letter.length() == 1
      =====================================*/
    public static boolean isAVowel( String letter ) 
    {
	letter=letter.toLowerCase();
	return VOWELS.indexOf(letter)>=0;

    }
    
    /*=====================================
      int countVowels(String) -- counts vowels in a String
      pre:  w != null
      post: countVowels("meatball") -> 3
      =====================================*/
    public static int countVowels( String w ) 
    {
	int retInt=0;
	for (int i=0; w.length()>i;i++){
	    if (isAVowel(w.substring(i,i+1))){
		retInt+=1;}
	}
	return retInt;
    }
    
    
    /*=====================================
      boolean hasAVowel(String) -- tells whether a String has a vowel
      pre:  w != null
      post: hasAVowel("cat") -> true
      hasAVowel("zzz")       -> false
    =====================================*/
    public static boolean hasAVowel( String w ) 
    {
	w = w.toLowerCase();
  	return countVowels(w)>0; }
    
    
    /*=====================================
      String allVowels(String) -- returns vowels in a String
      pre:  w != null
      post: allVowels("meatball") -> "eaa"
    =====================================*/
    public static String allVowels( String w ) 
    {
	String retStr="";
	for (int i = 0; w.length()>i; i++){
	    if (isAVowel(w.substring(i,i+1))){
		retStr+=w.substring(i,i+1);}
	}
	return retStr;
	
    }

    
    /*=====================================
    pre: w != null
    post: firstVowel("") --> ""
          firstVowel("zzz") --> ""
          firstVowel("meatball") --> "e"
    =====================================*/
    public static String firstVowel(String w) {
	if (hasAVowel(w)) {
	    return allVowels(w).substring(0,1);
	}
	else {
	    return "";
	}
    }// ends firstVowel


    /*=====================================    
    pre: w != null and w.length() > 0
    post: beginsWithVowel("apple")  --> true
          beginsWithVowel("strong") --> false
    =====================================*/
    public static boolean beginsWithVowel(String w) {
	return isAVowel(w.substring(0,1));
    }
    
    /*public static Boolean checkCaps(String w) {
	return w.substring(0,1).equals(w.substring(0,1).toLowerCase());
	}*/

    public static String endPunc(String w) {
	String retStr = "";
	for(int i = w.length()-1;hasA(PUNC,w.substring(i,i+1))  ; i--){

	    retStr = w.substring(i,i+1) + retStr;}
	return retStr;
    }
    public static String frontPunc(String w) {
	String retStr = "";

	for(int i = 0; hasA(PUNC,w.substring(i,i+1)) ; i++){
	    retStr+= w.substring(i,i+1) ;}

	return retStr;
    }

    public static String rmPunc(String w) {
	String retStr = w;
	for(int i = w.length()-1; i >= 0; i--)
	    if (hasA(PUNC,w.substring(i,i+1)))
		retStr = retStr.substring(0,i) + retStr.substring(i+1);
	return retStr;
    }
		

    /*=====================================
    pre: w.length() > 0
    post: engToPig("apple")  --> "appleway"
          engToPig("strong") --> "ongstray"
          engToPig("java")   --> "avajay"
    =====================================*/

    //hasA
    //isAVowel
    //countVowels
    //hasAVowel
    //allVowels
    //firstVowel
    //beginsWithVowel
    //checkCaps
    public static String engToPig(String w) {
        Boolean caps = true; //is the first letter capitalized?
	String endPunc = endPunc(w); //string of a word's ending punctuation
	String frontPunc = frontPunc(w);

	String wL = rmPunc(w.toLowerCase()); //string without ending punctuation
	String retStr = "";
	if (w.substring(0,1).equals(wL.substring(0,1))) //is the first letter capitalized?
	    caps = false;

	if (beginsWithVowel(wL)) //if string begins with vowel, return string + "way"
	    retStr = wL + "way";
	else if (hasAVowel(wL))
	    if (hasA(wL,"y"))
		if (wL.indexOf("y") < wL.indexOf(firstVowel(wL))) //y occurs before first vowel
		    retStr = wL.substring(wL.indexOf("y")) + wL.substring(0,wL.indexOf("y")) + "ay";
		else
		    retStr = wL.substring(wL.indexOf(firstVowel(wL))) + wL.substring(0,wL.indexOf(firstVowel(wL))) + "ay";
	    else //no y
		retStr = wL.substring(wL.indexOf(firstVowel(wL))) + wL.substring(0,wL.indexOf(firstVowel(wL))) + "ay";
	else
	    if (hasA(wL,"y"))
		retStr = wL.substring(wL.indexOf("y")) + wL.substring(0,wL.indexOf("y")) + "ay";
	    else
		retStr = wL + "ay";
	
	if (caps) //capitalizes first letter if necessary
	    return frontPunc+retStr.substring(0,1).toUpperCase() + retStr.substring(1) + endPunc;
	return frontPunc + retStr + endPunc; //adds punctuation (endPunc = empty string if no ending punc)
    }
    
    public static void main( String[] args ) 
    {
	Scanner sc = new Scanner(System.in);

	/*        //hasA test
	System.out.println("hasA:");
	System.out.println(hasA("trEE","e")); //t
	System.out.println(hasA("tree","i")); //f
	System.out.println(hasA("t","e")); //f
	System.out.println(hasA("t","T")); //t
	System.out.println(hasA("t","")); //t
	System.out.println(hasA("o","a"));//f
	System.out.println(hasA("oklahoma","a"));//t

	//isAVowel test
	System.out.println("\nisAVowel:"); 
	System.out.println(isAVowel("A")); //t
	System.out.println(isAVowel("p")); //f
	System.out.println(isAVowel("o"));//t
	System.out.println(isAVowel("d"));//f
	System.out.println(isAVowel("a"));//t
	System.out.println(isAVowel("u"));//t

	//countVowels test
	System.out.println("\ncountVowels:");
	System.out.println(countVowels("tree")); //2
	System.out.println(countVowels("lololOp")); //3
	System.out.println(countVowels("o"));//1
	System.out.println(countVowels("his majesty"));//3
	System.out.println(countVowels("jasijdoa"));//4

	//hasAVowel test
	System.out.println("\nhasAVowel:");
	System.out.println(hasAVowel("tree")); //t
	System.out.println(hasAVowel("trww")); //f
	System.out.println(hasAVowel("o"));//t
	System.out.println(hasAVowel("nono"));//t
	System.out.println(hasAVowel("wh"));//f

	//allVowels test
	System.out.println("\nallVowels:");
	System.out.println(allVowels("tree")); //ee
	System.out.println(allVowels("trrll")); //"" 
	System.out.println(allVowels("macAu")); //aau
	System.out.println(allVowels("o"));//o
	System.out.println(allVowels("bombastic"));//oai
	System.out.println(allVowels("noooooah"));//oooooa
	System.out.println(allVowels("hmmmmmmm"));//

	//firstVowel test
	System.out.println("\nfirstVowel:");
	System.out.println(firstVowel("hmmmmmmm"));//
	System.out.println(firstVowel("bombastic"));//o

	//beginsWithVowel test
	System.out.println("\nbeginsWithVowel:");
	System.out.println(beginsWithVowel("bombastic"));//f
	System.out.println(beginsWithVowel("oklahoma"));//t */

	//engToPig test
	System.out.println("\nengToPig:");
	while (sc.hasNext()) {
	    System.out.println(engToPig(sc.next()));
	}
	
    }//end main()
    
}//end class Pig
