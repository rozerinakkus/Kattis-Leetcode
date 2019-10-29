
public class Profit {

	public static int maxProfit(int[] prices) {
		int max=0;
		for(int i = prices.length-1; i<0; i--) {
        for (int j=0; j<prices.length; j++) {
        	int profit=prices[i]-prices[j];
        	if ((i>j) && (profit>max)) {
        		max=profit;
        	}
        }  
    }
		return max;
}}


