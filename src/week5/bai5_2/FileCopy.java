package week5.bai5_2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileCopy {

    public static void copyFile(String sourcePath, String destPath) {
        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            try {
                fr = new FileReader(sourcePath);
                br = new BufferedReader(fr);
            } catch (FileNotFoundException e) {
                System.out.println("Source file not found.");
                return;
            }

            try {
                fw = new FileWriter(destPath);
                pw = new PrintWriter(fw);
            } catch (FileNotFoundException e) {
                System.out.println("Cannot create destination file.");
                return;
            }

            String line;
            int lineCount = 0;
            while ((line = br.readLine()) != null) {
                pw.println(line);
                lineCount++;
            }

            System.out.println("Sao chep thanh cong! So dong da sao chep: " + lineCount);

        } catch (IOException e) {
            System.out.println("I/O error.");
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (pw != null) {
                    pw.close();
                }
            } catch (IOException e) {
                System.out.println("I/O error.");
                e.printStackTrace();
            }
        }
    }
}
