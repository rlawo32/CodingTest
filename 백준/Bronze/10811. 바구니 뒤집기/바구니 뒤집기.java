import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[M];
        
        for(int i=0; i<M; i++) {
            arr[i] = i+1;
        }
        
        for(int i=0; i<N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken())-1;
            int b = Integer.parseInt(st.nextToken())-1;
			int len = (b-(a-1))/2;
            
            for(int j=0; j<len; j++) {
                int tmp = arr[a];
                arr[a] = arr[b];
                arr[b] = tmp;
				a++;
                b--;
            }
			
        }
        
        br.close();
        
        for(int i : arr) {
            bw.write(i+" ");
        }
        bw.flush();
        bw.close();
    }
}