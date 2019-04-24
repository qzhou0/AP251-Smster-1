// Qian Zhou
// APCS1 pd01
//HW02--Howdy <interesting person>?
//2017-09-16

public class Greet {
    public static void main(String[] args){
        greet(new String []{ "Mr. SAT" });
        greet(new String []{ "Amice" });
        greet(new String []{"Magister" });
	
    }
    
   public static void greet(String[] name){
       System.out.println( "Why hello there " + name[0] + " how is it going");
	}
 

    }
/* References:
https://stackoverflow.com/questions/11973505/what-is-the-difference-between-string-and-string-in-java
I learnedd how to fix this error (by the new String[] {args}stuff):
 error: incompatible types: String cannot be converted to String[]
Another time when I changed the main(String[]...) to main (String...),it said it expected the String[] in that place. I'm still confused over that.
http://www.learnjavaonline.org/en/Functions
I learned that you need a return type in class, and what is the difference between class and method, and that return still exists in java
https://stackoverflow.com/questions/890966/what-is-string-args-parameter-in-main-method-java 
I learned how to use arguments in this*/

