package week2.bai2_3;

public class Main {
    public static void swap(NumberWrapper a, NumberWrapper b) {
        NumberWrapper temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {
        NumberWrapper n1 = new NumberWrapper(5);
        NumberWrapper n2 = new NumberWrapper(10);

        swap(n1, n2);

        System.out.println("n1.value = " + n1.getValue());
        System.out.println("n2.value = " + n2.getValue());
    }
}