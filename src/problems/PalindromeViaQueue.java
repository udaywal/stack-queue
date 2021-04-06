package problems;
import java.util.*;

public class PalindromeViaQueue {

    static boolean isPalindrome(String str) {
        Queue<Character> queue = new LinkedList<Character>();
        for (int i = str.length()-1; i >=0; i--) {
            queue.add(str.charAt(i));
        }
        String reverseStr = "";
        while (!queue.isEmpty()) {
            reverseStr += queue.remove();
        }
        return str.equals(reverseStr);
    }
 
    public static void main(String[] args) {
        System.out.println(isPalindrome("malaayalam"));
    }
    
}
