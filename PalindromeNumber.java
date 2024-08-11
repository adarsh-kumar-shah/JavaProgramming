class PalindromeNumber {
    public boolean isPalindrome(int x) {
        // A negative number cannot be a palindrome
        // A number ending with 0 cannot be a palindrome unless it is 0
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;

        int reversed = 0;
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        // When the length is odd, we can get rid of the middle digit by reversed/10
        return x == reversed || x == reversed / 10;
    }

    public static void main(String[] args) {
        PalindromeNumber pn = new PalindromeNumber();
    
        // Replace the Scanner input with a predefined number for testing
        int num = 121; // Example number
    
        if (pn.isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is not a palindrome.");
        }
    }
    
}
