package week5.bai5_4;

import java.io.Serializable;

public class Student implements Serializable {
    protected String id;
    protected String name;
    protected double gpa;

    public Student(String id, String name, double gpa)
    {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

}