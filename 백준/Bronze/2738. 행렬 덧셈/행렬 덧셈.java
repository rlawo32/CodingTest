import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] result = new int[n][m];
        for(int i=0; i<2; i++) {
            for(int j=0; j<n; j++) {
                st = new StringTokenizer(br.readLine());
                for(int k=0; k<m; k++) {
                    result[j][k] += Integer.parseInt(st.nextToken());
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<result.length; i++) {
            for(int j=0; j<result[i].length; j++) {
                sb.append(result[i][j] + " ");
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }
}