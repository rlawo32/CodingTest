import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 0;
        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            StringBuilder sb = new StringBuilder();
            for(int i=s.length()-1; i>=0; i--) {
                sb.append(s.substring(i, i+1));
            }
            int n = Integer.parseInt(sb.toString());
            if(n > max) {
                max = n;
            }
        }
        System.out.print(max);
    }
}