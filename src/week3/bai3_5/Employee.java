package week3.bai3_5;

public abstract class Employee {
    private String name;
    private String date;
    private String number;

    public Employee(String name)
    {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public abstract String getType();
    public abstract double getSalary();
}
