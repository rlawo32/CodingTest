import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int len = Integer.parseInt(br.readLine());
        String S = br.readLine();
        int sum = 0;
        for(int i=0; i<len; i++) {
            sum += Integer.parseInt(S.substring(i, i+1));
        }
        br.close();
        bw.write(sum+"");
        bw.flush();
        bw.close();
    }
}