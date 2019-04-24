//Qian Zhou
//APCS1 pd01
//HW36 -- Be Rational
//2017-11-17

public class Rational {
    private int numerator;
    private int denominator;
    public Rational(){
	numerator = 0;
	denominator = 1;}
    public Rational(int num, int denom){
	if (denom == 0){
	    System.out.println("Invalid Denominator");
	    denominator = 1;
	    numerator = 0;}
	else{
	    numerator = num;
	    denominator = denom;}
    }
    public  String toString(){
	String s="";
	s += numerator +"/" + denominator;
	return s;}
    public double floatValue(){
	return numerator *1.0 / denominator;}
    public void multiply(Rational R){
	numerator *= R.numerator;
	denominator *=R.denominator;
    }
    public void divide(Rational R){
	if(R.numerator != 0){
	    numerator *= R.denominator;
	    denominator *=R.numerator;}
	else{
	    	    System.out.println("Invalid Denominator");
	    denominator = 1;
	    numerator = 0;}
    
	    
    }
    public static void main(String[] agrs){
	Rational r = new Rational(2,3); //Stores rational number 2/3
	Rational s = new Rational(1,2); //Stores rational number 1/2
	Rational in = new Rational();//testing default constructor
	Rational one = new Rational(2,0);//testing overloaded constructor

	System.out.println("toString tests");
	System.out.println("r:"+r );
	System.out.println("s:"+s );
	System.out.println("in:"+in );
	System.out.println("one:"+one );

	System.out.println("Float values");
	System.out.println("r:"+r.floatValue());
	System.out.println("s:"+s.floatValue());
	System.out.println("in:"+in.floatValue());
	System.out.println("one:"+one.floatValue());


	System.out.println("Multiply and DIvide");
	r.multiply(s);//2/6
	in.multiply(r);//0/6
	s.divide(r);//6/4
	
	System.out.println("r:"+r+" = "+r.floatValue() );
	System.out.println("s:"+s+" = "+ s.floatValue() );
	System.out.println("in:"+in );
	
	one.divide(in);
	System.out.println("one:"+one );
    }
}
		     
