import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int M = 1;
        br.close();
        for(int i=1; i<=(N*2-1); i++) {
            int n = Math.abs(i-N);
            String line = "";
            for(int j=0; j<n; j++) {
                line += " ";
            }
            for(int k=0; k<M; k++) {
                line += "*";
            }
            if(i < N) {
                M += 2;    
            } else {
                M -= 2;
            }
            bw.write(line+"\n");
        }
        bw.flush();
        bw.close();
    }
}