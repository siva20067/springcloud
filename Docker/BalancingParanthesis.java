import java.util.Stack;


public class BalancingParanthesis {

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(') {
				stack.push(')');
				//System.out.println(stack);
				}
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			
			else if (stack.isEmpty() || stack.pop() != c) {
				return false;
				}
			System.out.println(stack);
		}
		return stack.isEmpty();
	}	
	public static void main(String args[]) {
		BalancingParanthesis ob = new BalancingParanthesis();
		System.out.println(ob.isValid("([])"));
	}
	
}