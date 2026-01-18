import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        int[] copy = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = i+1;
            copy[i] = i+1;
        }
        for(int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int idx = a-1;
            for(int j=b-1; j>=a-1; j--) {
                arr[idx] = copy[j];
                idx++;
            }
            for(int c=0; c<n; c++) {
                copy[c] = arr[c];
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            sb.append(arr[i] + " ");
        }
        System.out.print(sb);
    }
}