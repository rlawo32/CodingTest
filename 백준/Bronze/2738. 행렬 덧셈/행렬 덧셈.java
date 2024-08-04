import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];
        for(int i=0; i<2; i++) {
            for(int j=0; j<N; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                for(int k=0; k<M; k++) {
                    arr[j][k] += Integer.parseInt(st.nextToken());
                }
            }
        }
        
        br.close();
        
        for(int i=0; i<N; i++) {
            for(int j=0; j<M; j++) {
                bw.write(arr[i][j]+" ");
            }
            bw.write("\n");
        }
        
        bw.flush();
        bw.close();
    }
}