import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(line);
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            if(n == 0) break;
            if(n < m) {
                sb.append(m % n == 0 ? "factor" : "neither");
            } else {
                sb.append(n % m == 0 ? "multiple" : "neither");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}