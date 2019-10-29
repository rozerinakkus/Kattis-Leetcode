import java.util.Scanner;

public class commercials_260775633 {
	public static void main(String [] args) {
		
		//getting user input via scanner
		
		Scanner scan = new Scanner(System.in);
		int breaks = scan.nextInt();
		int price = scan.nextInt();
		
		int[] breaklist= new int[breaks];
		
		
		//subtracting price 
		for (int i=0; i<breaks; i++) {
			breaklist[i]=scan.nextInt()-price;
		}
		scan.close();
		System.out.println(maxSubarray(breaklist));
	}
	
	//maxSubarray problem, DP to find the max subarray
	//Kadane's algorithm
	
	public static int maxSubarray(int[] input) {
		int currentMax=0;
		int max= Integer.MIN_VALUE;
		
	for(int i=0; i<input.length; i++) {
		
		//Compute if the next element should be included or not
		currentMax=Math.max(input[i], input[i]+currentMax);
		if(currentMax>max) {
			max=currentMax;
			}
		}
		return max;		
		
	}
		
		
	}
	

