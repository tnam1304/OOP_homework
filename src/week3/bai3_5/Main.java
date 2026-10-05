package week3.bai3_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();

            int firstQuote = line.indexOf('"');
            int lastQuote = line.lastIndexOf('"');

            String type = line.substring(0, firstQuote).trim();
            String name = line.substring(firstQuote + 1, lastQuote);
            String numbersPart = line.substring(lastQuote + 1).trim();
            String[] numbers = numbersPart.split("\\s+");

            if (type.equals("F")) {
                double baseSalary = Double.parseDouble(numbers[0]);
                double bonus = Double.parseDouble(numbers[1]);
                double penalty = Double.parseDouble(numbers[2]);

                employees[i] = new FullTimeEmployee(name, baseSalary, bonus, penalty);

            } else if (type.equals("P")) {
                double workingHours = Double.parseDouble(numbers[0]);
                double hourlyRate = Double.parseDouble(numbers[1]);

                employees[i] = new PartTimeEmployee(name, workingHours, hourlyRate);
            }
        }

        for (Employee emp : employees) {
            System.out.println(emp.getName() + " - " + emp.getType() + " - " + emp.getSalary());
        }

        sc.close();
    }
}