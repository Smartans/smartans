/********************************************************
 * 
 * 08-722 Data Structures for Application Programmers
 * Lab 1 ArrayList time comparison and String manipulation
 * Comparing ArrayList operations (add at last vs remove)
 *
 ********************************************************/

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
				
	    List<Integer> tmp = new ArrayList<Integer>();
	    int size = 100000;

	    //calculate and print running time of addition
	    Stopwatch timer1 = new Stopwatch();
	    for(int i = 0; i < size; i++) 
	    	tmp.add(i);
        System.out.println("Computing time for addition : " + timer1.elapsedTime() + " millisec");
        
        // calculate and print running time of removal
	    Stopwatch timer2 = new Stopwatch();
	    for(int i = 0; i < size; i++) {
	    	tmp.remove(0); // remove first
	    	// tmp.remove(tmp.size()/2); // remove in the middle
	    	// tmp.remove(tmp.size()-1); // remove last
	    }
	    
	    System.out.println("Computing time for deletion : " + timer2.elapsedTime() + " millisec");
	    System.out.println("deleted: " + tmp);
	}
	
}