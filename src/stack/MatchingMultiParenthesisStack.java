package stack;

import java.util.Stack;
/** 
 * Matching parenthesis problem solution through the Stack
 * 
 * "({})"
 * "(({)})"
 * "(()"
 * "())"
 * "()%"
 * 
 **/

public class MatchingMultiParenthesisStack {

    private static Stack<Character> stack = new Stack<Character>();
    private static boolean match(String string) throws Exception {
        for (char c: string.toCharArray()) {
            if (c == '(' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == '}') {
                if (!stack.isEmpty()) {
                    if ((stack.peek() == '(' && c == ')') || (stack.peek() == '{' && c == '}')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                throw new Exception("Invalid character in the string: "+c);
            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] arg) {
        try {
            System.out.print(match("(({)})"));
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
    }
    
}
