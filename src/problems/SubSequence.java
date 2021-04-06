/** 
 * 
 * Given a sequence S1, check if it exists in another sequence S2. 
 * Assume that all the elements are distinct in both the sequences. Sequence S1 exists in sequence S2 if all the elements of S1 appear in S2 and their relative ordering is the same, which means that there may be elements in the middle of two elements in S2, which are adjacent in S1.
 * Example:
 * For input: 
 * S1 = 1 2 3
 * S2 = 1 4 2 5 6 3
 * Return: True because S2 also contains 1, 2, 3
 * 
 * **/

package problems;

import java.util.Scanner;
import java.util.Stack;

public class SubSequence {

    public static Boolean contains(Stack<Integer> sequence1, Stack<Integer> sequence2) {
        while (sequence2.size() > 0) {
            if (sequence1.peek() == sequence2.peek()) {
                sequence1.pop();
                sequence2.pop();
            } else {
                sequence2.pop();
            }
        }
        if (sequence1.empty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        Stack<Integer> sequence1 = new Stack<Integer>();
        Stack<Integer> sequence2 = new Stack<Integer>();
        for (String elem1 : line1.split(" ")) {
            sequence1.add(Integer.parseInt(elem1));
        }
        for (String elem2 : line2.split(" ")) {
            sequence2.add(Integer.parseInt(elem2));
        }
        scanner.close();
        Boolean isSubsequence = contains(sequence1, sequence2);
        System.out.println(isSubsequence);
    }
    
}

