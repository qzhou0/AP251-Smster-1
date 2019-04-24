/*Qian Zhou
APCS1 pd01
HW 21 - Karmacomma
2017-10-23*/

public class Commafier{
    public static String commafyR(int i){
	String intStr="";
	intStr+= i;

	if (intStr.length() <=3){// base case
	    return intStr;
		}
	
	String zeroHolder="";
	String falseInt=intStr.substring(1);
	int repeatCounter=0;
	while (falseInt.substring(0,1).equals("0")){// prevents number passed to next recurson from shrinking due to first numbers being zero
	    //System.out.println(falseInt);
	    if (falseInt.length() <=3){
		return  intStr.substring(0,1)+ zeroHolder +","+
		    falseInt.substring(0);}

	    //System.out.println("zero length "+falseInt.length());
	    if (falseInt.length()%3 == 0){// adds comma reasonably
		zeroHolder+=","+"0";}
	    else { zeroHolder += "0";}

	    repeatCounter +=1;// updates info
	    falseInt = falseInt.substring(1);
	    
	    //System.out.println("repeatCounter "+repeatCounter);
	    //System.out.println("zeroHolder "+zeroHolder);
	     //System.out.println(falseInt);
	   
	}
	//	if (intStr.length() -1 == repeatCounter){// prevents the remaining string being too short for continued 
	//   return intStr+zeroHolder;}
       	//System.out.println("intStrLength "+intStr.length());
	//System.out.println(intStr.substring(repeatCounter+1).length());
	//System.out.println(intStr.substring(repeatCounter+1));
	if (intStr.substring(repeatCounter+1).length() %3 == 0&& repeatCounter >0){// prevents a comma needed to be inserted after a bunch of zeroes
	    zeroHolder+=",";}
	if (intStr.length()%3 == 1){// comma insert & recursion
	    return  intStr.substring(0,1) + "," + zeroHolder+
		commafyR(Integer.parseInt(intStr.substring(repeatCounter+1) ) );
	}

	else {// no comma insert & recursion
	    //System.out.println("yes");
	    return intStr.substring(0,1) + zeroHolder+
		commafyR(Integer.parseInt(intStr.substring(repeatCounter+1)));}


	       
	
    }
    public static String commafyF(int i){
	String stringi="";
	stringi += i;
	String retStr="";
	for (;stringi.length() >3; stringi= stringi.substring(1)){

	    if (stringi.length() % 3 == 1){
		retStr+=stringi.substring(0,1)+",";}
	    else {
		retStr+= stringi.substring(0,1);}
	}
	
	return retStr+= stringi;
	
    }
    public static void main(String[] args){
	/*	System.out.println(commafyR(1));
	System.out.println(commafyR(10));
	System.out.println(commafyR(101));
	System.out.println(commafyR(1000));
	System.out.println(commafyR(12345));
	System.out.println(commafyR(100010001));//100,010,001*/
	/*System.out.println(commafyF(1));
	System.out.println(commafyF(10));
	System.out.println(commafyF(101));
	System.out.println(commafyF(1000));
	System.out.println(commafyF(12345));
	System.out.println(commafyF(100010001));//100,010,001*/
	for (String s:args){
	    System.out.println(commafyR(Integer.parseInt(args[0])));}
    }
}
