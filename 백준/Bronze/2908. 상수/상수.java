import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();
        
        StringBuffer sb1 = new StringBuffer(st.nextToken());
        int a = Integer.parseInt(sb1.reverse().toString());
        StringBuffer sb2 = new StringBuffer(st.nextToken());
        int b = Integer.parseInt(sb2.reverse().toString());
        
        if(a > b) {
            bw.write(a+"");
        } else {
            bw.write(b+""); 
        }
        
        bw.flush();
        bw.close();
    }
}