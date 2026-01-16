import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int i = 0;
        while (st.hasMoreTokens()) { arr[i] = Integer.parseInt(st.nextToken()); i++; }
        int max = arr[0];
        int min = arr[0];
        for(int j=0; j<arr.length; j++) {
            if(max < arr[j]) max = arr[j];
            if(min > arr[j]) min = arr[j];
        }
        System.out.print(min + " " + max);
    }
}