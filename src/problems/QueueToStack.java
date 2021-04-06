package problems;

import java.util.*;

public class QueueToStack {

    Queue<Integer> queue = new LinkedList<Integer>();

    public void push(int element) {
        int size = queue.size();
        queue.add(element);
        for (int i=0; i<size; i++) {
            int x = queue.remove();
            queue.add(x);
        }
    }

    public int pop() {
        if (queue.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int x = queue.remove();
        return x;
    }

    public int top() {
        if (queue.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        return queue.peek();
    }
     
    // Returns true if Stack is empty else false
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        QueueToStack obj = new QueueToStack();
        Scanner in = new Scanner(System.in);

        /*Enter the number of elements you want to add in the stack */
        int n = in .nextInt();

        /*Enter the elements of the stack */
        for (int i = 0; i < n; i++) {
            obj.push(in.nextInt());
        }
        in.close();

        System.out.println(obj.top());
        obj.pop();
        System.out.println(obj.top());
    }
    
}
