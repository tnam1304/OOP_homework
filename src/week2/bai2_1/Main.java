package week2.bai2_1;

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("ACC001", "Nguyen Van A", 1000.0);

        acc.deposit(-200);

        acc.withdraw(1500);

        acc.withdraw(300);

        System.out.println("Số dư cuối cùng kiểm tra qua getBalance(): " + acc.getBalance());
    }
}