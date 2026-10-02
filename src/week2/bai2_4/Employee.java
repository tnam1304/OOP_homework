package week2.bai2_4;

public class Employee {
    private String name;
    private MyDate birthday;

    public Employee(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Employee(Employee other) {
        this.name = other.name;
        this.birthday = new MyDate(other.birthday);
    }

    public String getName() { return name; }
    public MyDate getBirthday() { return birthday; }
}