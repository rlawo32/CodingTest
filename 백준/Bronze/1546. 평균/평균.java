import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double[] arr = new double[n];
        double m = 0;
        int idx = 0;
        while (st.hasMoreTokens()) { arr[idx] = Integer.parseInt(st.nextToken()); idx++; }
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++) {
            m += arr[i] / arr[n-1] * 100;
        }
        System.out.print(m/n);
    }
}