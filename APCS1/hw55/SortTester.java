//Team Eh We Haven't ... : Aidan Griffin, Qian Zhou
//APCS1 pd01
//HW53 -- Solid Comparative Analysis
//2017-12-13

import java.util.ArrayList;

public class SortTester{
    public static void main(String[] args){
	ArrayList<Comparable> bestCaseBub = new ArrayList<Comparable>();
	ArrayList<Comparable> worstCaseBub = new ArrayList<Comparable>();
	/*Best/Worst Case scenario for BubbleSort
       *** Best: Sorted in ascending order because we wouldn't need to bubble the elements up to their proper positions as they are already in it. 
       *** Worst: Everything sorted in descending order so we would need to bubble every element one by one to the proper place from the last index available.
	 */
	for (int i = 0; i < 5;i++){
	    bestCaseBub.add(2*i +1);
	    worstCaseBub.add(10 - 2*i);
	}
	System.out.println( "bestCaseBub before sorting:\n" + bestCaseBub );
	MySorts.bubbleSort(bestCaseBub);
	System.out.println( "bestCaseBub after sorting:\n" + bestCaseBub );
	System.out.println( "worstCaseBub before sorting:\n" + worstCaseBub );
	MySorts.bubbleSort(worstCaseBub);
	System.out.println( "worstCaseBub after sorting:\n" + worstCaseBub );
	
	
	ArrayList<Comparable> bestCaseSel = new ArrayList<Comparable>();
	ArrayList<Comparable> worstCaseSel = new ArrayList<Comparable>();
	/*Best/Worst Case scenario for Selection Sort
       *** Best: The greatest element is in index 0 while the rest starting from index 1 is in ascending order because this way every swap would get the next-biggest at index 0 which would require no activation of the reigning champion if conditional.
       *** Worst: Sorted in ascending order because this way every final laughing champion would be the last one to be found which would require maximum activation of reigning champion conditional.
	 */
	bestCaseSel.add(1000);
	for (int i = 0; i < 1000;i+= 50){
	    bestCaseSel.add(i);
	    worstCaseSel.add(i);
	}
	worstCaseSel.add(1000);
 
	System.out.println( "bestCaseSel before sorting:\n" + bestCaseSel );
	MySorts.selectionSort(bestCaseSel);
	System.out.println( "bestCaseSel after sorting:\n" + bestCaseSel );
	System.out.println( "worstCaseSel before sorting:\n" + worstCaseSel );
	MySorts.selectionSort(worstCaseSel);
	System.out.println( "worstCaseSel after sorting:\n" + worstCaseSel );
	
	ArrayList<Comparable> bestCaseIns = new ArrayList<Comparable>();
	ArrayList<Comparable> worstCaseIns = new ArrayList<Comparable>();
	
	/*Best/Worst Case scenario for Insertion Sort
       *** Best: Sorted in ascending order because as partition increases there would be no need to swap elements.
       *** Worst: Sorted in descending order because we have to walk every element to index zero as partition increases
	 */
	for (int i = 100; i < 230;i+=15){
	    bestCaseIns.add(i);
	    worstCaseIns.add(430-i);
	}

	System.out.println( "bestCaseIns before sorting:\n" + bestCaseIns );
	MySorts.insertionSort(bestCaseIns);
	System.out.println( "bestCaseIns after sorting:\n" + bestCaseIns );
	System.out.println( "worstCaseIns before sorting:\n" + worstCaseIns );
	MySorts.insertionSort(worstCaseIns);
	System.out.println( "worstCaseIns after sorting:\n" + worstCaseIns );
    }
}
