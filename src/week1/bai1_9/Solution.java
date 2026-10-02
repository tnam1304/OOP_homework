package week1.bai1_9;

public class Solution {
    public int sumOfDigits(int n) {
        if (n < 0) {
            n = -n;
        }

        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}