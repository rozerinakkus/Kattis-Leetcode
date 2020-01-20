package Solutions;
import java.util.Stack;

public class SimpleMath {
	public static String simplifyPath(String path) {
		String [] tokens = path.split("/");
		Stack<String> stack = new Stack<>();

		for (String token : tokens){
			System.out.println(token);
			if (token.equals("") || token.equals(".") || token == (null)){
				continue;
			}
			else if (token.equals("..") && !stack.isEmpty())
			{
				stack.pop();
			}

			else{
				stack.push(token);
			}      
		}
		System.out.println(stack);
		String output = "";

		if(stack.isEmpty() || stack.peek().equals("..")){
			output = "/";
		}
		else{
			while(!stack.isEmpty()){
				output = "/" + stack.pop() + output;
			}
		}
		return output;
	}
	
	public static void main(String [] args) {
		String s = "/home//foo/";
		System.out.println(simplifyPath(s));
	}
}
