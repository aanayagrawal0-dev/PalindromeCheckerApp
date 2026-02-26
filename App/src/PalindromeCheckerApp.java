import java.util.Stack;

/**
 * MAIN CLASS - UseCase5PalindromeCheckerApp
 * Use Case 5: Stack Based Palindrome Checker
 * This class validates a palindrome using a Stack (LIFO principle).
 */
public class PalindromeCheckerApp {

    public static void main(String[] args) {
        // Declare and initialize the input string
        String input = "noon";
        
        // Create a Stack to store characters
        Stack<Character> stack = new Stack<>();
        
        // Push each character of the string into the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }
        
        // Assume palindrome initially
        boolean isPalindrome = true;
        
        // Iterate again through the original string and compare with popped characters
        for (char c : input.toCharArray()) {
            // Stack pops in reverse order, so we compare start of string with end
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }
        
        // Display the result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}