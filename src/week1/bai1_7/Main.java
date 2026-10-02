package week1.bai1_7;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test số dương và số âm
        System.out.println("reverse(123) = " + sol.reverse(123));
        System.out.println("reverse(-123) = " + sol.reverse(-123));

        // Test số có chữ số 0 ở cuối
        System.out.println("reverse(1200) = " + sol.reverse(1200));

        // Test số vượt quá phạm vi int khi đảo ngược (trả về 0)
        System.out.println("reverse(1000000009) = " + sol.reverse(1000000009));
        System.out.println("reverse(1534236469) = " + sol.reverse(1534236469));
    }
}