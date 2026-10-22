package week5.bai5_3bonus;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String text = "Java is a popular programming language. Java is used to develop mobile apps, " +
                "web apps, desktop apps, games and much more! Learning Java is fun and useful.";

        // Chuan hoa
        String cleaned = text.toLowerCase().replaceAll("[^a-z0-9\\s]", "");
        String[] words = cleaned.split("\\s+");

        // Dem tu bang HashMap
        Map<String, Integer> map = new HashMap<>();
        for (String w : words) {
            if (w.isEmpty()) continue;
            if (!map.containsKey(w)) {
                map.put(w, 1);
            } else {
                map.put(w, map.get(w) + 1);
            }
        }

        // Thong ke
        String maxWord = "";
        int maxCount = 0;
        List<String> uniqueWords = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxWord = entry.getKey();
            }
            if (entry.getValue() == 1) {
                uniqueWords.add(entry.getKey());
            }
        }

        System.out.println("Tu xuat hien nhieu nhat: '" + maxWord + "' (" + maxCount + " lan)");
        System.out.println("Cac tu chi xuat hien 1 lan: " + uniqueWords);
    }
}
