import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int n = 0;
        int max = 0;
        String s = "";
        while ((line = br.readLine()) != null) {
            int m = 0;
            n++;
            StringTokenizer st = new StringTokenizer(line);
            while (st.hasMoreTokens()) {
                m++;
                int i = Integer.parseInt(st.nextToken());
                if(i >= max) {
                    max = i;
                    s = n + " " + m;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(max).append("\n").append(s);
        System.out.print(sb);
    }
}