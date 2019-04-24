// Qian Zhou
// APCS pd01
// HW47 -- _ascending
// 2017-12-05

import java.util.ArrayList;
public class OrderedArrayList{
    private int count = 0;//used for sorting
    //stuff of ArrayList
    private ArrayList<Comparable> data = new ArrayList<Comparable>();
    public String toString(){
	return data.toString();
    }
    public boolean add(Comparable c){
	return data.add(c);
    }
    public void add(int index, Comparable c){
	data.add(index, c);
    }
    public void remove(int i){
	data.remove(i);
    }
    public Comparable get(int index){
	return data.get(index);
    }
    public int size(){
	return data.size();
    }
    //-------------Sortation-------------
    // returns the minimal value in the array
    private Comparable min(){
	Comparable retVal;
	
	retVal  = data.get(0);
	count =1;
	for (int i = 1; i<data.size();i++){
	    if (data.get(i).compareTo(retVal) < 0){
		retVal = data.get(i);
		count = 1;}
	    else if (data.get(i).compareTo(retVal)==0){
		count +=1;}
	}
	return retVal;
    }
    // Creates an ArrayList of indexes in data needed to be removed
    private ArrayList<Integer> removeIndex(Comparable target){
	ArrayList<Integer> retList =  new ArrayList<Integer>();
	for (int i = 0; i<data.size(); i++){
	    if (data.get(i).compareTo(target) ==0){
	        retList.add(i); 
	    }
	}
	return retList;
    }
    public void sort(){
	ArrayList<Comparable> an = new ArrayList<Comparable>();
	Comparable target;
	ArrayList<Integer> targetList;
	while (data.size()>0){
	    target = min();
	    while (count >0){
		an.add(target);
		count-=1;
	    }
	     targetList = removeIndex(target);
	     for (int i = targetList.size()-1; i>=0; i--){
		 data.remove((int)targetList.get(i));//Finally found the code contributing to infinite recursion!
	    }
	     
	    
	}
	for (int i = 0; i<an.size(); i++){// copy stuff in an to data, now empty
	    data.add(an.get(i));
	}
    }
    public static void main(String[] args){
	OrderedArrayList a = new OrderedArrayList();
	for(int i = 0; i<24; i++){
	    a.add((int)(Math.random()*10));
	}
	System.out.println(a);
	a.sort();
	System.out.println(a);
    }
}
