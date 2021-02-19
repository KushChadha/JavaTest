package unify;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		String s = "([)]";
		
		Stack<Character> stack = new Stack<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push(s.charAt(i));
			} else if (s.charAt(i) == ')') {
				if (stack.lastElement().equals('(')) {
					stack.pop();
				} else {
					stack.push(s.charAt(i));
				}
			}
			if (s.charAt(i) == '{') {
				stack.push(s.charAt(i));
			} else if (s.charAt(i) == '}') {
				if (stack.lastElement().equals('{')) {
					stack.pop();
				} else {
					stack.push(s.charAt(i));
				}
			}
			if (s.charAt(i) == '[') {
				stack.push(s.charAt(i));
			} else if (s.charAt(i) == ']') {
				if (stack.lastElement().equals('[')) {
					stack.pop();
				} else {
					stack.push(s.charAt(i));
				}
			}
		}
		
		if (stack.isEmpty()) {
			System.out.println("true");
		} else 
			System.out.println("false");
		
		
	}

}
