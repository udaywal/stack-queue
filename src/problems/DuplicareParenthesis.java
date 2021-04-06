package problems;
import java.util.*;

class DuplicareParenthesis {
    public static String findDuplicateParenthesis(String inputString) {
        Stack<Character> stack = new Stack<>();
        for (char c : inputString.toCharArray()) {
            if (c == ')') {
                char top = stack.peek();
                stack.pop();
                int count = 0;
                while (top != '(') {
                    count++;
                    top = stack.peek();
                    stack.pop();
                }
                if (count < 1) {
                    return "Input string contains duplicate parenthesis";
                }
            } else {
                stack.push(c);
            }
        }
        return "Input string does not contain duplicate parenthesis";
    }

    public static void main(String[] args){
        DuplicareParenthesis obj = new DuplicareParenthesis();
        String inputString = new String();
        Scanner in = new Scanner(System.in);
        inputString = in.nextLine();
        System.out.println(obj.findDuplicateParenthesis(inputString));
        in.close();
    }

}

