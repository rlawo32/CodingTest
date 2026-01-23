import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] cr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for(int i=0; i<cr.length; i++) {
            s = s.replace(cr[i], "*");
        }
        System.out.print(s.length());
    }
}