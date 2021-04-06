package problems;

import java.util.*;

public class ReverseSecondHalf {
    
    static Stack<Integer> stack = new Stack<>();
    static Stack<Integer> temp_stack = new Stack<>();

    // Method to reverse the last half of the elements from the bottom of the stack
    static void reverseSecondHalfMethod() {
        int position = stack.size() - (stack.size()+1)/2;
        while (position-- > 0) {
            temp_stack.push(stack.pop());
        }
        reverse();
        while (!temp_stack.isEmpty()) {
            stack.push(temp_stack.pop());
        }
        System.out.println(stack);
    }

    static void insert_at_bottom(int x) {
        if (temp_stack.isEmpty()) {
            temp_stack.push(x);
        } else {
            int a = temp_stack.peek();
            temp_stack.pop();
            insert_at_bottom(x);
            temp_stack.push(a);
        }
    }
    
    static void reverse() {
        if(temp_stack.size() > 0) {
            int x = temp_stack.peek();
            temp_stack.pop();
            reverse();
            insert_at_bottom(x);
        }
    }
    
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0) {
            stack.push(s.nextInt());
        }
        s.close();
        reverseSecondHalfMethod();
    }

}