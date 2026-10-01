package week1.bai1_4;

public class Solution {
    public long fibonacci(long n) {
        if (n < 0) return -1;
        if (n > 100) return Long.MAX_VALUE;
        if (n == 0) return 0;
        if (n == 1) return 1;

        long f0 = 0, f1 = 1, fn = 0;
        for (int i = 2; i <= n; i++) {
            if (Long.MAX_VALUE - f1 < f0) return Long.MAX_VALUE;
            fn = f0 + f1;
            f0 = f1;
            f1 = fn;
        }
        return fn;
    }
}