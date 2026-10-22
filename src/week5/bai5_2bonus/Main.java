package week5.bai5_2bonus;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    private Queue<Customer> customerQueue = new LinkedList<>();
    private Stack<Message> messageHistory = new Stack<>();

    public void addCustomer(Customer c) {
        customerQueue.offer(c);
        System.out.println("Khach hang den: " + c.name);
    }

    public Customer processCustomer() {
        Customer c = customerQueue.poll();
        if (c == null) {
            System.out.println("Khong con khach doi.");
            return null;
        }
        System.out.println("\n--- Dang xu ly: " + c.name + " ---");
        return c;
    }

    public void sendMessage(String id, String content) {
        messageHistory.push(new Message(id, content));
        System.out.println("Da gui: " + content);
    }

    public void undoMessage() {
        if (!messageHistory.isEmpty()) {
            Message m = messageHistory.pop();
            System.out.println("Undo tin nhan: " + m.content);
        } else {
            System.out.println("Lich su trong.");
        }
    }

    public void viewLastMessage() {
        if (!messageHistory.isEmpty()) {
            System.out.println("Tin nhan gan nhat: " + messageHistory.peek().content);
        } else {
            System.out.println("Chua co tin nhan.");
        }
    }

    public static void main(String[] args) {
        Main app = new Main();

        // Khach A, Khach B den
        app.addCustomer(new Customer("C01", "Khach A"));
        app.addCustomer(new Customer("C02", "Khach B"));

        // Xu ly A: go 3 dong, undo 1 dong, xem lai dong gan nhat
        app.processCustomer();
        app.sendMessage("M1", "Chao Khach A, minh ho tro gi duoc a?");
        app.sendMessage("M2", "Don hang cua ban dang tren duong giao.");
        app.sendMessage("M3", "Giao sai dia chi roi."); // Go sai

        app.undoMessage(); // Undo M3
        app.viewLastMessage(); // Xem lai M2

        // Xu ly B
        app.processCustomer();
        app.sendMessage("M4", "Chao Khach B!");

        // Xu ly tiep khi het khach
        app.processCustomer();
    }
}