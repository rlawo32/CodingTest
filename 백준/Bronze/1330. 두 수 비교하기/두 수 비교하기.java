import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        String c = "";
        if(a>b) {
            c = ">";
        } else if(a<b) {
            c = "<";
        } else {
            c = "==";
        }
        System.out.print(c);
    }
}