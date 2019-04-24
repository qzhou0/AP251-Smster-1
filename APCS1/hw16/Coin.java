/*Qian Zhou
APCS1 pd<01>
HW<16> -- <Get It While You Can>
2017-10-12*/   

public class Coin{
    // inst vars
    double value;// monetary worth
    String name;
    String upFace;
    int flipCtr;// number of times this coin has been flipped
    int headsCtr;// -- number of times this coin has landed heads-up
    int tailsCtr;// -- number of times this coin has landed tails-up
    double bias;// -- likelihood of landing heads-up every time 
    // default constructor
    public Coin(){
	name = "penny";
	upFace = "heads";
	bias = .5;
	value = 0.01;
    }
    
    // first overloaded constructor
    public Coin(String type){
	this();
	name = type;
	assignValue();
    }
    // second overloaded constructor
    public Coin(String type, String HT){
	this();
	name = type;
	upFace = HT;
	assignValue();
    }
    // toString()
    public String toString(){
	String retStr= "\nname:  ";
	retStr+=name;
	retStr+="\ncurrent face up: ";
	retStr+= upFace;
	retStr+="\nCoin value: ";
	retStr+= value;
	retStr+="\n number heads up:";
	retStr+= headsCtr;
	retStr+="\n number of flip:";
	retStr+= flipCtr;
	retStr+="\n ==============\n";
	
	return retStr;
    }
    // reset method
    public void  reset(){
	flipCtr=0;
	headsCtr=0;
	tailsCtr=0;
    }
	
    // flip method
    public void flip(){
	if (Math.random() >= bias){
		upFace = "heads";
		headsCtr+=1;
	    }
        else {
	    upFace = "tails";
	    tailsCtr+=1;
	}
	flipCtr+=1;
    }
    // equals method
    public boolean equals(Coin object){
	return this.upFace.equals(object.upFace);// &&coinType == coinType.name;
    }
    // value assignment
    public void assignValue(){
	if (name == "dollar"){
	    value = 1.0;
	}
	else if (name == "quarter"){
	    value = .25;
	}
	else if (name == "dime"){
	    value = .1;
	}
	else if (name == "nickle"){
	    value = .05;
	}
	else{
	    value = .01;
	}
    }
	   
    public static void main(String[] args){
    }
}
