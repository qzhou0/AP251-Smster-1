//Qian Zhou
//APCS1 pd01
//HW37 -- Be More Rational
//2017-11-20

public class Rational {
    private  int _numerator;
    private  int _denominator;
    public Rational(){
	_numerator = 0;
	_denominator = 1;}
    public Rational(int num, int denom){
	this();
	if (denom == 0){
	    System.out.println("Invalid Denominator");
	    }
	else{
	    _numerator = num;
	    _denominator = denom;}
    }
    public  String toString(){
	String s="";
	s += _numerator +"/" + _denominator;
	return s;}
    public double floatValue(){
	return (double) _numerator / _denominator;}
    public void multiply(Rational R){
	_numerator *= R._numerator;
	_denominator *=R._denominator;
    }
    public void divide(Rational R){
	if(R._numerator != 0){
	    _numerator *= R._denominator;
	    _denominator *=R._numerator;}
	else{
	    	    System.out.println("Divide by zero, value unchanged");}   
    }
    /*Takes 1 Rational object (just like multiply) and adds it to the current rational number object*/
    public void add(Rational R){
	_numerator = _numerator * R._denominator + _denominator * R._numerator;
	_denominator = _denominator * R._denominator;
    }
    public void subtract(Rational R){
	_numerator = _numerator * R._denominator - _denominator * R._numerator;
	_denominator = _denominator * R._denominator;
    }

    public static int gcd(int a, int b){
     	if (a % b == 0){
	    return b;}
	else if (b % a == 0){
	    return a;}
	while (a !=0 && b != 0){
	    
	    if (a > b){
	        a -=b;
	        }
	    else {
		b -=a;
	    }}
	if (a == 0){return b;}
	else {return a;}
    
        
    }
    /*Returns the gcd of the numerator and denominator of this Rational*/
    public int gcd(){
	return gcd(_numerator, _denominator);
    }
    /*Changes this Rational to one in reduced form */
    public void reduce(){
	int gcd = this.gcd();
	_denominator /= gcd;
	_numerator /= gcd;
    }
    /*Takes a Rational parameter and compares it to the calling object
Returns 0 if the two numbers are equal
Returns a positive integer if the calling number is larger than the parameter
Returns a negative integer if the calling number is smaller than the parameter*/
    public int compareTo(Rational r){
	/*int rVal = (double)r._numerator / r._denominator;
	int tVal = (double)_numerator / _denominator;
	*/
        double diff =((double)_numerator / _denominator -
		      (double)r._numerator / r._denominator);
	if (diff > 0){return 1;}
	else if (diff <0){return -1;}
	return 0;
	
	    
	//return tVal - rVal 

    }
    public static void main(String[] agrs){
	Rational r = new Rational( 3, 7 );
	Rational s = new Rational();
	Rational t = new Rational( 8, 5 );
	Rational u = new Rational( 1, 2 );
	Rational v = new Rational( 2, 3 );
	Rational w = new Rational( 8, 12 );

	System.out.println("r: " + r );
	System.out.println("s: " +  s );
	System.out.println("t: " +  t );

	System.out.println( r + " represented as a floating pt num: "
			    + r.floatValue() );

	System.out.print( r + " * " + t + " = ");
	r.multiply(t);
	System.out.println(r);

	System.out.print( r + " / " + t + " = ");
	r.divide(t);
	System.out.println(r);

	System.out.print( s + " + " +w  + " = ");
	s.add(w);
	System.out.println(w);

	System.out.print( s + " - " +r  + " = ");
	s.subtract(r);
	System.out.println(s);
	System.out.print("\ngcd r " + r + " " + r.gcd());
	System.out.print("\ngcd s " + s + " " + s.gcd());
	System.out.print("\ngcd t " + t + " " + t.gcd());
	System.out.print("\ngcd u " + u + " " + u.gcd());
	System.out.print("\ngcd v " + v + " " + v.gcd());
	System.out.print("\ngcd w " + w + " " + w.gcd());
	System.out.println("compare r s" + r.compareTo(s));
	System.out.println("compare s t" + s.compareTo(t));
	System.out.println("compare t u" + t.compareTo(u));
	System.out.println("compare u v" + u.compareTo(v));
	System.out.println("compare v w" + v.compareTo(w));
	r.reduce(); s.reduce(); t.reduce();u.reduce();v.reduce();w.reduce();
	System.out.println("reduce r " + r);
	System.out.println("reduce s " + s);
	System.out.println("reduce t " + t);
	System.out.println("reduce u " + u);	
	System.out.println("reduce v " + v);
	System.out.println("reduce w " + w);    }
}
		     
