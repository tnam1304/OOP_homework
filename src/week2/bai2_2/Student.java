package week2.bai2_2;

public class Student {
    private String id;
    private String name;
    private String email;
    private double gpa;

    public Student() {
        this.id = "";
        this.name = "";
        this.email = "";
        this.gpa = 0.0;
    }

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.email = "";
        this.gpa = 0.0;
    }

    public Student(Student other) {
        this.id = other.id;
        this.name = other.name;
        this.email = other.email;
        this.gpa = other.gpa;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public double getGpa() { return gpa; }

    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.err.println("Lỗi: GPA phải từ 0.0 đến 4.0.");
        }
    }

    public void displayInfo() {
        System.out.println("SV [ID=" + id + ", Name=" + name + ", Email=" + email + ", GPA=" + gpa + "]");
    }
}