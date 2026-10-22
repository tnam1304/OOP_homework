package week5.bai5_5;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap duong dan file config: ");
        String path = sc.nextLine();

        BufferedReader br = null;
        Map<String, String> config = new HashMap<>();

        try {
            FileReader fr = new FileReader(path);
            br = new BufferedReader(fr);
            String line;

            // 1. Doc file theo tung dong va luu vao Map
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty() || !line.contains("=")) continue;

                String[] parts = line.split("=", 2);
                config.put(parts[0].trim(), parts[1].trim());
            }

            // 2. Kiem tra bat buoc phai co username va timeout
            if (!config.containsKey("username")) {
                throw new InvalidConfigException("Missing username");
            }
            if (!config.containsKey("timeout")) {
                throw new InvalidConfigException("Missing timeout");
            }

            // 3. Kiem tra timeout phai > 0 (Integer.parseInt se tu nem NumberFormatException neu sai dinh dang)
            int timeout = Integer.parseInt(config.get("timeout"));
            if (timeout <= 0) {
                throw new InvalidConfigException("timeout must be > 0");
            }

            // 4. Kiem tra maxConnections neu co thi phai >= 1
            if (config.containsKey("maxConnections")) {
                int maxConn = Integer.parseInt(config.get("maxConnections"));
                if (maxConn < 1) {
                    throw new InvalidConfigException("maxConnections must be >= 1");
                }
            }

            // 5. In cau hinh va thong bao neu hop le
            for (Map.Entry<String, String> entry : config.entrySet()) {
                System.out.println(entry.getKey() + "=" + entry.getValue());
            }
            System.out.println("Config loaded successfully.");

        } catch (FileNotFoundException e) {
            System.out.println("Config file not found.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        } catch (InvalidConfigException e) {
            System.out.println("Invalid config: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error.");
            e.printStackTrace();
        } finally {
            // Dam bao dong file trong finally
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    // Bo qua loi khi dong file
                }
            }
            // Du loi hay khong luon in dong nay
            System.out.println("Program finished.");
        }

        sc.close();
    }
}