import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> map = new HashMap<>();
        String line;
        while ((line = br.readLine()) != null) {
            int n = Integer.parseInt(line);
            int m = n % 42;
            map.put(m, map.getOrDefault(m, 0)+1);
        }
        System.out.print(map.size());
    }
}