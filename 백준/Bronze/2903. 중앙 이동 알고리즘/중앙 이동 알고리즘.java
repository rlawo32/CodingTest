import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = 2;
        for(int i=0; i<n; i++) {
            m += Math.pow(2, i);
        }
        System.out.print(m*m);
    }
}