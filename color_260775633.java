import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class color_260775633 {
	public static void main(String [] args ) {
		//reading inputs from user
		
		int numSocks; 
		int cap;
		int tol;
		Scanner scan = new Scanner(System.in);
		numSocks = scan.nextInt();
		cap = scan.nextInt();
		tol = scan.nextInt();

		//adding int colors of socks to an arraylist
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i=0; i<numSocks; i++) {
			int element=scan.nextInt();
			a.add(element);

		}
		//close the scanner
		scan.close();
		
		// sort the colors
		Collections.sort(a);
		
		// this part is important
		//starting numWash(number of washes) and numSet (number of elements in each wash) from 1.
		//because the first element is already num1=a.get(0)
		
		int num1=a.get(0);
		int numWash=1;
		int numSet=1;
	
		// going through the array of colors of socks
	for(int  i=1; i<numSocks; i++) {
		// if the difference is greater than tol (max color tolerance) 
		//OR number of socks is greater than cap (capacity of the machine) 
		//pass to another wash and make num1 the current element (either its above capacity or not in the same color range)
		//should be washed in a different set
		//update numWash and reset numSet
		if(a.get(i) - num1 > tol || numSet >= cap) {
			numWash++;
			num1 = a.get(i);
			numSet = 1;
		 }
		 else  numSet++;
	} 
	
	// print the number of washes
	System.out.println(numWash);
}
	
}
