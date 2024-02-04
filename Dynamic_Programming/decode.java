package Dynamic_Programming;

import java.io.*;
import java.util.*;

public class decode {
    public static void main(String[] args) throws IOException {
        String text = "D:\\VsCode\\Java\\message.txt";
        System.out.println(decode(text));
    }

    public static String decode(String messageFile) throws IOException {
        HashMap<Integer, String> map = new HashMap<>();
        StringBuilder message = new StringBuilder();

        File file = new File(messageFile);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        while ((line = br.readLine()) != null) {
            // Skip empty lines if there is any 
            if (line.trim().isEmpty()) continue;
            String[] parts = line.trim().split("\\s+");
            map.put(Integer.parseInt(parts[0]), parts[1]);
        }

        int pyramidHeight = (int) Math.sqrt(map.size() * 2);

        for (int i = 1; i <= pyramidHeight; i++) {
            message.append(map.get(i * (i + 1) / 2)).append(" ");
        }
        br.close();
        return message.toString().trim();
    }
}

