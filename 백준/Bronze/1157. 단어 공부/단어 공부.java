import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        Map<String, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            String r = String.valueOf(c).toUpperCase();
            map.put(r, map.getOrDefault(r, 0) + 1);
        }    
        String result = "";
        int max = 0;
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() > max) {
                max = entry.getValue();
                result = entry.getKey();
            } else if(entry.getValue() == max) {
                result = "?";
            }
        }
        System.out.print(result);
    }
}