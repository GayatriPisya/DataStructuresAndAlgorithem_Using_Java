package LoopsExamples5;

public class DoWhilePalindromeCheck {
    public static void main(String[] args) {
        int originalNumber = 44; 
        // int originalNumber = 43;
        int nub = originalNumber; 
        int reverse = 0;

        do {
            int digit = nub % 10; 
            reverse = reverse * 10 + digit; 
            nub /= 10; 
        } while (nub != 0);

        if (originalNumber == reverse) {
            System.out.println(originalNumber + " is a palindrome.");
        } else {
            System.out.println(originalNumber + " is not a palindrome.");
        }
    }
}
