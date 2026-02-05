import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = 1;
        int cnt = 0;
        while (n > m) {
            cnt++;
            m += 6 * cnt;
        }
        System.out.print(cnt+1);
    }
}