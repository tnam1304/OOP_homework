package week1.bai1_7;

public class Solution {
    public int reverse(int n) {
        long reversed = 0;
        int temp = n;

        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) reversed;
    }
}