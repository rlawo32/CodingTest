import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();
        int[] arr = {1, 1, 2, 2, 2, 8};
        for(int i=0; i<6; i++) {
            int n = Integer.parseInt(st.nextToken());
            bw.write((arr[i]-n)+" ");
        }
        bw.flush();
        bw.close();
    }
}