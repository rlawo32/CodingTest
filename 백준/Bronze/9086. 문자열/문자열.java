import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int len = Integer.parseInt(br.readLine());
        
        for(int i=0; i<len; i++) {
            String S = br.readLine();
            bw.write(S.substring(0, 1)+S.substring(S.length()-1)+"\n");
        }
        br.close();
        bw.flush();    
        bw.close();  
    }
}