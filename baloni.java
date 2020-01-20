import java.util.Scanner;
import java.util.Arrays;

public class baloni {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] heights = new int [1000010];
		Arrays.fill(heights, 0);


		while(n>0) {
			int h = scan.nextInt();

			if(heights[h]==0) {
				heights[h-1]++;	
			} else {
				heights[h]--;
				heights[h-1]++;
			}
			n--;
		}
		
		
		int result = 0;
		for (int i : heights) 
			result+=i;
		 
		System.out.println(result);

	}
}
