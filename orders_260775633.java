import java.util.ArrayList;
import java.util.Scanner;
public class orders_260775633 {
	public static void main(String [] args) {


		Scanner scan = new Scanner(System.in);
		int menu = scan.nextInt();
		ArrayList<Integer> prices = new ArrayList<Integer>();
		ArrayList<Integer> costs = new ArrayList<Integer>();

		for(int i = 0; i<menu; i++) 
		{
		 prices.add(scan.nextInt());
		}
		
		int numOrders = scan.nextInt();
		
		for(int i = 0; i<numOrders; i++) 
		{
		 costs.add(scan.nextInt());
		}
		
		scan.close();
		System.out.println(menu);
		System.out.println(numOrders);
		System.out.println(prices.toString());
		System.out.println(costs.toString());
	
	}
}
	
