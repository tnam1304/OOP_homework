package week5.bai5_3;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Reader {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ten tep de doc (vd: numbers.dat): ");
        String filePath = scanner.nextLine();

        int count = 0;
        System.out.println("--- DƯ LIỆU TRONG TỆP ---");

        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            while (true) {
                int num = dis.readInt();
                System.out.println(num);
                count++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Tep khong ton tai!");
        } catch (EOFException e) {
            System.out.println("-------------------------");
            System.out.println("Da doc het tep. Tong so luong so nguyen: " + count);
        } catch (IOException e) {
            System.out.println("Loi I/O trong qua trinh doc tep.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
