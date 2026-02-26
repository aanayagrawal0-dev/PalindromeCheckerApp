import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * Use Case 6: Queue + Stack Fairness Check
 * This class demonstrates palindrome validation using two different data structures:
 * - Queue (FIFO - First In First Out)
 * - Stack (LIFO - Last In First Out)
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // Define the input string to validate
        String input = "civic";
        
        // Create a Queue to store characters in FIFO order
        Queue<Character> queue = new LinkedList<>();
        
        // Create a Stack to store characters in LIFO order
        Stack<Character> stack = new Stack<>();
        
        // Insert each character into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }
        
        // Flag to track palindrome status
        boolean isPalindrome = true;
        
        // Compare characters until the queue becomes empty
        while (!queue.isEmpty()) {
            // queue.remove() gets the front, stack.pop() gets the back
            if (!queue.remove().equals(stack.pop())) {
                isPalindrome = false;
                break;
            }
        }
        
        // Display the result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}