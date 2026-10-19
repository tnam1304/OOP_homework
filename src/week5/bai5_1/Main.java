package week5.bai5_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhap so a: ");
            int a = scanner.nextInt();

            System.out.print("Nhap so b: ");
            int b = scanner.nextInt();

            int result = SafeDivision.divide(a, b);
            System.out.println("Ket qua a / b = " + result);
        } catch (InputMismatchException e) {
            System.out.println("Loi: Dau vao khong phai la so nguyen.");
        } catch (ArithmeticException e) {
            System.out.println("Loi: Khong the chia cho 0.");
        } finally {
            System.out.println("Program finished.");
            scanner.close();
        }
    }
}
