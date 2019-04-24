/* Qian Zhou
APCS pd01
HW20 --  For the Lulz Love of Strings
2017-10-19*/
public class Foresrever{
    public static String fenceF(int posts){	String finalFence = "";
	for (; posts != 1; posts --){
	    finalFence+="|--";	}
	return finalFence+="|";    }
    public static  String reverseF(String s){	String retString="";
	for (int start = s.length()-1; start != -1;start --){
	    retString += s.substring(start, start+1);	}
	return retString;	        }
    public static  String reverseR(String s){
	if (s.length()== 0){return "";}
	return s.substring(s.length()-1,s.length())+ reverseR(s.substring(0,s.length()-1));    }
    public static void main (String[] args){
	System.out.println(fenceF(1));
	System.out.println(fenceF(2));
	System.out.println(fenceF(3));
	System.out.println(reverseF("stressed"));
	System.out.println(reverseR("stressed"));    }}
