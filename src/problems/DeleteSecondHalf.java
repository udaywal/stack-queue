package problems;
import java.util.*;

public class DeleteSecondHalf {
    public static void main(String args[]) {
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0)
            queue.add(s.nextInt());
        deleteSecondHalf(queue);
        s.close();
    }

    // Method to delete the second half of the elements and print the remaining elements
    static void deleteSecondHalf(Queue<Integer> queue) {
        int position = queue.size() - (queue.size()+1)/2;
        Queue<Integer> temp_queue = new LinkedList<Integer>();
        while (position-- > 0) {
            temp_queue.add(queue.remove());
        }
    }
}