import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine(), " ");
        for(int i=0; i<N; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            if(X > tmp) {
                bw.write(String.valueOf(tmp)+ " ");
            }
        }
        
        br.close();
        
        bw.flush();
        bw.close();
    }
}