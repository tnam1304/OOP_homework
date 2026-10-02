package week2.bai2_2;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId("SV01");
        s1.setName("An");

        Student s2 = new Student("SV02", "Nam");
        s2.setEmail("nam@gmail.com");

        Student s3 = new Student(s2);
        s3.setId("SV03");

        s1.setGpa(-1.5);
        s2.setGpa(3.5);
        s3.setGpa(4.0);

        s1.displayInfo();
        s2.displayInfo();
        s3.displayInfo();
    }
}