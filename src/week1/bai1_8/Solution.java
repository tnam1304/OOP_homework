package week1.bai1_8;

public class Solution {
    public boolean isPalindrome(int n) {
        if (n < 0) return false;

        int original = n;
        long reversed = 0;

        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return original == reversed;
    }
}