//Qian Zhou
//APCS1 pd<01>
//HW<13> -- May ah Hahv S’maur, Please?
//2017-10-06    



public class Stats{

    // mean with integer in/output
    public static int mean(int a, int b){
	return (int)(a + b) / 2;
    }
    // mean with double inoutput
    public static double mean(double a, double b){
	return (a+b)/2;
    }
    // max of two int
    public static int max(int a, int b){
	if( a > b){
	    return a;
	}
	return b;
    }
    // max of two doubles
    public static double max(double a, double b){
	if( a > b){
	    return a;
	}
	return b;
    }
    // max of three ints
    public static int max(int a, int b, int c){
	/*	System.out.println("==========");
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);*/
	if (a >=b){
	    if (a > c){
		return a;}
	    else{
		return c;}
	}
	else if (b > c){
	    return b;}
	else {
	    return c;}}

    // max of three doubles
    public static double max(double a, double b, double c){
	/*	System.out.println("==========");
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);*/
	if (a >=b){
	    if (a > c){
		return a;}
	    else{
		return c;}
	}
	else if (b > c){
	    return b;}
	else {
	    return c;}
    }
    // geometric means int, then double
    public static int geoMean(int a, int b){
	return (int)Math.sqrt(a*b);
    }
    // geometric mean of 2 doubles
    public static double geoMean(double a, double b){
	return Math.sqrt(a*b);
    }
    // geometric mean of 3 ints
    public static int geoMean(int a, int b, int c){
	return (int) Math.pow((a*b*c), 1.0/3.0);
    }
    //geometric mean of 3 doubles
    public static double geoMean(double a, double b, double c){
	return Math.pow((a*b*c), 1.0/3.0);
    }

    //main method
    public static  void main(String[] args){
    }
}
