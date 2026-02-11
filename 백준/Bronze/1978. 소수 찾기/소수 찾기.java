import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;
        
        for(int i = 0; i < n; i++) {
            if(func1(Integer.parseInt(st.nextToken()))) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }

    public static boolean func1(int m) {
        if(m < 2) return false;
        if(m == 2) return true;
        
        for(int i = 2; i <= Math.sqrt(m); i++) {
            if(m % i == 0) {
                return false; 
            }
        }
        return true;
    }
}