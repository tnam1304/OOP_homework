package week1.bai1_5;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test các trường hợp thông thường
        System.out.println("gcd(12, 18) = " + sol.gcd(12, 18));

        // Test trường hợp số âm
        System.out.println("gcd(-12, 18) = " + sol.gcd(-12, 18));
        System.out.println("gcd(-12, -18) = " + sol.gcd(-12, -18));

        // Test trường hợp đặc biệt có số 0
        System.out.println("gcd(0, 5) = " + sol.gcd(0, 5));
        System.out.println("gcd(0, 0) = " + sol.gcd(0, 0));
    }
}