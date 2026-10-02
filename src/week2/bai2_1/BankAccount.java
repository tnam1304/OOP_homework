package week2.bai2_1;

public class BankAccount {
    private final String accountNumber;
    private double balance;
    private String ownerName;

    public BankAccount(String accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = 0.0;
    }

    public BankAccount(String accountNumber, String ownerName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        if (initialBalance < 0) {
            System.err.println("Lỗi: Số dư ban đầu không được âm. Đã gán mặc định bằng 0.");
            this.balance = 0.0;
        } else {
            this.balance = initialBalance;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Nạp thành công: " + amount + " | Số dư mới: " + this.balance);
        } else {
            System.err.println("Lỗi: Số tiền nạp phải lớn hơn 0.");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Rút thành công: " + amount + " | Số dư còn lại: " + this.balance);
            return true;
        } else {
            System.err.println("Lỗi rút tiền: Số tiền rút không hợp lệ hoặc vượt quá số dư.");
            return false;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getOwnerName() {
        return this.ownerName;
    }
}