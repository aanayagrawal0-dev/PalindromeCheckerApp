import java.util.Stack;

/**
 * =========================================================
 * MAIN CLASS - UseCase13PalindromeCheckerApp
 * =========================================================
 * * Use Case 13: Performance Comparison
 * * Description:
 * This class measures and compares the execution
 * performance of palindrome validation algorithms.
 * * At this stage, the application:
 * - Uses a palindrome strategy implementation
 * - Captures execution start and end time
 * - Calculates total execution duration
 * - Displays benchmarking results
 * * This use case focuses purely on performance
 * measurement and algorithm comparison.
 * * The goal is to introduce benchmarking concepts.
 * * @author Developer
 * @version 13.0
 */
public class UseCase13PalindromeCheckerApp {

    /**
     * Application entry point for UC13.
     * * @param args Command-line arguments
     */
    public static void main(String[] args) {
        String testInput = "racecar";
        PalindromeStrategy strategy = new StackStrategy();

        // Capture start time in nanoseconds
        long startTime = System.nanoTime();

        // Execute the strategy
        boolean result = strategy.check(testInput);

        // Capture end time
        long endTime = System.nanoTime();

        // Calculate total execution duration
        long duration = endTime - startTime;

        // Display benchmarking results
        System.out.println("Input: " + testInput);
        System.out.println("Is Palindrome: " + result);
        System.out.println("Execution Time: " + duration + " ns");
    }
}

/**
 * =========================================================
 * INTERFACE - PalindromeStrategy
 * =========================================================
 * This interface defines a contract for all
 * palindrome checking algorithms.
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * =========================================================
 * CLASS - StackStrategy
 * =========================================================
 * This class provides a Stack based implementation
 * of the PalindromeStrategy interface.
 * * It uses LIFO behavior to reverse characters
 * and compare them with the original sequence.
 */
class StackStrategy implements PalindromeStrategy {

    /**
     * Implements palindrome validation using Stack.
     * * @param input String to validate
     * @return true if palindrome, false otherwise
     */
    @Override
    public boolean check(String input) {
        if (input == null) return false;

        // Create a stack to store characters
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push each character of the input string onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from the stack
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}