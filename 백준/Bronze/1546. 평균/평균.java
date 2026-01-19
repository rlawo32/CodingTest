import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double[] arr = new double[n];
        int idx = 0;
        int max = 0;
        while (st.hasMoreTokens()) {
            int score = Integer.parseInt(st.nextToken());
            arr[idx] = score;
            if(score > max) {
                max = score;
            }
            idx++;
        }
        double result = 0;
        for(int i=0; i<arr.length; i++) {
            result += arr[i] / max * 100;
        }
        System.out.print(result/n);
    }
}