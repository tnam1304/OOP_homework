package week1.bai1_8;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test số Palindrome chuẩn
        System.out.println("isPalindrome(121) = " + sol.isPalindrome(121));
        System.out.println("isPalindrome(12321) = " + sol.isPalindrome(12321));

        // Test số âm (số âm không thể là Palindrome do có dấu -)
        System.out.println("isPalindrome(-121) = " + sol.isPalindrome(-121));

        // Test số có chữ số 0 ở cuối
        System.out.println("isPalindrome(10) = " + sol.isPalindrome(10));
        System.out.println("isPalindrome(1200) = " + sol.isPalindrome(1200));
    }
}