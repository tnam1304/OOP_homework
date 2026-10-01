package week1.bai1_6;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println("isPrime(-7) = " + sol.isPrime(-7));
        System.out.println("isPrime(0) = " + sol.isPrime(0));
        System.out.println("isPrime(1) = " + sol.isPrime(1));
        System.out.println("isPrime(2) = " + sol.isPrime(2));
        System.out.println("isPrime(29) = " + sol.isPrime(29));
        System.out.println("isPrime(100) = " + sol.isPrime(100));
        System.out.println("isPrime(2147483647) = " + sol.isPrime(2147483647));
    }
}