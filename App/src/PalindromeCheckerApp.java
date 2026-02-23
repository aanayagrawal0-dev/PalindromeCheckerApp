public class PalindromeCheckerApp {
    public static void main(String[] args) {
            // Application entry point for UC2
            String input = "madam";
            boolean isPalindrome = true;

            // Logic to check if the string is a palindrome
            for (int i = 0; i < input.length() / 2; i++) {
                if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }

            // Output results
            if (isPalindrome) {
                System.out.println(input + " is a palindrome.");
            } else {
                System.out.println(input + " is not a palindrome.");
            }

    }}