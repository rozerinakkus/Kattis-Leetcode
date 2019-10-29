//Rozerin Akkus 260775633

import java.util.Scanner;
public class trik {
	public static void main (String [] args) {
		//Scanner to get user input
		Scanner scanner = new Scanner(System.in);
		String trick= scanner.nextLine();
		scanner.close();
		//get the whole line and close the scanner
		
		
		//initially, the ball is at position 1 
		int pos=1;
		
		//length of the input string is the number of moves made
		for(int i=0; i<trick.length(); i++) {
			
			//if the move is A, if ball at pos 1, goes to 2. If at 2, goes to 1
			if (trick.charAt(i)=='A') {
				if(pos==1)
					pos+=1;
				else if(pos==2)
					pos-=1;
				else
					continue;
			}
			//if the move is B, if ball at pos 2, goes to 3. If at 3, goes to 2.
			if (trick.charAt(i)=='B') {
				if(pos==2)
					pos+=1;
				else if(pos==3)
					pos-=1;
				else
					continue;
		}
			
			//Similar logic for move C
			if (trick.charAt(i)=='C') {
				if(pos==1)
					pos+=2;
				else if(pos==3)
					pos-=2;	
				else
					continue;
	}
}
		//print out the final position
		System.out.println(pos);
}
}