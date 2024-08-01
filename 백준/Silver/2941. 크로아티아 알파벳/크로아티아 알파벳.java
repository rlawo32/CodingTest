import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String str = br.readLine();
        br.close();
        for(String s : arr) {
            str = str.replace(s, "*");
        }
        bw.write(str.length()+"");
        bw.flush();
        bw.close();
    }
}