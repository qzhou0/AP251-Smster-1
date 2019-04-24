//Qian Zhou
//APCS1 pd<01>
//HW<12> -- <stAtistically sPeaking>
//2017-10-05   



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
    // geometric means int, then double
    public static int geoMean(int a, int b){
	return (int)Math.sqrt(a*b);
    }
    public static double geoMean(double a, double b){
	return Math.sqrt(a*b);
    }

    //main method
    public static  void main(String[] args){
	System.out.println(mean(4,5));// 4
	System.out.println(mean(5.1, 6.792));//5.946
	System.out.println(max(3,5));//5
	System.out.println(max(-6,1));//1
        System.out.println(max(7.999,8));//8
	System.out.println(max(-88,88));//88
	System.out.println(geoMean(3,27));//9
	System.out.println(geoMean(3,4));//3
	System.out.println(geoMean(5.56,3.63));//4.492527128
    }
}
