package problems;

import java.util.*;

public class PalindromeViaStack {

    static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<Character>();
        for (char c: str.toCharArray()) {
            stack.push(c);
        }
        String reverseStr = "";
        while (!stack.isEmpty()) {
            reverseStr += stack.pop();
        }
        return str.equals(reverseStr);
    }
 
    public static void main(String[] args) {
        System.out.println(isPalindrome("malayalam"));
    }
}