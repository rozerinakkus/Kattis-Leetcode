package Solutions;
import java.util.Arrays;
import java.util.*; 

class Solution {
	public static List<String> subdomainVisits(String[] cpdomains) {

		//empty array resolve

		int i, j, count, subCount;
		// changed
		int spaceInd = 0;
		int dotCount = 2;
		String currStr, subdomain; 
		

		//switch?
		// change to hashMap?
		Hashtable<String, Integer> domainCount = new Hashtable<String, Integer>();

		List<String> ans = new ArrayList();
		for(i=0 ; i<cpdomains.length -1 ; i++){

			currStr = cpdomains[i];

			// can add shit to break if currStr is empty

			for (j=0 ; j<=5 ; j++){

				if (currStr.charAt(j) == ' '){
					spaceInd=j;
				}
			}

			count = Integer.parseInt(currStr.substring(0,spaceInd-1));
			// add shit if same string can happen twice
			domainCount.put(currStr.substring(spaceInd+1,currStr.length()-1), count);

			//is this how it is handled?
			if (dotCount == 0){
				break;
			}

			for (j=spaceInd+1 ; j<currStr.length()-1 ; j++){

				if (currStr.charAt(j) == '.'){
					dotCount--;
					subdomain = currStr.substring(j+1,currStr.length()-1);
					System.out.println(subdomain);
					if (domainCount.containsKey(subdomain)){
						subCount = count + domainCount.get(subdomain);
						domainCount.replace(subdomain, subCount);
					}else{
						domainCount.put(subdomain, count); 
					}


				} 
			}
		}

		for (String dom: domainCount.keySet())
			ans.add("" + domainCount.get(dom) + " " + dom);
		return ans;
	}
	
	public static void main(String [] args) {
	String [] arr = {"9001 discuss.leetcode.com"}; 
	System.out.print(Arrays.toString(arr));
	System.out.println(subdomainVisits(arr));
	
	
	}

}


