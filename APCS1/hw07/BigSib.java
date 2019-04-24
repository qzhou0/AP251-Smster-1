// Qian Zhou
// APCS1 pd01
//HW07 -- On the Origins of a BigSib
//2017-09-26
public class BigSib{


    public BigSib(){
	helloMsg = "hello";
    }
    public BigSib(String newMsg){
	//	helloMsg = "hello";
	setHelloMsg(newMsg);
    }
    private String helloMsg;
    
    public void setHelloMsg(String newMsg){
       	helloMsg = newMsg;
         }
    public  String greet(String name){
       	return helloMsg +' '+name;
         }

}

/*
error: constructor BigSib in class BigSib cannot be applied to given types;
        BigSib richard = new BigSib("Word up");
                         ^
  required: no arguments
  found: String
  reason: actual and formal argument lists differ in length*/
