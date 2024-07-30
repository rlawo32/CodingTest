import java.io.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String N = br.readLine();
        int len = N.length()/2;
        int res = 1;
        
        for(int i=0; i<len; i++) {
            if(!N.substring(i, i+1).equals(N.substring(N.length()-(i+1), N.length()-i))) {
                res = 0;
                break;
            }
        }
        bw.write(res+"");
        
        bw.flush();
        bw.close();
    }
}