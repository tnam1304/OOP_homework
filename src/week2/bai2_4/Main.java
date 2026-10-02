package week2.bai2_4;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Nam", new MyDate(1, 1, 2000));
        Employee emp2 = new Employee(emp1);

        emp1.getBirthday().setDay(2);
        emp1.getBirthday().setMonth(2);
        emp1.getBirthday().setYear(2022);

        System.out.println("Ngày sinh emp1: " + emp1.getBirthday());
        System.out.println("Ngày sinh emp2: " + emp2.getBirthday());
    }
}