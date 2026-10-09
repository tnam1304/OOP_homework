package week3.bai3_7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNext()) {
            String loaiPhong = scanner.next().toUpperCase();
            int soDem = scanner.nextInt();

            Phong phong = null;
            if ("S".equals(loaiPhong)) {
                phong = new PhongStandard(soDem);
            } else if ("V".equals(loaiPhong)) {
                phong = new PhongVIP(soDem);
            }

            if (phong != null) {
                System.out.println(phong.tinhTien());
            }
        }

        scanner.close();
    }
}