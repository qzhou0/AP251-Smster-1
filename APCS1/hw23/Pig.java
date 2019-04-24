/*Les Trois Mousquetaires--Qian Zhou, Zane Wang, Lynne Wang
APCS1 pd01
HW23 -- Etterbay Odingcay Oughthray Ollaborationcay ...Ippyay.
2017-10-25
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

public class Pig
{
    //Q: How does this initialization make your life easier?
    private static final String VOWELS = "aeiou";
    
    
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
	w= w.toLowerCase();
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
    

    /*=====================================
    pre: w.length() > 0
    post: engToPig("apple")  --> "appleway"
          engToPig("strong") --> "ongstray"
          engToPig("java")   --> "avajay"
    =====================================*/
    public static String engToPig(String w) {
	if (beginsWithVowel(w)) {
	    return w + "way";
	}
	else {
	    int first = w.indexOf(firstVowel(w));
	    return w.substring(first) + w.substring(0,first) + "ay";
	}
    }

    
    public static void main( String[] args ) 
    {
	System.out.println(hasA("o","a"));//f
	System.out.println(hasA("oklahoma","a"));//t
	System.out.println(isAVowel("o"));//t
	System.out.println(isAVowel("d"));//f
	System.out.println(isAVowel("a"));//t
	System.out.println(isAVowel("u"));//t
	System.out.println(countVowels("o"));//1
	System.out.println(countVowels("his majesty"));//3
	System.out.println(countVowels("jasijdoa"));//4
	System.out.println(hasAVowel("o"));//t
	System.out.println(hasAVowel("nono"));//t
	System.out.println(hasAVowel("wh"));//f
	System.out.println(allVowels("o"));//o
	System.out.println(allVowels("bombastic"));//oai
	System.out.println(allVowels("noooooah"));//oooooa
	System.out.println(allVowels("hmmmmmmm"));//
	System.out.println(firstVowel("hmmmmmmm"));//
	System.out.println(firstVowel("bombastic"));//o
	System.out.println(beginsWithVowel("bombastic"));//f
	System.out.println(beginsWithVowel("oklahoma"));//t
	System.out.println(engToPig("bombastic"));//ombasticbay
	System.out.println(engToPig("thy"));//ombasticbay
	
    }//end main()
    
}//end class Pig
