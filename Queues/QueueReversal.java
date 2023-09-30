/*
 *  Queue Reversal
 *  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
 *  rv -> {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}
*/

import java.util.*;

public class QueueReversal {

    public static void reverse(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        reverse(q);
        System.out.println(q);
    }
}

/*
 * Output:
 * 10 9 8 7 6 5 4 3 2 1
 */
/*This Java program demonstrates the reversal of a queue using a stack. The `reverse` method takes a `Queue<Integer>` as input and reverses its elements using a `Stack<Integer>`. The main components of the program are as follows:

1. **`reverse` method:**
   - Takes a `Queue<Integer>` (`q`) as input.
   - Creates a `Stack<Integer>` (`s`) to temporarily store elements.
   - Empties the original queue, pushing each element onto the stack.
   - Empties the stack, pushing each element back into the queue.
   - As a result, the order of elements in the queue is reversed.

2. **`main` method:**
   - Creates a `Queue<Integer>` (`q`) using a `LinkedList`.
   - Enqueues elements 1 through 10 into the queue.
   - Calls the `reverse` method to reverse the order of elements in the queue.
   - Prints the reversed queue.

3. **Explanation:**
   - The program uses a stack to reverse the order of elements in the queue.
   - The `reverse` method iteratively removes elements from the front of the queue and pushes them onto the stack.
   - After the queue is emptied, the method pops elements from the stack and enqueues them back into the queue, effectively reversing the order.
   - The output demonstrates that the original queue `{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}` has been reversed to `{10, 9, 8, 7, 6, 5, 4, 3, 2, 1}`.

The reversal is achieved by using the Last-In-First-Out (LIFO) property of the stack data structure to reverse the order of elements in the queue.*/
