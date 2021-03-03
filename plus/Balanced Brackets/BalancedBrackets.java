import java.util.*;
import java.lang.*;

class BalancedBrackets {
	
  public static boolean balancedBrackets(String str) {
		
		Hashtable<Character, Character> brackets = new Hashtable<>();
		brackets.put(')', '(');
		brackets.put(']', '[');
		brackets.put('}', '{');
		
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < str.length(); i++) {
			char curr = str.charAt(i);
			boolean isKey = brackets.containsKey(curr);
			boolean isVal = brackets.containsValue(curr);
			
			if(isKey || isVal) {
				if(brackets.containsKey(curr)) {
					if(stack.empty()) {
						return false;
					} else if(brackets.get(curr) != stack.peek()) {
						return false;
					} else {
						stack.pop();
					}
				} else {
					stack.push(curr);
				}
			}
		}	
		
		if(!stack.empty()) {
			return false;
		}

    return true;
  }
}