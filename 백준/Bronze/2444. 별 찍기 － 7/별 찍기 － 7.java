import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = n-1;
        int r = n+m;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<r; i++) {
            int t = Math.abs(m);
            for(int j=0; j<t; j++) {
                sb.append(" ");
            }
            for(int j=0; j<r-(t*2); j++) {
                sb.append("*");
            }
            sb.append("\n");
            m--;
        }
        System.out.print(sb);
    }
}