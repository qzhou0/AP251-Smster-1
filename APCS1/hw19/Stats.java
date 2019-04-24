//Team: Team Name -- Zane Wang, Qian Zhou
//APCS1 pd<01>
//HW<19> --gcd 3 ways
//2017-10-18    



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
        return max(max(a,b),c);
    }
    // max of three doubles
    public static double max(double a, double b, double c){
	return max(max(a,b),c);
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
    public static int gcd( int a, int b ){//  --- uses brute-force approach, beginning at 1 and working up to lesser input
	int GCD = 0;
	int trial = 1;
	while (trial <= Math.min(a,b)){
	    if (a % trial == 0 &&  b % trial == 0){
		GCD = trial;}
	    trial += 1;}
	return GCD;
       
    }
    /* Euclid's algorithm
       if b is divisible by a then return a, or else keep subtracting the smaller one of the two from the larger one until one gets to zero, and the other is the gcd*/
    public static int gcdER( int a, int b ){// --- employs Euclid's algorithm recursively
	if (a % b == 0){
	    return b;}
	else if (b % a == 0){
	    return a;}
	if (a >= b){
	    a -= b;
	}
	else {b-= a;}
	if (a == 0){return b;}
	else if (b==0){return a;}
	else {return gcdER(a,b);}
	
    }
    
// --- employs Euclid’s algorithm iteratively with a while loop
public static int gcdEW (int a, int b) {
	if (b % a == 0) {
		return a;
	    }
	while (1 == 1) {
	    if (a >= b) {
		a -= b;
		    }
	    else {
		b -= a;
		}
	    if (a == 0) {
		return b;
		    }
	    if (b == 0) {
		return a;
		    }
	    }
    }
    // main method
    public static void main(String[] args) {
	System.out.println("========Test brute force===============");
	System.out.println(gcd(15, 20));
	System.out.println(gcd(20, 15));
	System.out.println(gcd(20,4));
	
	System.out.println("========Test recursion===============");
	System.out.println(gcdER(15, 20));
	System.out.println(gcdER(20, 15));
	System.out.println(gcdER(20,4));
	
	System.out.println("========Test While loop===============");
	System.out.println(gcdEW(15, 20));
	System.out.println(gcdEW(20, 15));
	System.out.println(gcdEW(20,4));

    
    }
}
