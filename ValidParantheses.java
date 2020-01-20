import java.util.HashMap;
import java.util.Stack;
class ValidParantheses{
   public static boolean isValid(String s) {
       
       if(s.length() == 0) return true;
       
		HashMap<Character, Character> pairs = new HashMap<Character, Character> ();
		pairs.put('{', '}');
		pairs.put('[', ']');
		pairs.put('(', ')');
       
		char ch;
		Stack<Character> stack = new Stack<Character>();
       
		    for(int i = 0; i<s.length(); i++){
                ch = s.charAt(i);
                
                if(pairs.containsKey(ch)){
                    stack.push(ch);
                }
                else if(pairs.containsValue(ch) && stack.isEmpty()){
                    return false;
                }
                else{
                    if(pairs.get(stack.peek()).equals(ch)){
                        stack.pop();
                    }else{
                        return false;
                    }
                }
				// if(pairs.containsKey(ch) && stack.isEmpty()) {
				// 	return false;
				// }else if(!stack.isEmpty() && pairs.get(ch).equals(stack.peek())){
				// 	stack.pop();
				// }else{
				// 	stack.push(ch);
				// }
            }
			

			return stack.isEmpty();	
	}
	
	public static void main(String[] args) {
		String s = "[";
		System.out.print(isValid(s));
	}


}
