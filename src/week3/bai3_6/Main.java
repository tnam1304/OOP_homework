package week3.bai3_6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        List<Product> products = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String type = sc.next();
            String name = sc.next().replace("\"", "");
            double price = sc.nextDouble();

            if (type.equalsIgnoreCase("E")) {
                double warranty = sc.nextDouble();
                products.add(new Electronics("E" + i, name, price, warranty));
            } else if (type.equalsIgnoreCase("F")) {
                LocalDate expiry = LocalDate.parse(sc.next());
                products.add(new Food("F" + i, name, price, expiry));
            }
        }

        double total = 0;
        for (Product p : products) {
            double finalPrice = p.getFinalPrice();
            System.out.println(p.name + " - " + p.getType() + " - " + finalPrice);
            total += finalPrice;
        }

        System.out.println("Total = " + total);
        sc.close();
    }
}