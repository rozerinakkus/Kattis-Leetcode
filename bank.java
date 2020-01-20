import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;


public class bank {
	
	public static void main(String[] args)
	{
		Scanner scan  = new Scanner(System.in);
		int n = scan.nextInt();
		int T = scan.nextInt();
		
		int [] dp = new int [T+1];
		
		for(int i = 1; i < n; i++) {
			int c = scan.nextInt();
			int t = scan.nextInt();
			dp[t] = Math.max(dp[t], c);
		}
		
		
		int ans = 0;
		
		for( int i = 0; i<T+1; i++) 
		{
			ans += dp[i];
		}
		
		System.out.println(ans);	
	}
}
