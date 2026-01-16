import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=n; i++) {
            String star = "";
            for(int j=0; j<i; j++) {
                star += "*";
            }
            sb.append(star).append("\n");
        }
        System.out.print(sb);
    }
}