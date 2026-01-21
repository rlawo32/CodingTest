import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = {1, 1, 2, 2, 2, 8};
        int[] result = new int[6];
        int idx = 0;
        while (st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            if(idx > 5) { break; }
            result[idx] = arr[idx] - n;
            idx++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i : result) {
            sb.append(i + " ");
        }
        System.out.print(sb);
    }
}