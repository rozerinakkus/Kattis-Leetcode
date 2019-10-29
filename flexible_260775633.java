import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class flexible_260775633 {
	public static void main(String [] args) {
		
		//an integer arraylist to store partitions
		ArrayList<Integer> a = new ArrayList<>();
		// add the default partition 0
		a.add(0);
		
		Scanner scan = new Scanner(System.in);
		int width = scan.nextInt();
		int numP = scan.nextInt();
		
		//add partitions until the width 
		for (int i=0; i<numP; i++) {
			a.add(scan.nextInt());
		}
		scan.close();
		
		//add default partition width 
		a.add(width);
		
		//an arrayList to store possible values
		ArrayList<Integer> pos = new ArrayList<>();
		
		
		//nested for loop to calculate each possible partition difference
		//inside loop starts from i+1 to not to redo already calculated values
		for(int i = 0; i < a.size()-1; i++) {
			for(int j = i+1; j < a.size(); j++) {
			int dif = Math.abs(a.get(j)-a.get(i));
			
			//if the value dif is not already in array of possibilities, add value
			if (!pos.contains(dif)) {
				pos.add(dif);
			}
			}
		}
		
		// sort the possibilities
		Collections.sort(pos);
		
	//print the possibilities
	  for (int i = 0; i < pos.size(); i++) {
		  if (i<pos.size()-1)
			  System.out.print(pos.get(i) + " ");
		  else
			  System.out.print(pos.get(i));		  
	  }
	}
}
