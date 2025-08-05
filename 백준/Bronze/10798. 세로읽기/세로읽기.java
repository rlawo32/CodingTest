import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[][] result = new String[5][];
        int maxLen = 0;
        for(int i=0; i<5; i++) {
            String[] temp = br.readLine().split("");;
            if(maxLen < temp.length) {
                maxLen = temp.length;
            }
            result[i] = temp;
        }
        br.close();
        for(int i=0; i<maxLen; i++) {
            for(int j=0; j<result.length; j++) {
                int chkLen = result[j].length;
                if(chkLen > i) {
                    bw.write(result[j][i]);
                } 
            }
        }
        bw.flush();
        bw.close();
    }
}