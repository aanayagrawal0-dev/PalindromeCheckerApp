import java.util.ArrayDeque;
import java.util.Deque;

/**
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * Use Case 7: Deque Based Optimized Palindrome Checker
 * This class validates a palindrome using a Deque (Double Ended Queue).
 * It compares elements by removing them from both ends.
 */
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // Define the input string
        String input = "refer";
        
        // Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();
        
        // Add each character to the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }
        
        // Flag to track palindrome result
        boolean isPalindrome = true;
        
        // Continue comparison while more than one element exists
        while (deque.size() > 1) {
            // Compare the first character and the last character
            if (!deque.removeFirst().equals(deque.removeLast())) {
                isPalindrome = false;
                break;
            }
        }
        
        // Display the result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}