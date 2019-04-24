/*Qian Zhou
APCS1 pd01
HW24 -- Otnay Ybay ethay Airhay Onway Ymay Inneechay Inchay Inchay
2017-10-24
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
    
      for (int count = 0;count < w.length();count ++){
	  if (w.substring(count, count+1).equals(letter)){
	      return true;}}
      return false;

  }//end hasA()


  /*=====================================
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    =====================================*/
  public static boolean isAVowel( String letter ) 
    {
      for (int i = 0; i <5; i++){
	  if (VOWELS.substring(i,i+1).equals(letter)){
	      return true;}
      }
      return false;

  }

  /*=====================================
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    =====================================*/
  public static int countVowels( String w ) 
    {int retInt=0;
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
  
      for (int i=0; w.length()>i;i++){
	  if (isAVowel(w.substring(i,i+1))){
	      return true;}
      }
      return false;
  }


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


  public static void main( String[] args ) 
    { System.out.println(hasA("o","a"));
      System.out.println(hasA("oklahima","a"));
      System.out.println(isAVowel("o"));
      System.out.println(isAVowel("d"));
      System.out.println(isAVowel("a"));
      System.out.println(isAVowel("u"));
      System.out.println(countVowels("o"));
      System.out.println(countVowels("his majesty"));//3
      System.out.println(countVowels("jasijdoa"));//4
      System.out.println(hasAVowel("o"));
      System.out.println(hasAVowel("nono"));
      System.out.println(hasAVowel("wh"));
      System.out.println(allVowels("o"));
      System.out.println(allVowels("bombastic"));
      System.out.println(allVowels("noooooah"));
      System.out.println(allVowels("hmmmmmmm"));
  }//end main()

}//end class Pig
