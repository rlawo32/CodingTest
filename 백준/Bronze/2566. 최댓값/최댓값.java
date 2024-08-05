import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int[][] arr = new int[9][9];
        for(int i=0; i<9; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        br.close();
        int max = 0;
        int row = 0;
        int col = 0;
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                if(arr[i][j] >= max) {
                    max = arr[i][j];
                    row = i+1;
                    col = j+1;
                }
            }
        }
        
        bw.write(max+"\n"+row+" "+col);
        bw.flush();
        bw.close();
    }
}