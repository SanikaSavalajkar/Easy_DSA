/*
 *      First non-repeating letter in a stream of characters. 
 */

import java.util.LinkedList;
import java.util.Queue;
import javax.management.Query;

public class FirstNonRepeatingLetter {

    public static void printNonRepeating(String str) {
        int freq[] = new int[26]; // 'a' - 'z'
        Queue<Character> q = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }
        }
        if (q.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(q.peek());
        }
    }

    public static void main(String[] args) {
        String str = "aabccxb";
        printNonRepeating(str);
    }
}

/*
 * Output:
 * x
 */
/*This Java program finds and prints the first non-repeating letter in a stream of characters. The main components of the program are as follows:

1. **`printNonRepeating` method:**
   - Takes a string (`str`) as input.
   - Uses an array (`freq`) to keep track of the frequency of each letter in the alphabet.
   - Utilizes a queue (`q`) to maintain the order of characters in the stream.
   - Iterates through each character in the input string.
   - Enqueues each character into the queue and increments its frequency in the `freq` array.
   - Checks if the front character of the queue has a frequency greater than 1. If yes, it removes characters from the front until a non-repeating character is found.
   - Prints the first non-repeating character in the stream. If the queue is empty, indicating no non-repeating character, it prints -1.

2. **`main` method:**
   - Initializes a string (`str`) with the value "aabccxb".
   - Calls the `printNonRepeating` method with the string.

3. **Explanation:**
   - The program processes each character in the input string one by one.
   - It uses a queue to keep track of the order of characters as they appear in the stream.
   - The frequency array is used to determine if a character is repeating.
   - When a character is enqueued, it is checked for repetition. If it is repeating, the front character is dequeued until a non-repeating character is found.
   - The program prints the first non-repeating character in the stream. In the provided example, the output is "x" because 'x' is the first non-repeating character in the stream "aabccxb".*/
