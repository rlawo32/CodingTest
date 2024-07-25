import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[N];
        
        for(int i=0; i<N; i++) {
            arr[i] = i+1;
        }
        
        for(int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            int tmp = arr[a-1];
            arr[a-1] = arr[b-1];
            arr[b-1] = tmp;
        }
        
        br.close();
        
        for(int i : arr) {
            bw.write(i+" ");
        }
        
        bw.flush();
        bw.close();
    }
}