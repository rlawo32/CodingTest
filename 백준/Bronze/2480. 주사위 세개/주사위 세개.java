import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int result = 0;
        
        if((a==b)&&(b==c)) {
            result = (a*1000)+10000;
        } else if((a!=b)&&(b!=c)&&(a!=c)) {
            result = (a>b) ? (a>c) ? (a*100) : (c*100) : (b>c) ? (b*100) : (c*100);
        } else {
            result = (a==b) ? (a*100)+1000 : (b==c) ? (b*100)+1000 : (c*100)+1000;
        }
        System.out.print(result);
    }
}