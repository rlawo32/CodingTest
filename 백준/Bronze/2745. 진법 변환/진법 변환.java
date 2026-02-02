import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        int n = Integer.parseInt(st.nextToken());
        int power = 0;
        long result = 0L;
        for(int i=s.length()-1; i>=0; i--) {
            char c = s.charAt(i);
            int j = 0;
            if(c >= 'A' && c <= 'Z') {
                j = c-'A'+10;
            } else {
                j = c-'0';
            } 
            result += j * (Math.pow(n, power++));
        }
        System.out.print(result);
    }
}