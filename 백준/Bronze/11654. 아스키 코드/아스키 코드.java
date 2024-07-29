import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String S = br.readLine();
        char c = S.charAt(0);
        br.close();
        int i = c;
        bw.write(i+"");
        bw.flush();
        bw.close();
    }
}