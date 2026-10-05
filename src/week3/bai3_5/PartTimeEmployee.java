package week3.bai3_5;

public class PartTimeEmployee extends Employee {
    private double workingHours;
    private double hourlyRate;

    public PartTimeEmployee(String name, double workingHours, double hourlyRate)
    {
        super(name);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String getType()
    {
        return "Part-time";
    }

    @Override
    public double getSalary()
    {
        return workingHours * hourlyRate;
    }
}
