import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = 0;
        if(a>0&&b>0) {
            c = 1;
        } else if(a<0&&b<0) {
            c = 3;
        } else if(a>0&&b<0) {
            c = 4;
        } else {
            c = 2;
        }
        System.out.print(c);
    }
}