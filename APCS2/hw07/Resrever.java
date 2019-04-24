// Monos Fuertes - Johnny Wong, Qian Zhou
// APCS2 pd01
// HW07 --  A Man, A Plan, A Canal: Panama!
// 2018-02-13

public class Resrever{

    public String linear(String s){
	if (s.length() == 1){return s;} // base case
	return s.substring(s.length()-1)+ linear(s.substring(0,s.length()-1));
    }

    public String logarithmic(String s){
	if (s.length()==1){ // base case
	    return s;
	}
	int mid = s.length()/2;
	return logarithmic(s.substring(mid))+logarithmic(s.substring(0, mid));
    }


    public static void main(String[] args){
	Resrever weird = new Resrever();
	String a = "stressed";
	String alpha = "abcdefghijklmnopqrstuvwxyz";
	System.out.println(weird.linear(a));
	System.out.println(weird.logarithmic(a));
	System.out.println(weird.linear(alpha));
	System.out.println(weird.logarithmic(alpha));
    }

}
