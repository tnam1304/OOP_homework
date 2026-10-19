package week4.bai4_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String id = sc.next();
            String name = sc.next();
            double baseSalary = sc.nextDouble();

            if (type.equalsIgnoreCase("O")) {
                employees[i] = new OfficeWorker(id, name, baseSalary);
            } else if (type.equalsIgnoreCase("T")) {
                double overtimeHours = sc.nextDouble();
                employees[i] = new Technician(id, name, baseSalary, overtimeHours);
            }
        }

        double totalPay = 0;

        for (Employee emp : employees) {
            double pay = emp.calculatePay();
            totalPay += pay;

            System.out.println(emp.getName() + " - Pay: " + pay);
            emp.work();
            System.out.println();
        }

        System.out.println("Total Pay = " + totalPay);

        sc.close();
    }
}