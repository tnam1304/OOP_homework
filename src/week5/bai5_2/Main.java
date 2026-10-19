package week5.bai5_2;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap duong dan tep nguon: ");
        String sourcePath = scanner.nextLine();

        System.out.print("Nhap duong dan tep dich: ");
        String destPath = scanner.nextLine();

        FileCopy.copyFile(sourcePath, destPath);

        scanner.close();
    }
}
