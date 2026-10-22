package week5.bai5_4;

import java.io.*;
import java.util.*;

public class Main {

    public static List<Student> nhapDS(Scanner sc) {
        List<Student> list = new ArrayList<>();
        while (true) {
            String id = sc.nextLine();
            if (id.equalsIgnoreCase("END")) break;
            String name = sc.nextLine();
            double gpa = sc.nextDouble();
            sc.nextLine(); // Xoa bo dem
            list.add(new Student(id, name, gpa));
        }
        return list;
    }

    public static void ghiFile(String f, List<Student> list) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
        for (Student s : list) {
            oos.writeObject(s);
        }
        oos.close();
    }

    public static void docFile(String f, List<Student> list) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
        while (true) {
            list.add((Student) ois.readObject());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String file = "sv.dat";

        List<Student> listInput = nhapDS(sc);
        List<Student> listOutput = new ArrayList<>();

        try {
            ghiFile(file, listInput);
            docFile(file, listOutput);
        } catch (FileNotFoundException e) {
            System.out.println("Loi khong tim thay file");
        } catch (EOFException e) {
            System.out.println("Da doc xong file");
        } catch (ClassNotFoundException e) {
            System.out.println("Loi khong tim thay class");
        } catch (IOException e) {
            System.out.println("Loi xuat nhap file");
        }

        // In danh sach da doc ra man hinh
        for (Student s : listOutput) {
            System.out.println(s.id + " " + s.name + " " + s.gpa);
        }
    }
}