import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int i = n % m;
            n = n / m;
            char c = (char)(i+'A'-10);
            if(c >= 'A' && c <= 'Z') {
                sb.append(c+"");    
            } else {
                sb.append(i+"");
            }
        }
        System.out.print(sb.reverse().toString());
    }
}