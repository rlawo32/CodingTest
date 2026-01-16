import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=n; i>=1; i--) {
            for(int x=0; x<(i-1); x++) {
                sb.append(" ");
            }
            for(int y=0; y<=(n-i); y++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}