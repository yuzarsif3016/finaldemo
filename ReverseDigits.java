public class ReverseDigits {
    public static void main(String[] args) {
        // Initialize a number to some integer value
        int originalNumber = 12345;

        // Reverse the digits of the number
        int reversedNumber = reverseDigits(originalNumber);

        // Print the original and reversed values
        System.out.println("Original Number: " + originalNumber);
        System.out.println("Reversed Number: " + reversedNumber);
    }

    // Function to reverse the digits of a number
    private static int reverseDigits(int number) {
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }
}
