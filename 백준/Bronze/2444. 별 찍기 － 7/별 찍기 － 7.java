import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = n-1;
        int r = n+m;
        boolean t = false;
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<r; i++) {
            for(int j=0; j<m; j++) {
                sb.append(" ");
            }
            for(int j=0; j<r-(m*2); j++) {
                sb.append("*");
            }
            sb.append("\n");
            if(m == 0) {
                t = true;
            }
            
            if(t) {
                m++;
            } else {
                m--;
            }
        }
        System.out.print(sb);
    }
}