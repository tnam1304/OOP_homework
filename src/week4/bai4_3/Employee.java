package week4.bai4_3;

public abstract class Employee implements IWorkable{
    protected String id;
    protected String name;
    protected double baseSalary;

    public Employee(String id, String name, double baseSalary)
    {
        this.id = id;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName()
    {
        return this.name;
    }

    public abstract double calculatePay();

}
