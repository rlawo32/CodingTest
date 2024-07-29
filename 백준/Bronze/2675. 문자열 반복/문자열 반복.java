import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int len = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0; i<len; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            String b = st.nextToken();
            String res = "";
            for(int j=0; j<b.length(); j++) {
                for(int k=0; k<a; k++) {
                    res += b.substring(j, j+1);
                }
            }
            bw.write(res+"\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}