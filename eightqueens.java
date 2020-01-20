import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.CharArrayReader;


public class eightqueens {
	
	public static void main(String[] args) {
		Scanner scan  =new Scanner(System.in);
		StringBuilder str = new StringBuilder();
		while (scan.hasNext()){
			str.append(scan.next());
		}
		scan.close();
		ArrayList<String> arr = new ArrayList<String>(str.length());
		
	    for(int i = 0; i<str.length(); i++) {
	    	arr.add(String.valueOf(str.charAt(i)));
	    }
	
		
		
		
		boolean [] a = new boolean[15];
		boolean [] b = new boolean[15];
		boolean [] c = new boolean[8];
		boolean [] d = new boolean[8];
		Arrays.fill(a, false);
		Arrays.fill(b, false);
		Arrays.fill(c, false);
		Arrays.fill(d, false);
		
		int queens = 0;
		
		for (int i =0; i< 8; i++) {
			for(int j = 0; j<8; j++) {
				String s = arr.remove(0);
				while(s != "*" && s!= ".") {
					s  = arr.remove(0);
				}
				if(s == "*") {
					queens ++;
					if(a[j-i+7] || b[i+j] || c[i] || d[j]) {
						System.out.println("invalid");
						break;
				
					}
					a[j-i+7] = true;
					b[i+j] = true;
					c[i] = true;
					d[j] = true;
				}
	
				
			}
		}
		
		if(queens == 8) {
			System.out.println("valid");
		}
		else {
			System.out.println("invalid");
		}
			
		
	}

}
