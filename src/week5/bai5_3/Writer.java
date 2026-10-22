package week5.bai5_3;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Writer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten tep de ghi (vd: numbers.dat): ");
        String filePath = scanner.nextLine();

        System.out.print("Nhap so luong so nguyen n: ");
        int n = scanner.nextInt();

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            for (int i = 0; i < n; i++) {
                System.out.print("Nhap so thu " + (i + 1) + ": ");
                int num = scanner.nextInt();
                dos.writeInt(num);
            }
            System.out.println("Da ghi thành cong " + n + " so vao tep!");
        } catch (IOException e) {
            System.out.println("Loi I/O trong qua trinh ghi tep.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}