package problems;

import java.util.*;

class One {
    public static void main(String arg[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(5);
        stack.push(8);
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        System.out.println(queue);
    }
}