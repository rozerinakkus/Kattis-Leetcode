import java.util.Scanner;
import java.lang.Math; 
import java.util.StringTokenizer;
public class sibice {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		StringTokenizer firstLine = new StringTokenizer(scan.nextLine());

		int numMatch = Integer.parseInt(firstLine.nextToken());
		int w = Integer.parseInt(firstLine.nextToken());
		int h = Integer.parseInt(firstLine.nextToken());
		double diag = Math.sqrt((w*w)+(h*h));
		int match;

		for (int i = 0; i<numMatch; i++) {
			match = scan.nextInt();
			if (match <= diag) {
				System.out.println("DA");
			}
			else {
				System.out.println("NE");	
			}

		}
		
		scan.close();

	}
}
