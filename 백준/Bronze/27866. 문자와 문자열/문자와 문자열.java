import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine();
        int i = Integer.parseInt(br.readLine());
        
        br.close();
        
        bw.write(S.substring(i-1, i));
        bw.flush();
        bw.close();
    }
}