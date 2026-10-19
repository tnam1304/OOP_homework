package week4.bai4_3;

public class Technician extends Employee{
    protected double overtimeHours;
    public Technician(String id, String name, double baseSalary, double overtimeHours)
    {
        super(id,name,baseSalary);
        this.overtimeHours = overtimeHours;
    }
    @Override
    public double calculatePay()
    {
        return baseSalary + overtimeHours * 20000;
    }
    @Override
    public void work()
    {
        System.out.println("Lap dat thiet bi");
    }
}
