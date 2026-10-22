package week5.bai5_1bonus;
public class Main {

    public static void useString() {
        long start = System.currentTimeMillis();
        String s = "";
        for (int i = 0; i < 100000; i++) {
            s += "Hello";
        }
        long end = System.currentTimeMillis();
        System.out.println("Thoi gian dung String: " + (end - start) + " ms");
    }

    public static void useStringBuffer() {
        long start = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 100000; i++) {
            sb.append("Hello");
        }
        long end = System.currentTimeMillis();
        System.out.println("Thoi gian dung StringBuffer: " + (end - start) + " ms");
    }

    public static void contentAnalysis(String text) {
        // Dem so cau dua vao dau ., ?, !
        String[] sentences = text.split("[.?!]+");
        int count = 0;
        for (String s : sentences) {
            if (!s.trim().isEmpty()) count++;
        }
        System.out.println("So luong cau: " + count);

        // Thay thế "Java" thanh "Python"
        String replaced = text.replaceAll("Java", "Python");
        System.out.println("Van ban sau thay the:\n" + replaced);
    }

    public static void main(String[] args) {
        useString();
        useStringBuffer();

        System.out.println("\n--- Content Analysis ---");
        String sampleText = "Java is powerful! Is Java easy to learn? Yes, Java is great.";
        contentAnalysis(sampleText);
    }
}
