import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();
        String[] c = b.split("");
        
        StringBuilder sb = new StringBuilder();
        for(int i=c.length-1; i>=0; i--) {
            sb.append(a*Integer.parseInt(c[i])).append("\n");    
        }
        sb.append(a*Integer.parseInt(b)).append("\n");
        System.out.print(sb);
    }
}