import java.io.*;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 
                      'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        String S = br.readLine();
        br.close();
        for(char c : arr) {
            int i = S.indexOf(c+"");
            if(i != -1) {
                bw.write(i+" ");
            } else {
                bw.write("-1 ");
            }
        }
        bw.flush();
        bw.close();
    }
}