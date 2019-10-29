import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {

	private static final String TEXT = "Lorem ipsum dolor sit amet, "
			+ "consectetur adipiscing elit. Nunc quis tempor tellus. Nulla "
			+ "tincidunt pretium justo non finibus. Fusce quis bibendum ante. "
			+ "Vivamus a ex maximus, iaculis nunc eu, posuere augue. Vestibulum "
			+ "ante ipsum primis in faucibus orci luctus et ultrices posuere "
			+ "cubilia Curae; Nullam ut lorem metus. Vivamus consequat eros "
			+ "sed lorem rhoncus finibus. Sed porta euismod consequat. Etiam "
			+ "sodales accumsan nulla, non pretium ex tincidunt eget. Aliquam "
			+ "nibh erat, tristique vel augue sit amet, sodales sollicitudin leo. "
			+ "Mauris in arcu volutpat, efficitur erat imperdiet, finibus dolor. "
			+ "Vestibulum a dolor sed justo tempor elementum. Pellentesque eu "
			+ "tincidunt ex, et posuere orci. Phasellus non nibh non nibh pharetra "
			+ "lobortis. ";

	public static String[] normalize(String string) {
		if (string == null || string.length() == 0) {
			String tokens[]=string.split(" ");
			return tokens;
		}
		else {
			String stripped = string.replaceAll("\\p{Punct}", "");
			char c[] = stripped.toCharArray();
			for(int i=0; i<stripped.length();  i++) {
				c[i] = Character.toLowerCase(c[i]);
			}

			string=new String(c);
			String tokens[]=string.split(" ");
			return tokens;
		} 
	}
	public static void findWord(String string) 
	{ 
		String arr[]= normalize(string);
		

		HashMap<String, Integer> hs = new HashMap<String, Integer>(); 


		for (int i = 0; i < arr.length; i++) { 
			// If word already exist in HashMap then increase it's count by 1 
			if (hs.containsKey(arr[i])) { 
				hs.put(arr[i], hs.get(arr[i]) + 1); 
			} 
			// Otherwise add word to HashMap 
			else { 
				hs.put(arr[i], 1); 
			} 
		} 

		Set<Map.Entry<String, Integer> > set = hs.entrySet(); 
		String key = ""; 
		int value = 0; 

		for (Map.Entry<String, Integer> me : set) { 
			// Check for word having highest frequency 
			if (me.getValue() > value) { 
				value = me.getValue(); 
				key = me.getKey(); 
			} 
		} 

	String fin= "The most frequent word is "+ key+ ", occured "+value+" times.";
	System.out.println(fin);

	}
	
	public static void main(String[] args) {
		findWord(TEXT);
		
	}
	
	
}


